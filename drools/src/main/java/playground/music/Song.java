package playground.music;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

@PlanningEntity
public class Song {
    @PlanningVariable(valueRangeProviderRefs = {"booleanRange"})
    private Boolean inSetList = false;
    private String name;
    private int technicalDifficuty;
    private int playingFunLevel;
    private int durationInMinutes;
    private int audienceEnjoyment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTechnicalDifficuty() {
        return technicalDifficuty;
    }

    public void setTechnicalDifficuty(int technicalDifficuty) {
        this.technicalDifficuty = technicalDifficuty;
    }

    public int getPlayingFunLevel() {
        return playingFunLevel;
    }

    public void setPlayingFunLevel(int playingFunLevel) {
        this.playingFunLevel = playingFunLevel;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getAudienceEnjoyment() {
        return audienceEnjoyment;
    }

    public void setAudienceEnjoyment(int audienceEnjoyment) {
        this.audienceEnjoyment = audienceEnjoyment;
    }

    public Boolean getInSetList() {
        return inSetList;
    }

    public void setInSetList(Boolean inSetList) {
        this.inSetList = inSetList;
    }
}
