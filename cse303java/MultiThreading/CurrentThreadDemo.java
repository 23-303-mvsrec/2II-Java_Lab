// This program demonstrates how to get the current thread's name and change it.
class CurrentThreadDemo{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        t.setName("MyThread");
        System.out.println("After name change: " + t);
        for(int i = 0; i < 5; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Thread name: " + t.getName());
    }
}