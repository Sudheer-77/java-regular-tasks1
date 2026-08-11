package com.oops.abstraction.BANK;

public interface bank {

	void withdral();

	void checkBalance();

	void deposit();
	
	 default void mainbrach()
	 {
		 System.out.println("head branch is RBI");
		 welcome();
	 }
	 
	 private void  welcome()
	 {
		 System.out.println("wel come  Have a great day");
	 }
	 
	 static void currency()
	 {
		 System.out.println(" Indian rupess: ₹");
	 }

}