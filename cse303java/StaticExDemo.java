//Java Program on `static` keyword usage                                                              2451-23-733-303
class StaticEx{
	static int s;
	int ns;

	static{
		s =10;
		System.out.println("Static block executed");
	//	System.out.println("Non Static variables,methods cannot be accesed");
		staticMethod();
	}
	static void staticMethod(){
		System.out.println("Static method executed");
		System.out.println("Static variable s ="+s);
	//	System.out.println("Non Static variables,methods cannot be accesed");
	}
	public void nonStaticMethod(){
		System.out.println("Non static method executed");
		ns++;
		s++;
		staticMethod();
	}
}
class StaticExDemo{
	public static void main(String... args){
		System.out.println("Static variable s value from main: "+StaticEx.s);
		StaticEx.staticMethod();
		StaticEx so = new StaticEx();
		so.nonStaticMethod();
	}
}
