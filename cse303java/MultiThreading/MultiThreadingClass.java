//Program to demonstrate multi-threading in Java
import java.util.Scanner;

class Thread1 extends Thread {
    int arr[];
    Thread1(int arr[]) {
        this.arr = arr;
    }
    public void run() {
        for(int i=0;i<arr.length;i++){
            System.out.println("The Square of " + arr[i] + " is: " + (arr[i]*arr[i]));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class Thread2 extends Thread {
    String s;
    Thread2(String s) {
        this.s = s;
    }
    public void run() {
        for(int i=0;i<s.length();i++){
            System.out.println("The Character at " + i + " is: " + s.charAt(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadingClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a string:");
        String s = sc.next();
        sc.close();
        Thread1 t1 = new Thread1(arr);
        Thread2 t2 = new Thread2(s);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
