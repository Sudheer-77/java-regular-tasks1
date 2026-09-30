package Multithreading;
class MyThread3 extends Thread{
	public void run()
	{
		for (int i =0;i<10;i++)
		{
			System.out.println(getName()+":"+ i);
			if(i==2)
			{
				Thread.yield();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}

public class sleepyeild {

	public static void main(String[] args) {
		MyThread3 m=new MyThread3();
		m.setName("Thread 1");
		m.start();

	}

}
