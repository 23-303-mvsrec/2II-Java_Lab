interface I1{
	void m1();
	default void dmethod(){
		System.out.println("Default method implementation in I1");

        }
}
interface I2{
	void m2();
	default void dmethod(){
		System.out.println("Default method implementation in I2");

	}
}
class MultipleInheritance implements I1,I2{
	public void m1(){
		System.out.println("m1() implementation");
	}
	public void m2(){
                System.out.println("m2() implementation");
        }
	public void dmethod(){
		System.out.println("Default method implementation");
	}
	public static void main(String... args){
		MultipleInheritance obj = new MultipleInheritance();
		obj.m1();
		obj.m2();
		obj.dmethod();

	}
}

