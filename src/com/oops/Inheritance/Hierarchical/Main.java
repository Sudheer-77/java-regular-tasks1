package com.oops.Inheritance.Hierarchical;

import com.oops.Inheritance.Hierarchical.Vehicle.Bike;
import com.oops.Inheritance.Hierarchical.Vehicle.Car;

public class Main {

    public static void main(String[] args) {
    	Vehicle v = new Vehicle();
        Bike b = v.new Bike();

        b.bikemodel();
        b.start();

        Car c = v.new Car();

        c.carmode();
        c.start();
    }
}