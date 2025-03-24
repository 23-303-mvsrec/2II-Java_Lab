import java.util.Scanner;
public class Student{
	int rno;
	String name;
	int marks[] = new int[3];
	void getStudent(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student rollno:- ");
		rno = sc.nextInt();
		System.out.print("Enter name of the Student:- ");
		name = sc.next();
		System.out.print("Enter marks of the Student:-  ");
		for(int i=0;i<marks.length;i++){
			marks[i] = sc.nextInt();
		}
	}
	int calTotal(){
		int sum =0;
		for(int m:marks)
			sum += m;
		return sum;
	}
	void displayStudent(){
		System.out.println("-------------------Details of Student--------------");
		System.out.println("Rollno: "+rno+"\nName :"+name+"\nmarks:");
		for(int m:marks)
			System.out.print(m+" ");
		System.out.println("Total marks: "+calTotal());
	}
	public static void main(String[] args){
		Student s[] = new Student[3];
		for(int i=0;i<s.length;i++)
			s[i] = new Student();

		for(Student x: s)
			x.getStudent();

		for(Student x:s)
			x.displayStudent();

	}
}
