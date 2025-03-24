import java.util.Scanner;
class Object{
	int x;
	public static void main(String args[]){
		Object obj = new Object();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x =");
		obj.x = sc.nextInt();
		System.out.println("x = "+obj.x);
	}
}

