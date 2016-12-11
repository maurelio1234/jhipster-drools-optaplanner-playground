package playground.music.service.dto;

import java.util.List;

public class JobResultDTO {
    List<String> songNames;
    boolean finished;

    public List<String> getSongNames() {
        return songNames;
    }

    public void setSongNames(List<String> songNames) {
        this.songNames = songNames;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "JobResultDTO{" +
            "songNames=" + songNames +
            ", finished=" + finished +
            '}';
    }
}
