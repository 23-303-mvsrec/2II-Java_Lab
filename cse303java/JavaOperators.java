import java.util.Scanner;
public class JavaOperators{
	public static void main(String args[]){
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:- ");
		a = sc.nextInt();
		b = sc.nextInt();

		//Relational Operators
		System.out.println("\n-----------Relational Operators-----------");
		System.out.println(a +"=="+b+":"+(a == b));
		System.out.println(a +"!="+b +":"+(a != b));
		System.out.println(a +">"+b +":"+(a > b));
		System.out.println(a +"<"+b +":"+(a < b));
		System.out.println(a +">="+b+ ":"+(a >= b));
		System.out.println(a +"<="+b+ ":"+(a <= b));

		//Logical Operators
		boolean x,y;
		System.out.println("Enter two boolean values");
		x = sc.nextBoolean();
		y = sc.nextBoolean();
		System.out.println("\n-----------Logical Operators------------");
		System.out.println(x +"&&"+y +":"+(x && y));
		System.out.println(x +"||"+y +":"+(x || y));
		System.out.println("!"+x +":"+(!x));

		//Bitwise Operators
		System.out.println("\n------------Bitwise Operators----------");
		System.out.println(a +" & " +b+ ":"+(a & b));
		System.out.println(a +"|"+b +":"+(a | b));
		System.out.println(a +"^"+b +":"+(a ^ b));
		System.out.println("~"+a+":"+(~a));

		//Shift Operators
		System.out.println("\n-----------Shift Operators");
		System.out.println(a +"<< 2:"+(a << 2));
		System.out.println(a +">> 2:"+(a >> 2));
		System.out.println(a +">>> 2:"+(a >>> 2));
		//System.out.println(a +"=="+b ":"+(a == b));
	}
}
