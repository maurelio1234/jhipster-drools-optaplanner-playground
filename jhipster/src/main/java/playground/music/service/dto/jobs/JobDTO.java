package playground.music.service.dto.jobs;

public class JobDTO {
    private String jobId;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public String toString() {
        return "JobDTO{" +
            "jobId='" + jobId + '\'' +
            '}';
    }
}
