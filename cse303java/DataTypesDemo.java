import java.util.Scanner;

public class DataTypesDemo{
	public static void main(String args[]){
		int i=102;
		byte b=126;
		short s=Short.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of i:- ");
		i = sc.nextInt();
		System.out.println("int i= "+i);
		System.out.println(s);
		s = sc.nextShort();
		System.out.println(s);
	}
}

