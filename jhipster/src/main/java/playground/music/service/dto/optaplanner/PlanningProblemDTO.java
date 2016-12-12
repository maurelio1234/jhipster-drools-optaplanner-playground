package playground.music.service.dto.optaplanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlanningProblemDTO {
    @JsonProperty("playground.music.SetListSolution")
    private
    SolutionDTO solution;

    public SolutionDTO getSolution() {
        return solution;
    }

    public void setSolution(SolutionDTO solution) {
        this.solution = solution;
    }
}
