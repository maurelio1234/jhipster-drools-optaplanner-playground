package playground.music.service.dto.jobs;

public class JobDTO {
    private String jobId;
    private long timeout;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    @Override
    public String toString() {
        return "JobDTO{" +
            "jobId='" + jobId + '\'' +
            ", timeout=" + timeout +
            '}';
    }
}
