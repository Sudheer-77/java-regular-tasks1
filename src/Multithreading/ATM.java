package Multithreading;

class BankAccount1 {

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

class Customer2 extends Thread {

    int amount;
    BankAccount1 account;

    public Customer2(int amount, BankAccount1 account, String name) {

        super(name);

        this.amount = amount;
        this.account = account;
    }

    public void run() {

        account.withdrawAmount(amount);
    }
}

public class ATM {

    public static void main(String[] args) {

        BankAccount1 ba = new BankAccount1();

        Customer2 c1 = new Customer2(7000, ba, "Customer 1");

        Customer2 c2 = new Customer2(5000, ba, "Customer 2");

        c1.start();
        c2.start();
    }
}