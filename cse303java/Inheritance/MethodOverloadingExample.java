//Java Program on Hierachial Inheritance example-2                                    2451-23-733-303
class Figure{
	double dim1,dim2;
	//Figure(){}             //if super(...) not used then default constructor is called and this is necessary
	Figure(double dim1,double dim2){
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	double area(){
		System.out.println("Area of Figure is undefined");
		return 0;
	}
}
class Rectangle extends Figure{
	Rectangle(double l, double b){
		super(l,b);
	}
	double area(){
		return (dim1*dim2);
	}
}
class Triangle extends Figure{
	Triangle(double b,double h){
		super(b,h);
	}
	double area(){
		return ((0.5)*dim1*dim2);
	}
}
class MethodOverloadingExample{
	public static void main(String args[]){
		Figure f1 = new Rectangle(1,2);
		Rectangle r1 =new Rectangle(2,3);
		Triangle t1 = new Triangle(3,6);

		System.out.println("Area of Rectangle(1,2): "+f1.area());
		System.out.println("Area of Rectangle(2,3): "+r1.area());
		System.out.println("Area of Triangle(3,6): "+t1.area());
	}
}

