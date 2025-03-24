//Java Program to demonstrate Classes and Objects                                                        --2451-23-733-303
import java.util.Scanner;
public class MyTest{
	int a,b;
	void setAB(){
		a = 5;
		b = 6;
	}
	void setAB(int x,int y){
		a = x;
		b = y;
	}
	void show(){
		System.out.println("a = "+a+"\nb = "+b);
	}


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		MyTest m = new MyTest();
		System.out.println("Default values of a and b\na = "+m.a+"\nb = "+m.b);
		System.out.print("Enter value of a and b:-");
		m.a = sc.nextInt();
		m.b = sc.nextInt();
		System.out.println("Providing values of a and b through console\na = "+m.a+"\nb = "+m.b);

		System.out.println("\nProviding values of a and b through method:- ");
		MyTest m1 = new MyTest();
		m1.setAB();
		m1.show();

		System.out.println("\nProviding values of a and b through parameterized method:-");
		MyTest m2 = new MyTest();
		m2.setAB(15,16);
		m2.show();

		sc.close();
	}
}

