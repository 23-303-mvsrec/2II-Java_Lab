import java.util.Scanner;

class Bank {
    private int balance;
    
    Bank(int balance) {
        this.balance = balance;
    }
    
    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
        }
    }
}

class WithdrawThread extends Thread {
    private Bank bank;
    private int amount;
    
    WithdrawThread(Bank bank, int amount) {
        this.bank = bank;
        this.amount = amount;
    }
    
    public void run() {
        bank.withdraw(amount);
    }
}

public class BankSynchronised {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter initial balance: ");
            int initialBalance = scanner.nextInt();
            Bank bank = new Bank(initialBalance);
            
            WithdrawThread t1 = new WithdrawThread(bank, 5000);
            WithdrawThread t2 = new WithdrawThread(bank, 4000);
            
            t1.start();
            t2.start();
            
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
