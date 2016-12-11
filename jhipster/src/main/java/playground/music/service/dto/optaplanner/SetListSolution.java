package playground.music.service.dto.optaplanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SetListSolution {
    @JsonProperty("playground.music.SetListSolution")
    private
    Solution setListSolution;

    public Solution getSetListSolution() {
        return setListSolution;
    }

    public void setSetListSolution(Solution setListSolution) {
        this.setListSolution = setListSolution;
    }

    @Override
    public String toString() {
        return "SetListSolution{" +
            "setListSolution=" + setListSolution +
            '}';
    }
}
