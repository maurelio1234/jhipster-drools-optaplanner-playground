package playground.music.service.dto.optaplanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultDTO {

    @JsonProperty("solver-instance")
    private
    JobResultSolverInstanceDTO solverInstance;

    public JobResultSolverInstanceDTO getSolverInstance() {
        return solverInstance;
    }

    public void setSolverInstance(JobResultSolverInstanceDTO solverInstance) {
        this.solverInstance = solverInstance;
    }

    @Override
    public String toString() {
        return "ResultDTO{" +
            "solverInstance=" + solverInstance +
            '}';
    }
}
