package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String[] args) {

        // Create a thread pool with 3 threads
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // Create 10 tasks
        for (int i = 1; i <= 10; i++) {

            int taskNumber = i;

            // Submit each task to the thread pool
            pool.submit(() -> {
                System.out.println("Task " + taskNumber
                        + " executed by "
                        + Thread.currentThread().getName());
            });
        }

        // Stop the thread pool after completing tasks
        pool.shutdown();
    }
}