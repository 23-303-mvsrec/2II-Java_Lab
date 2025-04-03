public class ExceptionDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;

        try {
            c = a / b; // This will cause an ArithmeticException
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Specialized Exception caught, and Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
