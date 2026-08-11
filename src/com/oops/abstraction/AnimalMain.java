package com.oops.abstraction;

public class AnimalMain {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.sleep();
        d.sound();

        // Default methods
        d.walk();
        d.run();
        

        // Static interface method
        Animal.breath();
        System.out.println("***********************************");
        
        monkey M = new monkey();

        M.eat();
      M.sleep();
      M.sound();
        // Default methods
     M.walk();
     M.run();
     

        // Static interface method
        Animal.breath();
    }
}
