package FourthTask;

import java.util.Scanner;

public class DemoException {
    public static void myMethod(int age) throws Exception {
        if (age < 18) {
            throw new FirstException("You are under the age");

        } else if (age > 65) {
            throw new SecondException("You'd better be more careful in your age");
        } else if (age == 40){
            throw new ThirdException("You can not go at age of 40");
        }
        else {
            System.out.println("You are good to go");
        }

    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your age: ");
            int n = scanner.nextInt();
            myMethod(n);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
