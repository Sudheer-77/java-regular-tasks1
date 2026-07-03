package poc;
import java.util.Scanner;

public class ATMManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        int enteredPin;
        int balance = 10000;
        int choice;
        int amount;
        int newPin;

        System.out.println("=================================");
        System.out.println("       WELCOME TO ATM");
        System.out.println("=================================");

        System.out.print("Enter ATM PIN: ");
        enteredPin = sc.nextInt();

        if (enteredPin == pin) {

            while (true) {

                System.out.println("\n========== ATM MENU ==========");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Change PIN");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("---------------------------");
                        System.out.println("Current Balance : Rs. " + balance);
                        System.out.println("---------------------------");
                        break;

                    case 2:
                        System.out.print("Enter Deposit Amount : ");
                        amount = sc.nextInt();

                        if (amount > 0) {
                            balance = balance + amount;
                            System.out.println("Amount Deposited Successfully.");
                            System.out.println("Updated Balance : Rs. " + balance);
                        } else {
                            System.out.println("Invalid Amount.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter Withdrawal Amount : ");
                        amount = sc.nextInt();

                        if (amount <= balance && amount > 0) {
                            balance = balance - amount;
                            System.out.println("Please Collect Your Cash.");
                            System.out.println("Remaining Balance : Rs. " + balance);
                        } else {
                            System.out.println("Insufficient Balance or Invalid Amount.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter Current PIN : ");
                        enteredPin = sc.nextInt();

                        if (enteredPin == pin) {

                            System.out.print("Enter New PIN : ");
                            newPin = sc.nextInt();

                            System.out.print("Confirm New PIN : ");
                            int confirmPin = sc.nextInt();

                            if (newPin == confirmPin) {
                                pin = newPin;
                                System.out.println("PIN Changed Successfully.");
                            } else {
                                System.out.println("PIN Mismatch.");
                            }

                        } else {
                            System.out.println("Wrong Current PIN.");
                        }
                        break;

                    case 5:
                        System.out.println("=================================");
                        System.out.println("Thank You For Using Our ATM");
                        System.out.println("Visit Again!");
                        System.out.println("=================================");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice.");
                }

            }

        } else {
            System.out.println("Incorrect PIN.");
            System.out.println("Transaction Cancelled.");
        }

        sc.close();
    }
}