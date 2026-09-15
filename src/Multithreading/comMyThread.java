package Multithreading;

public class comMyThread extends Thread {
	public void run() {//other than run method all other method will not run.
		System.out.println("run method stated");
		System.out.println(Thread.currentThread());
		for (int i = 0; i < 10; i++) {
			System.out.println("run " + i);
		}
		System.out.println("run method ended");
	}

	public static void main(String args[]) {
		System.out.println("main method Started");
		System.out.println(Thread.currentThread());
		comMyThread m = new comMyThread();
		m.start();// it call the run method by defalt its start() nature.
		//by this the multiple thread will run simultaniously.
		for (int i = 0; i < 10; i++) {
			System.out.println("main" + i);

		}
		System.out.println("main method ended");
	}

}