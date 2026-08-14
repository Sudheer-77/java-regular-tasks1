package com.oops.polymorphism.overriding;

public class Employee {
	void work() {
		System.out.println("Employe shoud work");
		System.out.println("---------------------------------------------------------------------------------");
	}
}
	class Developer extends Employee{
		void work()
		{
			System.out.println("Developer develop the application by writting code");
			System.out.println("---------------------------------------------------------------------------------");
		}
	}
	class Tester extends Employee{
		void work() {
			System.out.println(" Tester test the code");
			System.out.println("---------------------------------------------------------------------------------");
		}
	}



