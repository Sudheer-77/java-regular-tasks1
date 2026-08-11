
package com.oops.abstraction;

public class monkey implements Animal {

    @Override
    public void sound() {
        System.out.println("khaa khaaaaa !!");
    }

    @Override
    public void eat() {
        System.out.println("Monkey eats banana!!");
    }

    @Override
    public void sleep() {
        System.out.println("Monkey sleeps like humans!");
    }
}

