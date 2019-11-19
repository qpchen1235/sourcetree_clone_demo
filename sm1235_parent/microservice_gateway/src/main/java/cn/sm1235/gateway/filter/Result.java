package cn.sm1235.gateway.filter;
//封装响应数据
public class Result {
    private Boolean flag;
    private String message;

    public Result() {
    }

    public Result(Boolean flag, String messages) {
        this.flag = flag;
        this.message = messages;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getMessages() {
        return message;
    }

    public void setMessages(String messages) {
        this.message = messages;
    }
}
