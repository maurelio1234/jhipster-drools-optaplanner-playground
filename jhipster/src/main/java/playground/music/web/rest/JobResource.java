package playground.music.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import playground.music.service.dto.jobs.JobDTO;
import playground.music.service.dto.jobs.JobRequestDTO;
import playground.music.service.dto.jobs.JobResultDTO;
import playground.music.service.dto.optaplanner.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class JobResource {
    private static String KIE_SERVER_ENDPOINT = "http://localhost:9090/kie-server-6.5.0.Final-webc/";
    private static String AUTHORIZATION_TOKEN = "Basic a2llc2VydmVyOmtpZXNlcnZlcg==";

    private final Logger log = LoggerFactory.getLogger(JobResource.class);

    @PostMapping("/jobs")
    public ResponseEntity<JobDTO> createJob(@RequestBody JobRequestDTO jobRequest) {
        log.debug("REST request to create job : {}", jobRequest);

        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("authorization", AUTHORIZATION_TOKEN);
        headers.add("x-kie-contenttype", "application/json");

        RestTemplate restTemplate = new RestTemplate();
        PlannerRequestDTO request = getPlannerRequestDTO(jobRequest);
        HttpEntity<PlannerRequestDTO> entity = new HttpEntity<>(request, headers);

        // TODO handle server side errors when create the container
        // TODO maybe separate the KIE server from this one by a microservice
        //      to loadbalance requests to different containers/solvers
        restTemplate.postForLocation(KIE_SERVER_ENDPOINT
            + "services/rest/server/containers/music/solvers/setlist", entity);

        JobDTO job = new JobDTO();

        // For now we only support one user at a time
        job.setJobId("1234");
        return ResponseEntity.ok(job);
    }

    @GetMapping("/jobs/{jobId}")
    public ResponseEntity<JobResultDTO> getJob(@PathVariable String jobId) {
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("authorization", AUTHORIZATION_TOKEN);
        headers.add("x-kie-contenttype", "application/json");

        HttpEntity entity = new HttpEntity(headers);
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<PlannerResponseDTO> response = restTemplate.exchange(KIE_SERVER_ENDPOINT
            + "services/rest/server/containers/music/solvers/setlist/bestsolution",
            HttpMethod.GET,
            entity,
            PlannerResponseDTO.class);

        // TODO handle errors from solver side
        return ResponseEntity.ok(getJobResultDTO(response.getBody()));
    }

    private PlannerRequestDTO getPlannerRequestDTO(JobRequestDTO jobRequest) {
        PlannerRequestDTO request = new PlannerRequestDTO();
        request.setStatus("SOLVING");
        PlanningProblemDTO planningProblem = new PlanningProblemDTO();
        request.setPlanningProblem(planningProblem);

        SolutionDTO solution = new SolutionDTO();
        planningProblem.setSolution(solution);

        PlayingSlotDTO playingSlot = new PlayingSlotDTO();
        playingSlot.setTotalAllocatedSlot(jobRequest.getTotalAllocatedSlot());
        solution.setPlayingSlot(playingSlot);
        solution.setSongList(jobRequest.getSongs());

        return request;
    }

    private JobResultDTO getJobResultDTO(PlannerResponseDTO body) {
        JobResultDTO result = new JobResultDTO();
        result.setFinished(!"SOLVING".equals(body.getType()));
        result.setSongNames(body
            .getResult()
            .getSolverInstance()
            .getBestSolution()
            .getSetListSolution()
            .getSongList()
            .stream()
            .filter(song -> song.getInSetList().booleanValue())
            .map(song -> song.getName())
            .collect(Collectors.toList()));
        return result;
    }
}
