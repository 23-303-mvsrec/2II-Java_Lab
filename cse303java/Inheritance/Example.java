//Java PrograM on Hierachial Inheritance Example
import java.util.Scanner;
class Person{
	int aadhaar;
	String name;
	int phno;
	void getPerson(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name = sc.next();
		System.out.print("Enter Aadhaar no: ");
		aadhaar = sc.nextInt();
		System.out.print("Enter Phone no: ");
		phno = sc.nextInt();
	}
	void putPerson(){
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.print("\nName :"+name+"\nAadhaar no: "+aadhaar+"\nPhone no: "+phno);
	}
}
class Employee extends Person{
	int id;
	double hra,da,baseSal,totalSal;
	void getEmp(){
		this.getPerson();
		Scanner sc = new Scanner(System.in);
                System.out.print("Enter your Employee ID: ");
                id = sc.nextInt();
		System.out.print("Enter base salary: ");
                baseSal = sc.nextDouble();
		hra = (0.4) * baseSal;
                da = (0.7) * baseSal;

	}
	double calSal(){
		totalSal = baseSal + hra +da;
		return totalSal;
	}
	void putEmp(){
		super.putPerson();
		System.out.println("***********************Employee Details******************");
		System.out.print("\nEmployee ID: "+id+"\nBase Salary: "+baseSal+"\nhra: "+hra+"\nda: "+da+"\nTotal Salary: "+calSal());
		System.out.println("\n-----------------------------------------------------------------------------------");
	}
}
class Student extends Person{
	int rno,m1,m2,m3,totalMarks;
	void getStud(){
		this.getPerson();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Rollno: ");
		rno = sc.nextInt();
		System.out.print("Enter your marks in Subject1: ");
                m1 = sc.nextInt();
		System.out.print("Enter your marks in Subject2: ");
                m2 = sc.nextInt();
		System.out.print("Enter your marks in Subject3: ");
                m3 = sc.nextInt();
	}
	void calTotalMarks(){
		totalMarks = m1+m2+m3;
	}
	void putStud(){
		putPerson();
		calTotalMarks();
                System.out.print("\nStudent Rollno: "+rno+"\nmarks in subject1: "+m1+"\nMarks in subject2: "+m2+"\nMarks in subject3: "+m3+"\nTotal Marks: "+totalMarks);
		System.out.println("\n-----------------------------------------------------------------------------------");
	}

}
class Example{
	public static void main(String[] args){
		Employee e1 = new Employee();
		Student s1 = new Student();

		System.out.println("Enter Employee Details:");
		e1.getEmp();
		//System.out.println("**********************Employee Details******************");
		e1.putEmp();

		System.out.println("Enter Student Details: ");
		s1.getStud();
	//	System.out.println("***********************Student Details******************");
		s1.putStud();
	}
}
