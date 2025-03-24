import java.util.Scanner;

class Switch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.next();
        sc.nextLine();

        System.out.println("Name = " + name);
        System.out.println("Tax based on annual income:");
        System.out.println("1. <5 LPA");
        System.out.println("2. >5 LPA and <10 LPA");
        System.out.println("3. >10 LPA");
        System.out.println("Choose an option:");

        int x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.println("No tax");
                break;
            case 2:
                System.out.println("Tax 10%");
                break;
            case 3:
                System.out.println("Tax 15%");
                break;
            default:
                System.out.println("Wrong input");
        }

        sc.close(); 
    }
}

