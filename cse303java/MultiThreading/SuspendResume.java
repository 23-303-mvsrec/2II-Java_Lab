//Java program to demonstrate suspend and resume methods
class NewThread extends Thread {
    String name;
    NewThread(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println(name + " is running");
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(name + " is finished");
    }
}
public class SuspendResume {
    public static void main(String[] args) {
        NewThread thread1 = new NewThread("Thread 1");
        NewThread thread2 = new NewThread("Thread 2");
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(2000);
            thread1.suspend();
            System.out.println("Suspending Thread 1");
            Thread.sleep(2000);
            thread1.resume();
            System.out.println("Resuming Thread 1");
            thread2.suspend();
            System.out.println("Suspending Thread 2");
            Thread.sleep(2000);
            thread2.resume();
            System.out.println("Resuming Thread 2");
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }    
}
