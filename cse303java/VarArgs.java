//Java Program to demostrate Variable Length Arguments
class VarArgs{
	static void method1(int... a){
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
	}
	static void method2(float f1,int ...a,float ...f2){
		System.out.print(f1+" ");
		for(int x:a)
                        System.out.print(x+" ");
                System.out.println();
		for(int f:f2)
                        System.out.print(f+" ");
                System.out.println();

        }
	public static void main(String[] args){
		method1(1,2,3);
		method2(23.4f,1,34,3.45f);
	}
}
