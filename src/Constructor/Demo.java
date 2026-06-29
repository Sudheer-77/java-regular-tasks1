package Constructor;

import java.util.Scanner;

public class Demo {

	int accountNumber;
	String customerName;
	double balance;
	String gender;

	Demo() {
		accountNumber = 100;
		customerName = "Surya";
		balance = 1000;
	}

	Demo(int accountNumber, String customerName) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
	}

	Demo(int accountNumber, String customerName, double balance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}

	Demo(int accountNumber, String customerName, double balance, String gender) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
		this.gender = gender;
	}

	void display() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Customer Name  : " + customerName);
		System.out.println("Balance        : " + balance);
		System.out.println("Gender         : " + gender);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. ATM");
		System.out.println("2. Savings Account");
		System.out.println("3. Current Account");
		System.out.println("4. Full Details");
		System.out.print("Enter Choice : ");

		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			Demo atm = new Demo();
			System.out.println("ATM Details");
			atm.display();
			break;

		case 2:
			Demo savings = new Demo(101, "Sudheer");
			System.out.println("Savings Account Details");
			savings.display();
			break;

		case 3:
			Demo current = new Demo(102, "Kiran", 5000);
			System.out.println("Current Account Details");
			current.display();
			break;

		case 4:
			Demo full = new Demo(103, "Ram", 10000, "Male");
			System.out.println("Full Account Details");
			full.display();
			break;

		default:
			System.out.println("Invalid Choice");
		}

		sc.close();
	}
}