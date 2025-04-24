//Program demonstration of Setting name to a Thread
class ImplementingThread implements Runnable{
	String name;
	ImplementingThread(String name){
		this.name = name;
		Thread t = new Thread(this);
		t.setName(name);
		t.start();
	}
	public void run(){
		System.out.println("Thread running");
	}
}
class ThreadExample{
	public static void main(String... args){
		new ImplementingThread("Vamshi Thread");
	}
}
