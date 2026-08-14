package com.oops.Inheritance.Multilevel2;

public class Vechile {
	public class Bike {

	}

	void start() {
		System.out.println(" every vechile main function in start");
	}
}
class car extends Vechile{
	void Drive() {
		System.out.println(" CAR  can we drove");
	}
}
class Toyoto extends car{
	void model()
	{
		System.out.println("FORTUNER");
	}
}