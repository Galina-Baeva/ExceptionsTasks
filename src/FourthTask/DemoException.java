package FourthTask;

import java.util.Scanner;

public class DemoException {
    public static <T> void myMethod(T age) throws Exception {
        if ((Integer) age < 18) {
            throw new FirstException("You are under the age");
        } else if ((Integer) age > 65) {
            throw new SecondException("You'd better be more careful in your age");
        } else if ((Integer) age >= 18 && (Integer) age <= 65){
            System.out.println("You are good to go");
        }
        else {
            throw new ThirdException("Invalid input of age");
        }
    }

    public static void main(String[] args) {
        try {
            //Scanner scanner = new Scanner(System.in);
            //System.out.println("Enter your age");
            int n = 200;
            myMethod(n);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
