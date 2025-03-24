package person;
import java.util.Scanner;
public class Student{
	int aadhaar;
	String name;
	int phno;
	int rno,m1,m2,m3,totalMarks;
	public void getStud(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name = sc.next();
		System.out.print("Enter Aadhaar no: ");
		aadhaar = sc.nextInt();
		System.out.print("Enter Phone no: ");
		phno = sc.nextInt();
		System.out.print("Enter your Rollno: ");
		rno = sc.nextInt();
		System.out.print("Enter your marks in Subject1: ");
                m1 = sc.nextInt();
		System.out.print("Enter your marks in Subject2: ");
                m2 = sc.nextInt();
		System.out.print("Enter your marks in Subject3: ");
                m3 = sc.nextInt();
	}
	public void calTotalMarks(){
		totalMarks = m1+m2+m3;
	}
	public void putStud(){
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.print("\nName :"+name+"\nAadhaar no: "+aadhaar+"\nPhone no: "+phno);
		calTotalMarks();
                System.out.print("\nStudent Rollno: "+rno+"\nmarks in subject1: "+m1+"\nMarks in subject2: "+m2+"\nMarks in subject3: "+m3+"\nTotal Marks: "+totalMarks);
		System.out.println("\n-----------------------------------------------------------------------------------");
	}

}
