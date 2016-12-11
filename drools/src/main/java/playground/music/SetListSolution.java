package playground.music;

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.Solution;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@PlanningSolution
public class SetListSolution implements Solution<HardSoftScore> {
    private List<Song> songList;
    private HardSoftScore score;
    private PlayingSlot playingSlot;

    @PlanningEntityCollectionProperty
    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }

    public HardSoftScore getScore() {
        return score;
    }

    public void setScore(HardSoftScore hardSoftScore) {
        this.score = hardSoftScore;
    }

    public PlayingSlot getPlayingSlot() {
        return playingSlot;
    }

    @ValueRangeProvider(id = "booleanRange")
    public List<Boolean> getBooleanRange() {
        return Arrays.asList(Boolean.FALSE, Boolean.TRUE);
    }

    public void setPlayingSlot(PlayingSlot playingSlot) {
        this.playingSlot = playingSlot;
    }

    public Collection<? extends Object> getProblemFacts() {
        List<Object> facts = new ArrayList<Object>();
        facts.add(playingSlot);
        return facts;
    }
}
