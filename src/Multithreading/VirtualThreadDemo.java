package Multithreading;

public class VirtualThreadDemo {

    public static void main(String[] args) {

        // Create a virtual thread
        Thread t = Thread.startVirtualThread(() -> {

            // Code executed by virtual thread
            System.out.println("Running in virtual thread");

            System.out.println(Thread.currentThread());
        });

        // Wait for virtual thread to finish
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}