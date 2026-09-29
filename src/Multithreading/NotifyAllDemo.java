package Multithreading;

class MyThread7 extends Thread {

    public void run() {

        synchronized (this) {

            System.out.println(getName() + " is waiting");

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(getName() + " continued");
        }
    }
}

public class NotifyAllDemo {

    public static void main(String[] args) throws InterruptedException {

    	MyThread7 t1 = new MyThread7();
    	MyThread7 t2 = new MyThread7();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();

        Thread.sleep(1000);

        synchronized (t1) {

            System.out.println("Main thread calls notifyAll()");

            t1.notifyAll();
        }

        synchronized (t2) {

            t2.notifyAll();
        }
    }
}