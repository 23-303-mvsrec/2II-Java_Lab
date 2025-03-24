import java.util.Scanner;

class LargeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        if ((x > y) && (x > z)) { 
            System.out.println(x + " is greater");
        } else if (y > z) {
            System.out.println(y + " is greater");
        } else {
            System.out.println(z + " is greater");
        }

        sc.close();
    }
}

