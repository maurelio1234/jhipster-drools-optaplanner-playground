package playground.music.service.dto.optaplanner;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JobResultSolverInstance {
    private String status;
    @JsonProperty("container-id")
    private
    String containerId;
    @JsonProperty("solver-id")
    private
    String solverId;
    @JsonProperty("solver-config-file")
    private
    String solverConfigFile;

    private Score score;
    @JsonProperty("best-solution")
    private SetListSolution bestSolution;
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public String getSolverId() {
        return solverId;
    }

    public void setSolverId(String solverId) {
        this.solverId = solverId;
    }

    public String getSolverConfigFile() {
        return solverConfigFile;
    }

    public void setSolverConfigFile(String solverConfigFile) {
        this.solverConfigFile = solverConfigFile;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public SetListSolution getBestSolution() {
        return bestSolution;
    }

    public void setBestSolution(SetListSolution bestSolution) {
        this.bestSolution = bestSolution;
    }

    @Override
    public String toString() {
        return "JobResultSolverInstance{" +
            "status='" + status + '\'' +
            ", containerId='" + containerId + '\'' +
            ", solverId='" + solverId + '\'' +
            ", solverConfigFile='" + solverConfigFile + '\'' +
            ", score=" + score +
            ", bestSolution=" + bestSolution +
            '}';
    }
}
