package Multithreading;

class DeadlockDemo {

    public static void main(String[] args) {

        // Two objects used as locks
        String lock1 = "Lock 1";
        String lock2 = "Lock 2";

        // Thread 1
        Thread t1 = new Thread(() -> {

            // Thread 1 gets Lock 1
            synchronized (lock1) {

                System.out.println("Thread 1 locked Lock 1");

                try {
                    // Give Thread 2 a chance to get Lock 2
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Thread 1 now tries to get Lock 2
                // But Thread 2 already has Lock 2
                synchronized (lock2) {

                    System.out.println("Thread 1 locked Lock 2");
                }
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {

            // Thread 2 gets Lock 2
            synchronized (lock2) {

                System.out.println("Thread 2 locked Lock 2");

                try {
                    // Give Thread 1 a chance to get Lock 1
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Thread 2 now tries to get Lock 1
                // But Thread 1 already has Lock 1
                synchronized (lock1) {

                    System.out.println("Thread 2 locked Lock 1");
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        try {
            // Give both threads time to reach the deadlock
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check the state of both threads
        System.out.println("Thread 1 state: " + t1.getState());
        System.out.println("Thread 2 state: " + t2.getState());
    }
}