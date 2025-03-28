package exception_handling.nested_trycatch;

import java.util.Scanner;

public class Nested_Try_Catch {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter index: ");
            int index = scanner.nextInt();
            try {
                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();
                System.out.println("Result: " + (arr[index] / divisor));
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } finally {
            scanner.close();
        }
    }
}
