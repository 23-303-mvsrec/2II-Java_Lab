//Java program to demonstrate the use of synchronized keyword
class Bank {
    int balance;
    Bank(int balance) {
        this.balance = balance;
    }
    void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw " + amount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount);
        } else {
            System.out.println(Thread.currentThread().getName() + " cannot withdraw " + amount + ", insufficient balance");
        }
    }
}
class WithdrawThread extends Thread {
    Bank bank;
    int amount;
    WithdrawThread(Bank bank, int amount) {
        this.bank = bank;
        this.amount = amount;
    }
    public void run() {
        synchronized (bank) {
            bank.withdraw(amount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class BankSynchronised {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        int initialBalance = scanner.nextInt();
        Bank bank = new Bank(initialBalance);
        System.out.println("Initial balance: " + initialBalance);
        WithdrawThread t1 = new WithdrawThread(bank, 500);
        WithdrawThread t2 = new WithdrawThread(bank, 700);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Final balance: " + bank.balance);
        
    }
}
