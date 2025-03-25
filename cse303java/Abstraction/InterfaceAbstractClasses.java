

interface I{
	void a();
	void b();
	void c();
	void d();
}
abstract class A implements I{
	public void a(){
		System.out.println("a method call from class A");
	}
}
class B extends A{
//	public void a(){
//                System.out.println("a method call from class B");
//        }
	public void b(){
                System.out.println("b method call from class B");
        }
	public void c(){
                System.out.println("c method call from class B");
        }
	public void d(){
                System.out.println("d method call from class B");
        }
}
class InterfaceAbstractClasses{
	static public void main(String... args){
	//	I i1 = new A();
		I i1 = new B();
		i1.a();
		i1.b();
		i1.c();
		i1.d();
		A a1 = new B();
		a1.a();
	}
}

