package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTypes {

    public static void main(String[] args) {

        // 1. Fixed Thread Pool
        ExecutorService fixed = Executors.newFixedThreadPool(2);

        fixed.submit(() -> {
            System.out.println("Fixed Thread Pool");
        });

        fixed.shutdown();


        // 2. Single Thread Pool
        ExecutorService single = Executors.newSingleThreadExecutor();

        single.submit(() -> {
            System.out.println("Single Thread Pool");
        });

        single.shutdown();


        // 3. Cached Thread Pool
        ExecutorService cached = Executors.newCachedThreadPool();

        cached.submit(() -> {
            System.out.println("Cached Thread Pool");
        });

        cached.shutdown();


        // 4. Scheduled Thread Pool
        ScheduledExecutorService scheduled =
                Executors.newScheduledThreadPool(2);

        scheduled.schedule(() -> {
            System.out.println("Scheduled Thread Pool");
        }, 2, TimeUnit.SECONDS);

        scheduled.shutdown();
    }
}