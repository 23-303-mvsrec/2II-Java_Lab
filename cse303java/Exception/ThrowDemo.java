//Java program to demonstrate the use of throw statement
import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter Dividend: ");
        a = scanner.nextInt();
        while (true) {
            System.out.println("Enter the divisor: ");
            b = scanner.nextInt();
            try {
                if(b == 0) {
                    throw new ArithmeticException("Divisor cannot be zero");
                } else {
                    c = a / b;
                    System.out.println("Result: " + c);
                    break; // Exit the loop if division is successful
                }
            }
            catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter a non-zero divisor.");
            }
        }
    }
}

