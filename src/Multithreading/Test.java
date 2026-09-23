package Multithreading;

class TextMyThreadDemo extends Thread {
    public void run() {
        System.out.println("Child Thread Name: " + Thread.currentThread().getName());
    }
}

public class Test {
    public static void main(String[] args) {

        MyThread t = new MyThread();

        System.out.println("Default Thread Name: " + t.getName());

        t.setName("MyChildThread");
        System.out.println("After Changing Name: " + t.getName());

        t.start();

        System.out.println("Main Thread Name: " + Thread.currentThread().getName());
    }
}
