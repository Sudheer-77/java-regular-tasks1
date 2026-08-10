package com.oops.Inheritance;

import java.util.Scanner;

// Child or Sub or Derived class
public class PersonalLone extends loneImplementation {

	static Scanner sc = new Scanner(System.in);

	@Override
	String hello() {
		return "Personal Lone";
	}

	void personalLoneDocinfo() {
		System.out.println("Personal Loan documents have been received successfully !!");
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Vcube Banking Loan !!");

		// Scenario 1: Child Object vs Child Reference
		PersonalLone pl = new PersonalLone();

		// Scenario 2: Parent Object vs Parent Reference
		loneImplementation l1 = new loneImplementation();

		// Scenario 3: Child Object vs Parent Reference
		loneImplementation l2 = new PersonalLone();

		System.out.println(l2.hello());

		// Scenario 4: Downcasting
		PersonalLone pl2 = (PersonalLone) l2;

		pl2.personalLoneDocinfo();
		pl2.CibilInfo();

		boolean isValidPhone = pl.isValidPhone();
		boolean isAadharValid = pl.isValidAadhar();
		boolean isPanValid = pl.isValidPan();

		if (isValidPhone && isAadharValid && isPanValid) {

			String name = pl.getCustomerName();

			System.out.println("Welcome to Vcube Banking Mr : " + name);

			double salary = pl.getCustomerSalaryInfo();

			int cibil = pl.CibilInfo();

			int age = pl.getCustomerAge();

			if (salary >= 800000.00
					&& (age >= 20 && age <= 60)
					&& (cibil >= 300 && cibil <= 900)) {

				System.out.println(
						"Congratulations !! You are Eligible for Personal Loan !!");

				System.out.println(
						"Your Rate of Interest is : " + pl.getRoi());

			} else {

				System.out.println(
						"Focus on your Career to get Loans !!");
			}

		} else {

			System.out.println("Invalid Details !");
		}
	}
}