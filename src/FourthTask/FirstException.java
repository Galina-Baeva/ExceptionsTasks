package FourthTask;

public class FirstException extends Exception {
    protected String exceptionMsg;

    public FirstException(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }

}
