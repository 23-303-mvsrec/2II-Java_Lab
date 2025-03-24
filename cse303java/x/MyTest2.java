// Java Program to demonstrate Classes and Objects
import java.util.Scanner; // For user input

public class MyTest2 {
    int a, b; // Instance variables

    // Default constructor
    public MyTest2() { 
        a = 5; 
        b = 6; 
    }

    // Parameterized constructor
    public MyTest2(int x, int y) { 
        a = x; 
        b = y; 
    }

    // Display values of a and b
    void show() { 
        System.out.println("a = " + a + "\nb = " + b); 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Scanner for input

        MyTest2 m = new MyTest2(); // Create instance using default constructor
        System.out.println("Default values of a and b\na = " + m.a + "\nb = " + m.b);
        
        // User input for a and b
        System.out.print("Enter value of a and b: ");
        m.a = sc.nextInt(); 
        m.b = sc.nextInt(); 
        System.out.println("Providing values of a and b through console\na = " + m.a + "\nb = " + m.b);

        // Using default constructor to set values
        System.out.println("\nProviding values of a and b through default constructor: ");
        MyTest2 m1 = new MyTest2(); 
        m1.show(); 

        // Using parameterized constructor
        System.out.println("\nProviding values of a and b through parameterized constructor:");
        MyTest2 m2 = new MyTest2(15, 16); 
        m2.show(); 

        sc.close(); // Close scanner
    }
}
