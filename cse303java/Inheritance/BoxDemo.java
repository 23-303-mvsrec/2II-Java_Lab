//Java Program on Constructor Overloading                                                          2451-23-733-303
class MyBox{
	private double w,h,d;
	MyBox(){
		w = h = d = -1;
	}
	MyBox(double x, double y, double z){
		w = x;
		h = y;
		d = z;
	}
	MyBox(double x){
		w = h = d = x;
	}
	MyBox(MyBox b){
		w = b.w;
		h = b.h;
		d = b.d;
	}
	double volume(){
		return w*h*d;
	}
}
class MyBoxWeight extends MyBox{
	double weight;
	MyBoxWeight(double a,double b, double c,double d){
		super(a,b,c);
		weight = d;
	}
	void display(){
		System.out.println("Volume: "+volume()+" Weight: "+weight);
	}
}
class MyBoxColor extends MyBoxWeight{
        String color;
        MyBoxColor(double a,double b, double c,double d,String color){
                super(a,b,c,d);
                this.color = color;
        }
        void display(){
                System.out.println("Volume: "+volume()+" Color: "+color);
        }
}

class BoxDemo{
	public static void main(String[] args){
		MyBox b1 = new MyBox();
		MyBox b2 = new MyBox(1,2,3);
		MyBox b3 = new MyBox(2);
		MyBox b4 = new MyBox(b3);
		MyBoxWeight m1 = new MyBoxWeight(1,1,1,1);
		MyBoxColor c1 = new MyBoxColor(1,2,3,4,"Blue");

		System.out.println("Volume of b1 : "+b1.volume());
		System.out.println("Volume of b2(1,2,3) : "+b2.volume());
		System.out.println("Volume of b3(2) : "+b3.volume());
		System.out.println("Volume of b1(b3) : "+b4.volume());
		System.out.print("Details of m1 : ");  m1.display();
		System.out.print("Details of c1 : ");  c1.display();


	}
}
