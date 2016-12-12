package playground.music.service.dto.optaplanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScoreDTO {
    @JsonProperty("org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore")
    private
    HardSoftScoreDTO hardSoftScore;

    public HardSoftScoreDTO getHardSoftScore() {
        return hardSoftScore;
    }

    public void setHardSoftScore(HardSoftScoreDTO hardSoftScore) {
        this.hardSoftScore = hardSoftScore;
    }

    @Override
    public String toString() {
        return "ScoreDTO{" +
            "hardSoftScore=" + hardSoftScore +
            '}';
    }
}
