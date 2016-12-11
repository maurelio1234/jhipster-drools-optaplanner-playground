package playground.music.service.dto.optaplanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {

    @JsonProperty("solver-instance")
    private
    JobResultSolverInstance solverInstance;

    public JobResultSolverInstance getSolverInstance() {
        return solverInstance;
    }

    public void setSolverInstance(JobResultSolverInstance solverInstance) {
        this.solverInstance = solverInstance;
    }

    @Override
    public String toString() {
        return "Result{" +
            "solverInstance=" + solverInstance +
            '}';
    }
}
