//Java program to demonstrate the use of join() method
class BankThread extends Thread{
    int balance;
    BankThread(int balance){
        this.balance = balance;
    }
    public void run(){
        balance -= 500;
        System.out.println("Balance after withdrawal: " + balance);
    }
}
public class BankThreadImplementation {
    public static void main(String[] args) {
        BankThread bankThread = new BankThread(10000);
        bankThread.start();
        System.out.println("Is alive: " + bankThread.isAlive());
        // try {
        //     bankThread.join();
        // } catch (InterruptedException e) {
        //     System.out.println(e);
        // }
        System.out.println("Final balance: " + bankThread.balance);
        System.out.println("Is alive: " + bankThread.isAlive());
    }
}
