package ThirdTask;

public class Demo {
    public static void printMsg() throws CustomException {
        throw new CustomException("an exception");
    }

    public static void main(String[] args) {
        try {
            printMsg();

        } catch (CustomException e) {
            System.out.println("This method trows " + e.getExceptionMsg());
            e.printStackTrace();
        }
    }


}
