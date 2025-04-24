class NewThread implements Runnable{
	String name;
	Thread t;
	NewThread(String name){
		this.name = name;
		t = new Thread(this,name);
		t.start();
	}
	public void run(){
		System.out.println("\nLetters in the name "+name+": ");
		for(int i =0;i<name.length();i++)
			System.out.print(name.charAt(i)+ " ");
		System.out.println();
	}
}
class DemoJoin{
	public static void main(String... args){
		NewThread nt1 = new NewThread("Vamshidhar");
		NewThread nt2 = new NewThread("Akshay");
		NewThread nt3 = new NewThread("Sairam");
	try{
		nt1.t.join();
		nt2.t.join();
		nt3.t.join();
	}
	catch(InterruptedException ie){}

	}
}
