package Labtaska;

// Shared class
class SharedData {

    int value;
    boolean available = false;

    // Producer puts a value
    synchronized void produce(int value) {

        // Wait if previous value has not been consumed
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.value = value;
        available = true;

        System.out.println("Producer produced: " + value);

        // Notify Consumer
        notify();
    }

    // Consumer takes a value
    synchronized void consume() {

        // Wait if no value is available
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumer consumed: " + value);

        available = false;

        // Notify Producer
        notify();
    }
}


// Producer thread
class Producer extends Thread {

    SharedData data;

    Producer(SharedData data) {
        this.data = data;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            data.produce(i);
        }
    }
}


// Consumer thread
class Consumer extends Thread {

    SharedData data;

    Consumer(SharedData data) {
        this.data = data;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            data.consume();
        }
    }
}


// Main class
public class ProducerConsumer {

    public static void main(String[] args) {

        // Create one shared object
        SharedData data = new SharedData();

        // Create Producer and Consumer
        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);

        // Start both threads
        producer.start();
        consumer.start();
    }
}