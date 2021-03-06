package playground.music.service.dto.optaplanner;

public class JobCreationResponseDTO {
    private String type;
    private String msg;
    private ResultDTO result;

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

    public ResultDTO getResult() {
        return result;
    }

    public void setResult(ResultDTO result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "JobCreationResponseDTO{" +
            "type='" + type + '\'' +
            ", msg='" + msg + '\'' +
            ", result=" + result +
            '}';
    }
}
