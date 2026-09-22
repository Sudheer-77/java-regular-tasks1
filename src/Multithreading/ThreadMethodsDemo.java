package Multithreading;

class DownloadThread extends Thread {

    @Override
    public void run() {

        System.out.println(getName() + " Priority: " + getPriority());

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CalculationThread extends Thread {

    @Override
    public void run() {

        System.out.println(getName() + " Priority: " + getPriority());

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DisplayThread extends Thread {

    @Override
    public void run() {

        System.out.println(getName() + " Priority: " + getPriority());

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);

            Thread.yield();
        }
    }
}

public class ThreadMethodsDemo {

    public static void main(String[] args) {

        DownloadThread t1 = new DownloadThread();
        CalculationThread t2 = new CalculationThread();
        DisplayThread t3 = new DisplayThread();

        // Setting thread names
        t1.setName("DownloadThread");
        t2.setName("CalculationThread");
        t3.setName("DisplayThread");

        // Setting thread priorities
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        // Starting threads
        t1.start();
        t2.start();
        t3.start();

        try {
            // Wait for all threads to finish
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads completed.");
    }
}