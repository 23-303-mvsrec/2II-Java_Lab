//Java Program on Static signifance and it's nature                                                     2451-23-733-303
class ObjectCounter{
	static int objCount = 0;
	int variable;

	ObjectCounter(){
		objCount++;
	}

	static int getObjCount(){
		variable++;    //non static variable cannot be accesed inside the static method
		return objCount;
	}

	public static void main(String... args){
		ObjectCounter o1 = new ObjectCounter();
		ObjectCounter o2 = new ObjectCounter();
		ObjectCounter o3 = new ObjectCounter();
		System.out.println("Total Number of objects created: "+getObjCount());
	}
}
