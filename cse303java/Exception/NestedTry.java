<<<<<<< HEAD
// Java program to demonstrate nested try-catch blocks
=======
//Java program to demonstrate nested try-catch blocks                                         2451-23-733-303:wq

>>>>>>> 2a441ad (Exceptions :))
public class NestedTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            // Calculate the length of arguments; potential division by zero in the next line if a == 0.
            // int b = 42 / a; // Uncommenting this will cause ArithmeticException if a == 0.
            System.out.println("a = " + a);
            try {
                if (a == 1)
                    a /= (a - a); // Causes ArithmeticException when a == 1 (division by zero).
                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99; // Causes ArrayIndexOutOfBoundsException as index 42 is out of bounds.
                }
            } catch (ArithmeticException e) {
                System.out.println("Divide by 0: " + e);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        } catch (Exception e) {
            System.out.println("Some other exception: " + e);
        } finally {
            System.out.println("Finally block executed"); // Always executes, regardless of exceptions.
        }
    }
}
<<<<<<< HEAD
=======


>>>>>>> 2a441ad (Exceptions :))
