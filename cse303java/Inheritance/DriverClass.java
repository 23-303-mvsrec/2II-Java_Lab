//Java Program on Hierarchial Inheritance 
class Person{
        int aadharno,phno;
        String name;
        Person(int a,String n, int p){
                aadharno = a;
                name = n;
                phno = p;
        }
	void display(){
		System.out.println("Aadhaar no: "+aadharno+"\nName: "+name+"\nPhone no: "+phno);
	}
}
class Employee extends Person{
        double baseSal;
        double hra,da,totalSal;
        Employee(int a,String n,int p,double b){
		super(a,n,p);
		baseSal = b;
        }
        void salaryDetails(){
                hra = (0.4) * baseSal;
                da = (0.7) * baseSal;
	}
        void display(){
		super.display();
		salaryDetails();
		totalSal =(baseSal+hra+da);
		System.out.println("Base Salary: "+baseSal+"\nHRA: "+hra+"\nDA: "+da+"Total Salary: "+totalSal);
	}
}
class Student extends Person{
        int rno,m1,m2,m3;
        Student(int a,String n,int p,int rno, int m1,int m2, int m3){
                super(a,n,p);
		this.rno = rno;
                this.m1 = m1;
                this.m2 = m2;
                this.m3 = m3;
        }
	void totalMarks(){
		int total =(m1+m2+m3);
		System.out.println("Total marks scored by the Student: "+total);
	}
	void display(){
		super.display();
                System.out.println("m1: "+m1+"\nm2: "+m2+"\nm3: "+m3);
		totalMarks();
        }

        //method cal total marks
}
public class DriverClass{
	public static void main(String args[]){
		Student s1 = new Student(12345,"Vamshidhar",834,302,100,100,100);
		Employee e1 = new Employee(2345,"John",732,2300);
		s1.display();
		e1.display();
	}
}
