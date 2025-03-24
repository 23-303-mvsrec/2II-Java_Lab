//Java Program on Abstract usage                                                                2451-23-733-303
abstract class Figure{
	double dim1,dim2;
	Figure(double dim1,double dim2){
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	abstract void area();
	void concrete(){
		System.out.println("This is a concrete method");
	}
}
class Rectangle extends Figure{
	Rectangle(double l, double b){
		super(l,b);
	}
	void area(){
		System.out.println("Area is :"+dim1*dim2);
	}
}
class Triangle extends Figure{
        Triangle(double b, double h){
                super(b,h);
        }
        void area(){
                System.out.println("Area is :"+0.5*dim1*dim2);
        }       
}  
class AbstractClassEx{
	public static void main(String... args){
		Figure f;
		Rectangle r = new Rectangle(2.45,3.56);
		Triangle t = new Triangle(3,4);

		r.area();
		t.area();
		r.concrete();
	//	t.concrete();	//This is not possible as abstract class cannot be initialised

		f = new Rectangle(5,7);	//Runtime Polymorphism -This is Dynamic Method Dispatch
		f.area();
		f.concrete();

	}
}

