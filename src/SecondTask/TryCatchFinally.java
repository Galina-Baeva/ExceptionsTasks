package SecondTask;

public class TryCatchFinally {

    public static void main(String[] args) throws Exception {
        try{
            throw new Exception("There's a problem!");
        }
        catch (Exception e){
            e.getMessage();
        }
        finally {
            System.out.println("Hello world");
        }
    }
}
