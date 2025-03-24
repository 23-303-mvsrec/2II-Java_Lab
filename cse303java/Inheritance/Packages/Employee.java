package person;
import java.util.Scanner;
public class Employee {
	int aadhaar;
	String name;
	int phno;
	int id;
	double hra,da,baseSal,totalSal;
	public void getEmp(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name = sc.next();
		System.out.print("Enter Aadhaar no: ");
		aadhaar = sc.nextInt();
		System.out.print("Enter Phone no: ");
		phno = sc.nextInt();
                System.out.print("Enter your Employee ID: ");
                id = sc.nextInt();
		System.out.print("Enter base salary: ");
                baseSal = sc.nextDouble();
		hra = (0.1) * baseSal;
                da = (0.08) * baseSal;

	}
	public double calSal(){
		totalSal = baseSal + hra +da;
		return totalSal;
	}
	public void putEmp(){
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.print("\nName :"+name+"\nAadhaar no: "+aadhaar+"\nPhone no: "+phno);
		System.out.println("***********************Employee Details******************");
		System.out.print("\nEmployee ID: "+id+"\nBase Salary: "+baseSal+"\nhra: "+hra+"\nda: "+da+"\nTotal Salary: "+calSal());
		System.out.println("\n-----------------------------------------------------------------------------------");
	}
}
