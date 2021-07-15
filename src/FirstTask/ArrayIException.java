package FirstTask;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ArrayIException {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(20);
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = random.nextInt(1000);
        }
        System.out.println("Enter index of the element: ");
        int j = scanner.nextInt();
        try {
            System.out.println(nums[j]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The element with index " + j + " doesn't exist");
        }
    }
}
