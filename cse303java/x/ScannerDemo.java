import java.util.Scanner;

class ScannerDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.next();
        System.out.println("str = " + str);

        sc.nextLine(); 

        System.out.println("Enter string1:");
        String str1 = sc.nextLine();
        System.out.println("str1 = " + str1);

        System.out.println("Enter integer:");
        int x = sc.nextInt();
        System.out.println("x = " + x);

        System.out.println("Enter double:");
        double d = sc.nextDouble();
        System.out.println("d = " + d);

        System.out.println("Enter float:");
        float f = sc.nextFloat();
        System.out.println("f = " + f);

        System.out.println("Enter byte:");
        byte b = sc.nextByte();
        System.out.println("b = " + b);

        System.out.println("Enter long:");
        long l = sc.nextLong();
        System.out.println("l = " + l);

        System.out.println("Enter short:");
        short s = sc.nextShort();
        System.out.println("s = " + s);

        System.out.println("Enter boolean:");
        boolean k = sc.nextBoolean();
        System.out.println("k = " + k);

        sc.close();
    }
}

