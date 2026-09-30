package Multithreading;

class MyThread6 extends Thread {

    public void run() {

        System.out.println(getName());
        System.out.println("Priority: " + getPriority());
    }
}

public class PriorityDemo {

    public static void main(String[] args) {

        MyThread6 t1 = new MyThread6();
        MyThread6 t2 = new MyThread6();

        t1.setName("High Priority Thread");
        t2.setName("Low Priority Thread");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}