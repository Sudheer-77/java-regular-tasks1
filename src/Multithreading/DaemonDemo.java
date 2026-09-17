package Multithreading;

class MyThread1 extends Thread {

	public void run() {

		for (int i = 1; i <= 5; i++) {

			System.out.println("Daemon Thread Running: " + i);

		}
	}
}

public class DaemonDemo {

	public static void main(String[] args) {

		MyThread1 t = new MyThread1();

		t.setDaemon(true);

		t.start();

		System.out.println("Is thread daemon? " + t.isDaemon());

		for (int i = 1; i <= 5; i++) {

			System.out.println("Main Thread: " + i);

		}
	}
}