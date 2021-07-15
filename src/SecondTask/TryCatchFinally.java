package SecondTask;

public class TryCatchFinally {
    public TryCatchFinally(String arg){
        arg = "Start";
        System.out.println(arg);
    }
    public static void main(String[] args) throws Exception{
        try{
            throw new Exception("There is an exception");
        }
        catch (Exception e){
            e.getMessage();
        }
        finally {
            System.out.println("Hello world");
        }
    }
}
