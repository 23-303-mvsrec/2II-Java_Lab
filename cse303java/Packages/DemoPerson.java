import person.Employee;
import person.Student;

public class DemoPerson{
	public static void main(String... args){
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
