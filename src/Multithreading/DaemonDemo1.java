package Multithreading;

class MyThread9 extends Thread {

    public void run() {

        for (int i = 1; i <= 10; i++) {

            System.out.println(getName() + " : " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class DaemonDemo1 {

    public static void main(String[] args) {

        MyThread9 t1 = new MyThread9();
        MyThread9 t2 = new MyThread9();

        t1.setName("Non-Daemon Thread");
        t2.setName("Daemon Thread");

        t2.setDaemon(true);

        t1.start();
        t2.start();

        System.out.println("Main thread finished");
    }
}