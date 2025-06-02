package cse303java.langPackage;

public class Student {
    String name;
    int rollNo;
    double marks;
    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    //overriding toString method
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }
    //overriding equals method  
    @Override 
    public boolean equals(Object obj) {
        Student temp = (Student) obj;
        return this.name.equals(temp.name) && this.rollNo == temp.rollNo && this.marks == temp.marks;
    }
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101, 85.5);
        Student student2 = new Student("Bob", 102, 90.0);
        Student student3 = new Student("Alice", 101, 85.5);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("student1 equals student2: " + student1.equals(student2));
        System.out.println("student1 equals student3: " + student1.equals(student3));
    }
}
