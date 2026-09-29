package Multithreading;

class MyThread5 extends Thread {

    public void run() {

        try {

            System.out.println("Thread is sleeping");

            Thread.sleep(5000);

            System.out.println("Thread completed");

        } catch (InterruptedException e) {

            System.out.println("Thread was interrupted");
        }
    }
}

public class InterruptDemo {

    public static void main(String[] args) throws InterruptedException {

        MyThread5 t1 = new MyThread5();

        t1.start();

        System.out.println("Thread alive: " + t1.isAlive());

        Thread.sleep(1000);

        t1.interrupt();

        t1.join();

        System.out.println("Thread alive: " + t1.isAlive());
    }
}