//Java Program on Dynamic Method Dispatch Concept                                                       2451-23-733-303
class GrandParent{
	int k =1;
	void method(){
		System.out.println("Method call from GrandParent Class");
	}
}
class Parent extends GrandParent{
	int k =10;
        void method(){
                System.out.println("Method call from Parent Class");
        }
}
class Child extends Parent{
	int k =100;
        void method(){
                System.out.println("Method call from Child Class");
        }
	void method2(){
		System.out.println("Method2 call from Child Class");
	}
}
class DynamicMethodDispatch{
	public static void main(String... args){
		GrandParent gp;
		Parent p;
		Child c;

		c = new Child();
		System.out.println("Object pretends as Child");
		c.method();

		p = c;	//Runtime Polymorphism Child object behaves as Parent
                System.out.println("Object pretends as Parent");
		System.out.println("variable k = "+p.k);
                p.method();
	//	p.method2();	//Error

		gp = new Child();	//Runtime Polymorphism Child object behaves as GrandParent
                System.out.println("Object pretends as GrandParent");
		System.out.println("variable k = "+gp.k);
                gp.method();
	}
}
