//Java Program on Interfaces										2451-23-733-303
interface Drawable{
	int i = 102;	//by default public static final and initialisation is must
	void draw();
	default void msg(){
		System.out.println("Default method");
	}
	static void smsg(){
		System.out.println("Static method");
	}
}
interface B extends Drawable{}
class Rectangle implements Drawable{
	public void draw(){	//Implementing class(i.e Rectangle),the method should be public
	//	i++;            //error interface variables cannot be changed
		System.out.println("Drawing Rectangle and i = "+i);
	}

	public void msg(){
	//	Drawable.super.msg();
		System.out.println("This is from Rectangle");
	}

}
class TestInterfaceDefault{
	public static void main(String... args){
		Rectangle r1 = new Rectangle();
		r1.draw();
		r1.msg();
		Drawable.smsg();
//		Drawable d = new Rectangle();
	//	d.msg();

		 Drawable d = new Drawable() {
        public void draw() {
            System.out.println("Anonymous Drawable draw() method");
        }
    };
    d.msg();
	}
}
