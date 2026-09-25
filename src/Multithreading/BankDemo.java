package Multithreading;

class BankAccount {

    private int balance = 100000;

    synchronized void withdrawAmount(int amount) {

        if (amount > balance) {

            System.out.println(Thread.currentThread().getName()
                    + " is waiting");

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } else {

            balance = balance - amount;

            System.out.println(Thread.currentThread().getName()
                    + " withdrew ₹" + amount);

            System.out.println("Remaining balance: ₹" + balance);

            notify();
        }
    }
}

class Customer extends Thread {

    BankAccount account;
    int amount;

    public Customer(BankAccount account, int amount, String name) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdrawAmount(amount);
    }
}

public class BankDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Customer c1 = new Customer(account, 7000, "Customer 1");
        Customer c2 = new Customer(account, 5000, "Customer 2");

        c1.start();
        c2.start();
    }
}