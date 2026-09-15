package Multithreading;

public class comMyThreaddemo1 extends Thread {
	public  void run()
	{
		for (int i =0;i<10;i++)
	
	{
		System.out.println(" hello");
	}
	}

	public static void main(String[] args) {
		comMyThreaddemo1 t= new comMyThreaddemo1();
		t.run();
	
	}

}
