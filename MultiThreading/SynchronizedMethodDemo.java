class BankAccount {
    
    private int balance = 5000;

    public synchronized void withdraw(String name, int amount) {

        System.out.println("" + name + " is trying to withdraw " + amount);
        if (balance >= amount) {
            System.out.println(name + " withdraw successful !");
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        } 
        else {
            System.out.println("Insufficient balance for " + name);
        }
    }
}

class Customer extends Thread {
    BankAccount account;
    int amount;

    public Customer(BankAccount account, String name, int amount) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(Thread.currentThread().getName(), amount);
    }
}

public class SynchronizedMethodDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Customer c1 = new Customer(account, "Alice", 3000);
        Customer c2 = new Customer(account, "Bob", 4000);

        c1.start();
        c2.start();
    }    
}
