package playground.music.service.dto.optaplanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SetListSolutionDTO {
    @JsonProperty("playground.music.SetListSolution")
    private
    SolutionDTO setListSolution;

    public SolutionDTO getSetListSolution() {
        return setListSolution;
    }

    public void setSetListSolution(SolutionDTO setListSolution) {
        this.setListSolution = setListSolution;
    }

    @Override
    public String toString() {
        return "SetListSolutionDTO{" +
            "setListSolution=" + setListSolution +
            '}';
    }
}
