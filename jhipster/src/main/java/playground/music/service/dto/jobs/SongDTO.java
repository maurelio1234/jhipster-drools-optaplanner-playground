package playground.music.service.dto.jobs;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SongDTO {
    private String name;
    private int technicalDifficuty;
    private int playingFunLevel;
    private int durationInMinutes;
    private int audienceEnjoyment;
    private Boolean inSetList;

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

    @Override
    public String toString() {
        return "SongDTO{" +
            "name='" + name + '\'' +
            ", technicalDifficuty=" + technicalDifficuty +
            ", playingFunLevel=" + playingFunLevel +
            ", durationInMinutes=" + durationInMinutes +
            ", audienceEnjoyment=" + audienceEnjoyment +
            '}';
    }

    public Boolean getInSetList() {
        return inSetList;
    }

    public void setInSetList(Boolean inSetList) {
        this.inSetList = inSetList;
    }
}
