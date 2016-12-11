package playground.music.service.dto.optaplanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Score {
    @JsonProperty("org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore")
    private
    HardSoftScore hardSoftScore;

    public HardSoftScore getHardSoftScore() {
        return hardSoftScore;
    }

    public void setHardSoftScore(HardSoftScore hardSoftScore) {
        this.hardSoftScore = hardSoftScore;
    }

    @Override
    public String toString() {
        return "Score{" +
            "hardSoftScore=" + hardSoftScore +
            '}';
    }
}
