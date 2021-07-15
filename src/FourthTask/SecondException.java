package FourthTask;

public class SecondException extends Exception {
    protected String exceptionMsg;

    public SecondException(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }
}
