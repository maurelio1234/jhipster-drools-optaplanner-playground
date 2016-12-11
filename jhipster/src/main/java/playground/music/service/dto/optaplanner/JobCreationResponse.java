package playground.music.service.dto.optaplanner;

public class JobCreationResponse {
    private String type;
    private String msg;
    private Result result;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "JobCreationResponse{" +
            "type='" + type + '\'' +
            ", msg='" + msg + '\'' +
            ", result=" + result +
            '}';
    }
}
