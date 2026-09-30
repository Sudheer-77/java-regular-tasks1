package Multithreading;

class MyThread4 extends Thread {

    public void run() {

        synchronized (this) {

            System.out.println("Thread is waiting");

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread continued");
        }
    }
}

public class waitNotify {

    public static void main(String[] args) throws InterruptedException {

        MyThread4 t1 = new MyThread4();

        t1.start();

        Thread.sleep(1000);

        synchronized (t1) {

            System.out.println("Main thread is calling notify");

            t1.notify();
        }
    }
}