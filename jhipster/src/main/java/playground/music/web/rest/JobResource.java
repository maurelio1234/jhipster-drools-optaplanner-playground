package playground.music.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import playground.music.service.dto.jobs.JobDTO;
import playground.music.service.dto.jobs.JobRequestDTO;
import playground.music.service.dto.jobs.JobResultDTO;
import playground.music.service.dto.jobs.SongDTO;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class JobResource {
    private final Logger log = LoggerFactory.getLogger(JobResource.class);

    private static long JOB_TIME = 30000;
    private static Random random = new Random();

    private HashMap<String, JobDTO> jobs = new HashMap<>();
    private HashMap<String, Long> timeouts = new HashMap<>();
    private HashMap<String, List<String>> songs = new HashMap<String, List<String>>();

    @PostMapping("/jobs")
    public ResponseEntity<JobDTO> createJob(@RequestBody JobRequestDTO jobRequest) {
        log.debug("REST request to create job : {}", jobRequest);

        String jobId = UUID.randomUUID().toString();

        JobDTO job = new JobDTO();

        job.setJobId(jobId);
        job.setTimeout(JOB_TIME);

        jobs.put(jobId, job);
        timeouts.put(jobId, System.currentTimeMillis() + JOB_TIME);
        songs.put(jobId, jobRequest.getSongs().stream().map(SongDTO::getName).collect(Collectors.toList()));

        return ResponseEntity.ok(job);
    }

    @GetMapping("/jobs/{jobId}")
    public ResponseEntity<JobResultDTO> getJob(@PathVariable String jobId) {
        if (jobs.containsKey(jobId)) {
            JobResultDTO jobResult = new JobResultDTO();
            jobResult.setSongNames(new ArrayList<>());
            jobResult.setFinished(System.currentTimeMillis() > timeouts.get(jobId));

            for (String songName : songs.get(jobId)) {
                if (random.nextBoolean()) {
                    jobResult.getSongNames().add(songName);
                }
            }
            return ResponseEntity.ok(jobResult);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
