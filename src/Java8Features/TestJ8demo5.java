package Java8Features;

//Lambda Expressions vs Multithreading 
public class TestJ8demo5 {

	void welcome() {
		System.out.println("Welcome method called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

//		Mythread1 m = new MyThread1();

		Runnable m = () -> {
			System.out.println("run method called ");

			TestJ8demo5 t = new TestJ8demo5();
			t.welcome();

			for (int i = 0; i <= 10; i++) {
				System.out.println("run :  " + i);
			}

		};

		Thread t = new Thread(m);
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main " + i);
		}

		System.out.println("main method ended ");

	}

}