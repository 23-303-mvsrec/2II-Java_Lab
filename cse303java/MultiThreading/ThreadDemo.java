import java.util.Scanner;
class SquareThread extends Thread{
	int arr[];
	SquareThread(int[] arr){
		this.arr = arr;
	}
	public void run(){
		System.out.println("Square of each Element: ");
		for(int i = 0; i< arr.length; i++)
			System.out.println(arr[i]+": "+(arr[i] *arr[i]));
	}
}
class ToUpperCase implements Runnable{
	String str;
	ToUpperCase(String s){
		str =s;
	}
	public void run(){
		System.out.println("Uppercase of entered String "+str+": "+str.toUpperCase());
	}
}
class ThreadDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of array elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array Elements: ");
		for(int i = 0;i<n;i++)
			arr[i] = sc.nextInt();

		SquareThread st = new SquareThread(arr);
		st.start();
		try{
			st.join();
		}
		catch(InterruptedException e){}
		System.out.print("Enter a String to convert it into Upper Case: ");
		String str = sc.next();
		Runnable r = new ToUpperCase(str);
		Thread t = new Thread(r);
		t.start();
	}
}
