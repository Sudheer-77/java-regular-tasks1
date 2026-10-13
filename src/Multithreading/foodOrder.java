package Multithreading;

class OrderThread extends Thread {
	public void run() {
		System.out.println("Order placed");

	}
}

class CookingThread extends Thread {
	public void run() {
		System.out.println(" food is cooking");
		 try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		System.out.println(" Food is ready");
	}
}

class DeliveryThread extends Thread {
	public void run() {
		System.out.println(" Food is delivered");
	}
}

public class foodOrder {

	public static void main(String[] args) {
		OrderThread order = new OrderThread();
		CookingThread cooking = new CookingThread();
		DeliveryThread delivery = new DeliveryThread();
		try {
			order.start();
			order.join();
			cooking.start();
			cooking.join();
			delivery.start();
			delivery.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
