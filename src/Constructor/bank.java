package Constructor;

class Details {
	int height;
	int weight;

	Details(int he, int w) {
		this.height = he;
		this.weight = w;
	}

	void d() {
		System.out.println(height);
		System.out.println(weight);
	}

	public static void main(String[] args) {
		Details d = new Details(134, 65);
		d.d();
	}
}

public class bank {

	String branchName = "kphp";
	String accountType = "general";
	String country = "india";
	String bankaddress = "hydrabad";

	int accountNumber;
	String customerName;
	double balance;
	String gender;
	String ifscCode;
	String mobileNumber;
	String panNumber;

	bank() {
		accountNumber = 100;
		customerName = "surya";
		balance = 1000;
	}

	bank(int accountNumber, String customerName, double balance) {
		System.out.println("3paramerized constructor");
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}

	bank(int accountNumber, String customerName) {
		System.out.println("2 parameterized");
		this.accountNumber = accountNumber;
		this.customerName = customerName;

	}

	bank(int accountNumber) {
		System.out.println("1 parameterized");
		this.accountNumber = accountNumber;

	}

	bank(int accountNumber, String customerName, double balance, String gender) {
		System.out.println("4 parameterized constructor");
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
		this.gender = gender;
	}

	public static void main(String[] args) {
		bank b = new bank();
		b.bankDetails();
		bank b1 = new bank(121, "sudheer", 1212);
		b1.bankDetails();
		bank b2 = new bank(111, "kiran");
		b2.bankDetails();
		bank b3 = new bank(121);
		b3.bankDetails();
		bank b4 = new bank(1232, "ram", 100101, "male");
		b4.bankDetails();

	}

	void bankDetails() {
		System.out.println("account number :" + accountNumber);
		System.out.println("customer naem : " + customerName);
		System.out.println(" branchName :" + branchName);
		System.out.println("accountType :" + accountType);
		System.out.println(" bankaddress :" + bankaddress);
		System.out.println(" gender :" + gender);
		System.out.println("balance :" + balance);
		System.out.println("ifscCode :" + ifscCode);
		System.out.println("mobileNumber :" + mobileNumber);
		System.out.println("panNumber :" + panNumber);

		System.out.println("**************************");
	}

}
