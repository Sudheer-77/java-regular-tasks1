package com.oops.Inheritance.Hybrid;

public class vechileMain {
	public static void main (String args[])
	{
		Acbus A= new Acbus();
		A.pubicTranceport();
		A.start();
		A.ac();
		System.out.println("--------------------------");
		ElectricBus E= new ElectricBus();
		E.ac();
		E.charg();
		E.start();
		E.pubicTranceport();
		System.out.println("--------------------------");
		Bus b= new Bus();
		b.ac();
		b.pubicTranceport();
		b.ac();
	}

}
