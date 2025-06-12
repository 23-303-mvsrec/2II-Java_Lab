import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;
    private int mobileNo;
    
    public Person(String name, int age, int mobileNo) {
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
    }
    
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Mobile: " + mobileNo;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        try {
            Person p1 = new Person("John", 25, 123456);
            Person p2 = new Person("Jane", 22, 987654);
            
            FileOutputStream fos = new FileOutputStream("person.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.close();
            
            FileInputStream fis = new FileInputStream("person.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person p3 = (Person)ois.readObject();
            Person p4 = (Person)ois.readObject();
            ois.close();
            
            System.out.println(p3);
            System.out.println(p4);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
