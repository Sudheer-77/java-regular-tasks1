package com.oops.abstraction;

interface Shape {
    void calculateArea();
}

class Circle implements Shape {
    double radius = 5;

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

class Rectangle implements Shape {
    double length = 10;
    double breadth = 5;

    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }
}

class Triangle implements Shape {
    double base = 8;
    double height = 6;

    public void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Triangle Area: " + area);
    }
}

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        c.calculateArea();
        r.calculateArea();
        t.calculateArea();
    }
}