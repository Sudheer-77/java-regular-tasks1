package com.oops.Inheritance.Multilevel2;

public class Animal {

	void eat() {
		System.out.println("Animals eat food");
	}

	void walk() {
		System.out.println("All animals walk");
	}
}

class Lion extends Animal {

	void roar() {
		System.out.println("Lion roars");
	}
}

