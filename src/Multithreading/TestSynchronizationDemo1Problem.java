package Multithreading;

class MyResource {

    int i = 0;

    void put(int i) {
        this.i = i;
        System.out.println("Put: " + i);
    }

    void get() {
        System.out.println("Get: " + i);
    }
}

class MyProducer implements Runnable {

    MyResource r;

    MyProducer(MyResource r) {
        this.r = r;

        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {

        int i = 0;

        while (true) {

            r.put(i++);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyConsumer implements Runnable {

    MyResource r;

    MyConsumer(MyResource r) {
        this.r = r;

        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    public void run() {

        while (true) {

            r.get();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TestSynchronizationDemo1Problem {

    public static void main(String[] args) {

        System.out.println("Main method started");

        MyResource r = new MyResource();

        MyProducer p = new MyProducer(r);
        MyConsumer c = new MyConsumer(r);
    }
}