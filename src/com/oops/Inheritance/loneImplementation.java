package com.oops.Inheritance;
import java.util.Scanner;

public class loneImplementation implements lone {

	static Scanner sc =new Scanner(System.in);
	
	String hello() {
		return "lone";
	}
	public  String getCustomerName() {
		sc.nextLine();
		System.out.println("Enter your name ");
		String name = sc.nextLine();
		return name;
	}
	public int getCustomerAge() {
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		return age;
	}
	public double getCustomerSalaryInfo() {
		System.out.println(" Enter your salary");
		double sal = sc.nextDouble();
		return sal;
	}
	public int CibilInfo() {
		System.out.println("Enter your cibil score : ");
		int cibil = sc.nextInt();
		return cibil;
	}
	private int add() {
		return 2;
	}
	public double getRoi() {
		int cibil = CibilInfo();
		double roi = 12.0;
		if ( cibil >= 300 && cibil <500)
		{
			System.out.println(" poor - high risk for lenders");
			return roi +add();
		}
		else if (cibil >=500 && cibil <650)
		{
			System.out.println(" Average – credit may be approved with difficulty");
			return roi;
		}
		else if ( cibil>=650 && cibil <750) 
		{
			System.out.println(" good - acceptble to many leanders");
			return roi - 2.0;
		}
		else if ( cibil >=750 && cibil <=900)
		{
			System.out.println("Excellent – high approval chances and better interest rates");
			return roi - 4.0;
			
		}
		else 
		{
			System.out.println(" Invalid cibil score");
			return roi;
		}
		
	}
	public boolean isValidPhone() {
		System.out.println(" Enter your phone:");
		String phone = sc.next();
		boolean isvalid = phone.matches("^[6-9][0-9]{9}");
		return isvalid;
	}
	public  boolean isValidAadhar() {
		System.out.println("Enter your adhar Number :");
		String aadhar = sc.next();
		boolean isAadharValid = aadhar.matches("^[2-9][0-9]{11}");
		return isAadharValid;
		// ABCDE1234H
		
	}
	public  boolean isValidPan(){
		System.out.println("Enter pan number ");
		String pan = sc.next();
		boolean isValidPan = pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return isValidPan;
		
	}
	


}
