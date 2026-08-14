package com.oops.Inheritance.Hierarchical;

import com.oops.Inheritance.Hierarchical.WildAnimals.Lion;
import com.oops.Inheritance.Hierarchical.WildAnimals.Tiger;

public class AnimalMain {

	public static void main(String[] args) {
		WildAnimals W = new WildAnimals();
		Lion L = W.new Lion();
		L.hunting();
		L.paw();
		L.running();
		System.out.println("------------------------------------");
		Tiger T = W.new Tiger();
		T.attaking();
		T.hunting();
		T.running();

	}

}
