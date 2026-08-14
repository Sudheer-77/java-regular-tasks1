package com.oops.polymorphism.overloading;

public class Employee {

    void salary() {
        System.out.println("Basic salary");
    }

    void salary(int basic) {
        System.out.println("Basic salary: " + basic);
    }

    void salary(int basic, int bonus) {
        System.out.println("Total salary: " + (basic + bonus));
    }

    public static void main(String[] args) {

        Employee e = new Employee();

        e.salary();
        e.salary(30000);
        e.salary(30000, 5000);
    }
}