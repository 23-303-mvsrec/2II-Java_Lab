import java.util.ArrayList;
import java.util.Comparator;

class Student{
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }
}
public class SortStudent {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student("Alice", 20, 3.5));
        al.add(new Student("Bob", 22, 3.8));
        al.add(new Student("Charlie", 21, 3.2));

        Comparator<Student> byName = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        };
        Comparator<Student> byAge = Comparator.comparingInt(Student::getAge);
        Comparator<Student> byGpa = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.getGpa(), s2.getGpa());
            }
        };
        al.sort(byName);
        System.out.println("Sorted by Name:");
        for (Student s : al) {
            System.out.println(s.getName() + ", Age: " + s.getAge() + ", GPA: " + s.getGpa());
        }
        al.sort(byAge);
        System.out.println("\nSorted by Age:"); 
        for (Student s : al) {
            System.out.println(s.getName() + ", Age: " + s.getAge() + ", GPA: " + s.getGpa());
        }
        al.sort(byGpa);
        System.out.println("\nSorted by GPA:");
        for (Student s : al) {
            System.out.println(s.getName() + ", Age: " + s.getAge() + ", GPA: " + s.getGpa());
        }
    }
}
/*
 * Sorted by Name:
Alice, Age: 20, GPA: 3.5
Bob, Age: 22, GPA: 3.8
Charlie, Age: 21, GPA: 3.2

Sorted by Age:
Alice, Age: 20, GPA: 3.5
Charlie, Age: 21, GPA: 3.2
Bob, Age: 22, GPA: 3.8

Sorted by GPA:
Charlie, Age: 21, GPA: 3.2
Alice, Age: 20, GPA: 3.5
Bob, Age: 22, GPA: 3.8

 */
