class Clicker implements Runnable {
    long click = 0;
    private volatile boolean running = true;
    Thread t;
    Clicker(int priority) {
        t = new Thread(this);
        t.setPriority(priority);
    }
    public void run() {
        while (running) {
            click++;
        }
    }
    public void stop(){
        running = false;
    }
    public void start(){
        t.start();
    }
}
public class HighLowPriority {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Clicker high = new Clicker(Thread.NORM_PRIORITY+2);
        Clicker low = new Clicker(Thread.NORM_PRIORITY-2);
        high.start();
        low.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        high.stop();
        low.stop();
        try {
            high.t.join();
            low.t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("High Priority Clicks: " + high.click);
        System.out.println("Low Priority Clicks: " + low.click);
        //System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());        
    }
}

