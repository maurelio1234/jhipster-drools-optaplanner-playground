package playground.music.service.dto.optaplanner;

public class PlayingSlot {
    private int totalAllocatedSlot;

    public int getTotalAllocatedSlot() {
        return totalAllocatedSlot;
    }

    public void setTotalAllocatedSlot(int totalAllocatedSlot) {
        this.totalAllocatedSlot = totalAllocatedSlot;
    }

    @Override
    public String toString() {
        return "PlayingSlot{" +
            "totalAllocatedSlot=" + totalAllocatedSlot +
            '}';
    }
}
