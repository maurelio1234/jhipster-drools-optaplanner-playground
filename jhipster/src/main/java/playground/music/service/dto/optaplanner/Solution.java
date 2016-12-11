package playground.music.service.dto.optaplanner;

import com.fasterxml.jackson.annotation.JsonInclude;
import playground.music.service.dto.jobs.SongDTO;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Solution {
    private List<SongDTO> songList;
    private PlayingSlot playingSlot;
    private HardSoftScore score;
    private List<PlayingSlot> problemFacts;
    private List<Boolean> booleanRange;

    public List<SongDTO> getSongList() {
        return songList;
    }

    public void setSongList(List<SongDTO> songList) {
        this.songList = songList;
    }

    public PlayingSlot getPlayingSlot() {
        return playingSlot;
    }

    public void setPlayingSlot(PlayingSlot playingSlot) {
        this.playingSlot = playingSlot;
    }

    public HardSoftScore getScore() {
        return score;
    }

    public void setScore(HardSoftScore score) {
        this.score = score;
    }

    public List<PlayingSlot> getProblemFacts() {
        return problemFacts;
    }

    public void setProblemFacts(List<PlayingSlot> problemFacts) {
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
        return "Solution{" +
            "songList=" + songList +
            ", playingSlot=" + playingSlot +
            ", score=" + score +
            ", problemFacts=" + problemFacts +
            ", booleanRange=" + booleanRange +
            '}';
    }
}
