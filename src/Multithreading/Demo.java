package Multithreading;

class Test7 {

    // Synchronized method
    synchronized void method() {
        System.out.println("Synchronized method");
    }

    void block() {

        // Synchronized block
        synchronized (this) {
            System.out.println("Synchronized block");
        }
    }
}

public class Demo {

    public static void main(String[] args) {

        Test7 t = new Test7();

        // Calling synchronized method
        t.method();

        // Calling synchronized block
        t.block();
    }
}