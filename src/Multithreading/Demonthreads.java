package Multithreading;

class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Daemon Thread Running: " + i);
        }
    }
}

public class Demonthreads {

    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.setDaemon(true);
        t.start();

        System.out.println("Is thread daemon? " + t.isDaemon());

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}