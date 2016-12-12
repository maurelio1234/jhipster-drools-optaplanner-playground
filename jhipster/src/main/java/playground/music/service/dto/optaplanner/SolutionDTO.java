package playground.music.service.dto.optaplanner;

import com.fasterxml.jackson.annotation.JsonInclude;
import playground.music.service.dto.jobs.SongDTO;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SolutionDTO {
    private List<SongDTO> songList;
    private PlayingSlotDTO playingSlot;
    private HardSoftScoreDTO score;
    private List<PlayingSlotDTO> problemFacts;
    private List<Boolean> booleanRange;

    public List<SongDTO> getSongList() {
        return songList;
    }

    public void setSongList(List<SongDTO> songList) {
        this.songList = songList;
    }

    public PlayingSlotDTO getPlayingSlot() {
        return playingSlot;
    }

    public void setPlayingSlot(PlayingSlotDTO playingSlot) {
        this.playingSlot = playingSlot;
    }

    public HardSoftScoreDTO getScore() {
        return score;
    }

    public void setScore(HardSoftScoreDTO score) {
        this.score = score;
    }

    public List<PlayingSlotDTO> getProblemFacts() {
        return problemFacts;
    }

    public void setProblemFacts(List<PlayingSlotDTO> problemFacts) {
        this.problemFacts = problemFacts;
    }

    public List<Boolean> getBooleanRange() {
        return booleanRange;
    }

    public void setBooleanRange(List<Boolean> booleanRange) {
        this.booleanRange = booleanRange;
    }

    @Override
    public String toString() {
        return "SolutionDTO{" +
            "songList=" + songList +
            ", playingSlot=" + playingSlot +
            ", score=" + score +
            ", problemFacts=" + problemFacts +
            ", booleanRange=" + booleanRange +
            '}';
    }
}
