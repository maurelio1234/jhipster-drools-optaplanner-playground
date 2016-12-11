package playground.music.service.dto;

import java.util.List;

public class JobRequestDTO {
    private List<SongDTO> songs;
    private int totalAllocatedSlot;

    public List<SongDTO> getSongs() {
        return songs;
    }

    public void setSongs(List<SongDTO> songs) {
        this.songs = songs;
    }

    public int getTotalAllocatedSlot() {
        return totalAllocatedSlot;
    }

    public void setTotalAllocatedSlot(int totalAllocatedSlot) {
        this.totalAllocatedSlot = totalAllocatedSlot;
    }

    @Override
    public String toString() {
        return "JobRequestDTO{" +
            "songs=" + songs +
            ", totalAllocatedSlot=" + totalAllocatedSlot +
            '}';
    }
}
