//Java Program on Interface Extending another Interface						2451-23-733-303
interface A{
	void method1();
	void method2();
}
interface B extends A{
	void method3();
}
class c implements A, B {}
class InterfaceExtends{
	public void method1(){
		System.out.println("method1() implementation");
	}
	public void method2(){
                System.out.println("method2() implementation");
        }
	public void method3(){
                System.out.println("method3() implementation");
        }
	public static void main(String... args){
                InterfaceExtends obj = new InterfaceExtends();
                obj.method1();
                obj.method2();
                obj.method3();
        }

}

