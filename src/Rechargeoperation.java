class MobileWallet {

    // Private data member
    private double walletBalance;

    // Constructor
    public MobileWallet(double balance) {
        walletBalance = balance;
    }

    // Recharge method
    public void recharge(double amount) {
        if (amount > 0) {
            walletBalance += amount;
            System.out.println("Recharge Successful: ₹" + amount);
        } else {
            System.out.println("Invalid Recharge Amount");
        }
    }

    // Deduct method
    public void deduct(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Deduction Amount");
        } else if (amount > walletBalance) {
            System.out.println("Insufficient Balance");
        } else {
            walletBalance -= amount;
            System.out.println("Deduction Successful: ₹" + amount);
        }
    }

    // Getter method
    public double getBalance() {
        return walletBalance;
    }
}

public class Rechargeoperation {
    public static void main(String[] args) {

        MobileWallet wallet = new MobileWallet(500);

        wallet.recharge(200);
        wallet.deduct(100);
        wallet.deduct(700);

        System.out.println("Current Balance: ₹" + wallet.getBalance());

        // Not Allowed
        // wallet.walletBalance = 1000; // Compile-time error
    }
}