package Constructor;

import com.langfunda.methods.EmployeeInfo;

class Account {
	int accountNumber;
	String accountholderName;

	Account(int accountNumber, String accountholderName) {
		System.out.println("2 parameter constroctor called");
		this.accountholderName = accountholderName;
		this.accountNumber = accountNumber;
	}

	Account(){
		
	}
	public static void main(String... args) {
		System.out.println("main class called");
		bank obj = new bank();
		System.out.println(obj.accountNumber);
		EmployeeInfo employeeInfo = new EmployeeInfo();
	}

}

class savingaccount extends Account {
	double balance;double tax;

	savingaccount(int accountNumber, String accountholderName, double balance,double tax ) {
		super();
		this.balance = balance;
		this.tax=tax;
		this.accountholderName=accountholderName;
		this.accountNumber=accountNumber;
	}

	public static void main(String... args) {
		savingaccount sa = new savingaccount(121, "fsfs", 1212,1213.3);
		sa.display();

	}

	void display() {
		System.out.println("accountNumber:" + accountNumber);
		System.out.println("accountholderName:" + accountholderName);

		System.out.println("balance:" + balance);

	}

}
