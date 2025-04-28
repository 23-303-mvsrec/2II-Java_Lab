//Java program to demonstrate the producer-consumer problem using threads
public class ProducerConsumer {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);
        producer.start();
        consumer.start();
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("All items produced and consumed.");
        System.out.println("Main thread exiting.");
    }
}
class SharedResource {
    int item;
    boolean flag = true; // true for producer, false for consumer
     void putItem(int item) {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.item = item;
        System.out.println("Produced: " + item);
        flag = false;
        notify();
    }
     int getItem() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumed: " + item);
        flag = true;
        notify();
        return item;
    }
}
class Producer extends Thread {
    SharedResource resource;
    Producer(SharedResource resource) {
        this.resource = resource;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.putItem(i);
            try{
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
class Consumer extends Thread {
    SharedResource resource;
    Consumer(SharedResource resource) {
        this.resource = resource;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.getItem();
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

