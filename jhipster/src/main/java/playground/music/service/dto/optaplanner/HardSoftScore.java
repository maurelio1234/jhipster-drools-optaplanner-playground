package playground.music.service.dto.optaplanner;

public class HardSoftScore {
    private int hardScore;
    private int softScore;
    private boolean feasible;

    public int getHardScore() {
        return hardScore;
    }

    public void setHardScore(int hardScore) {
        this.hardScore = hardScore;
    }

    public int getSoftScore() {
        return softScore;
    }

    public void setSoftScore(int softScore) {
        this.softScore = softScore;
    }

    public boolean isFeasible() {
        return feasible;
    }

    public void setFeasible(boolean feasible) {
        this.feasible = feasible;
    }

    @Override
    public String toString() {
        return "HardSoftScore{" +
            "hardScore=" + hardScore +
            ", softScore=" + softScore +
            ", feasible=" + feasible +
            '}';
    }
}
