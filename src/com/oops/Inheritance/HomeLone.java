 package com.oops.Inheritance;

public class HomeLone  extends loneImplementation{
	void homeLoneDocInfo() {
		System.out.println("Home lone documents have been recven succesfully");	
	}
	public int add() {
		return 5;
	}
	
	public double getRoi() {
		 
		double roi = 9.0;
		return roi;
	}
	public static void main(String[] pars) {
		System.out.println("Welcome to Vcube Home Loan Banking Loan !!");

		String s1 = new String();
		System.out.println(s1);

		lone pl = new HomeLone();

		boolean isValidPhone = pl.isValidPhone();
		boolean isAadharValid = pl.isValidAadhar();
		boolean isPanValid = pl.isValidAadhar();

		if (isValidPhone && isAadharValid && isPanValid) {
			String name = pl.getCustomerName();
			System.out.println("Wlecome to Vcube Home Loan Banking Mr : " + name);
			double salary = pl.getCustomerSalaryInfo();
			double cibil = pl.CibilInfo();
			int age = pl.getCustomerAge();

			if (salary >= 600000.00 && (age >= 20 && age <= 45) && (cibil >= 300 && cibil <= 900)) {
				System.out.println("Congratualtions !! You are Eligible for Home Loan !!");
				System.out.println("Your Rate of Interest is : " + pl.getRoi());

			} else {
				System.out.println("Focus on your Career to get Loans !!");
			}
		} else {
			System.out.println("Invalid Details !");
		}

	}

}