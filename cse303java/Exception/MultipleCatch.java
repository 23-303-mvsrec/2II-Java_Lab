class MultipleCatch {
    public static void main(String[] args) {
        System.out.println("Main method started");
        int a = 5, b = 0, c = 0;
        int arr[] = { 10, 20, 30 };
        String str = "akshay";
        try {
            c = a / b;
            System.out.println("Result: " + c);
            System.out.println(arr[5]); // This will cause an ArrayIndexOutOfBoundsException
            System.out.println(str.charAt(5)); // This will cause a StringIndexOutOfBoundsException
            int k = Integer.parseInt(args[0]); // This will cause a NumberFormatException
            System.out.println("Parsed integer: " + k);
            System.out.println("After error in try block");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Main method ended");
    }
}
