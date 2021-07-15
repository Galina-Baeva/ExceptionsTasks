package FourthTask;

public class ThirdException extends Exception {
    protected String exceptionMsg;

    public ThirdException(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }
}
