//Java program of Complex Number Addition by passing two objects
class Complex{
	int a,b;
	Complex(){
	//	a=0;b=0;
	}
	Complex(int a,int b){
		this.a =a;
		this.b =b;
	}
	static Complex ComplexAdd(Complex c1,Complex c2){
		Complex result = new Complex();
		result.a = c1.a + c2.a;
		result.b = c1.b + c2.b;
		return result;
	}
	void display(){
		System.out.println(a+"+"+b+"i");
	}
	public static void main(String[] args){
		Complex c1 = new Complex(1,2);
		Complex c2 = new Complex(2,3);
		Complex c3 = ComplexAdd(c1,c2);
		System.out.print("First Complex Number: ");
		c1.display();
		System.out.print("Second Complex Number: ");
		c2.display();
		System.out.print("Resultant Complex Number: ");
		c3.display();

	}
}
