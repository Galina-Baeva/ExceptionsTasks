package ThirdTask;

public class CustomException extends Exception {
    protected String exceptionMsg;

    public CustomException(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }
}
