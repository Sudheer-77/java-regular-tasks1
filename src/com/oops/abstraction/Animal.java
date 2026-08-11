
package com.oops.abstraction;

public interface Animal {

    // Abstract method
    void eat();

    void sleep();

    void sound();

    // Default method
    default void walk() {
        System.out.println("Every animal can walk!");
        hello();
    }

    // Default method
    default void run() {
        System.out.println("Animals can also run!");
        hello();
        breath();
    }

    // Private method
    private void hello() {
        System.out.println("hello");
      
    }

    // Static method
    static void breath() {
        System.out.println("Every animal should breathe to survive!");
    }

}

