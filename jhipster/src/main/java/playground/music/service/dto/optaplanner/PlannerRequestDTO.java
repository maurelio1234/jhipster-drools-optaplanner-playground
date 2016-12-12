package playground.music.service.dto.optaplanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlannerRequestDTO {
    private String status;

    @JsonProperty("planning-problem")
    private
    PlanningProblemDTO planningProblem;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PlanningProblemDTO getPlanningProblem() {
        return planningProblem;
    }

    public void setPlanningProblem(PlanningProblemDTO planningProblem) {
        this.planningProblem = planningProblem;
    }

    @Override
    public String toString() {
        return "PlannerRequestDTO{" +
            "status='" + status + '\'' +
            ", planningProblem=" + planningProblem +
            '}';
    }
}
