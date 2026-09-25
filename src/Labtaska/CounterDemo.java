package Labtaska;

class Counter {

    int count = 0;

    synchronized void increment() {
        count++;
    }
}

class MyThread extends Thread {

    Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {

        for (int i = 1; i <= 1000; i++) {
            counter.increment();
        }
    }
}

public class CounterDemo {

    public static void main(String[] args) throws Exception {

        Counter counter = new Counter();

        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        MyThread t3 = new MyThread(counter);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Final Counter Value: " + counter.count);
    }
}