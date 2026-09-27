package Multithreading;

class MyTask {

	synchronized void display() {

		System.out.println(Thread.currentThread().getName() + " entered");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " finished");
	}
}

class MyThread8 extends Thread {

	MyTask task;

	MyThread8(MyTask task, String name) {
		super(name);
		this.task = task;
	}

	public void run() {
		task.display();
	}

	public void suspend() {
		// TODO Auto-generated method stub
		
	}

	public void resume() {
		// TODO Auto-generated method stub
		
	}
}

public class BlockSuspendDemo {

	public static void main(String[] args) throws InterruptedException {

		MyTask task = new MyTask();

		MyThread8 t1 = new MyThread8(task, "Thread 1");
		MyThread8 t2 = new MyThread8(task, "Thread 2");

		t1.start();

		Thread.sleep(500);

		t2.start();

		Thread.sleep(1000);

		System.out.println("Thread 2 state: " + t2.getState());

		System.out.println("Suspending Thread 1");

		t1.suspend();

		Thread.sleep(2000);

		System.out.println("Resuming Thread 1");

		t1.resume();

		t1.join();
		t2.join();

		System.out.println("Program finished");
	}
}