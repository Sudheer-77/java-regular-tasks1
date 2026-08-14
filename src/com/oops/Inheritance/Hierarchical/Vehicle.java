package com.oops.Inheritance.Hierarchical;

public class Vehicle {
	void start() {
		System.out.println("Basic function of vechile is start");
	}
	 class Car extends Vehicle
	{
		void carmode() {
			System.out.println("toyoto fortuner");
		}
	}
	 class Bike extends Vehicle{
		void bikemodel() {
			System.out.println(" NINZA H2R");
		}
	}
	
}
