import java.io.*;

class Person implements Serializable{
	String name;
	int age;
	long mobileNo;
	Person(String name,int age,long mobileNo){
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
	}
}
class SerializationDemo{
	public static void main(String... args) throws IOException{
		Person p1 = new Person("Akshay",20,12345);
		Person p2 = new Person("Abhiram",20,12456);
		FileOutputStream fos = new FileOutputStream("Serializable.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p1);
		oos.writeObject(p2);
		System.out.println("Person object serialized in a file seriable text");
		oos.close();
		fos.close();
		System.out.println("Performing deserialization");
		FileInputStream fis = new FileInputStream("Serializable.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			Person p3 = (Person) ois.readObject();
			Person p4 = (Person) ois.readObject();
			System.out.println("Name: " + p3.name + ", Age: " + p3.age + ", Mobile No: " + p3.mobileNo);
			System.out.println("Name: " + p4.name + ", Age: " + p4.age + ", Mobile No: " + p4.mobileNo);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		ois.close();
		fis.close();
		System.out.println("Deserialization completed successfully");
		System.out.println("End of program");
	}
}
