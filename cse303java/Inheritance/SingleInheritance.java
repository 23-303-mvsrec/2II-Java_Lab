//Java Program on Single Inheritance and Constructor Calling                                2451-23-733-303
class Parent{
	private int i;
	Parent(){
		System.out.println("Parent Class Default Constructor");
	}
	Parent(int i){
		this.i = i;
		System.out.println("Parent Class Paremeterized Constructor");
	}
	void seti(int i){
		this.i = i;
	}
	int geti(){
		return i;
	}

}
class Child extends Parent{
	int j;
	Child(){
		System.out.println("Child class Default Constructor");
	}
	Child(int j){
		super(j);  //call to super must be first statement in constructor
		this.j = j;
		System.out.println("Child class Paremeterized Constructor(1)");
 	}
	Child(int i,int j){
		System.out.println("Child Class Parameterized Constructor(2)");
		seti(i);
		this.j = j;
	}
	void display(){
		System.out.println("i = "+geti()+" j = "+j);
	}
}
class SingleInheritance{
	public static void main(String[] args){
		Child obj1 = new Child();
		obj1.display();
		Child obj2 = new Child(3);
		obj2.display();
		Child obj3 = new Child(3,6);
		obj3.display();
	}
}

/*Observation: Parent class Default constructor is only called even when the child class parameterized constructor is called.
 * super(x) is used to invoke parent class parameterized constructor effectively*/

