
package com.oops.abstraction;

public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

}

