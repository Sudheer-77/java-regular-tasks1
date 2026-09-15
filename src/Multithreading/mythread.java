package Multithreading;
public class mythread 
{ public void run() {
	System.out.println("run method stated");
	for (int i =0;i<10;i++)
	{
		System.out.println("run "+i);
	}
	System.out.println("run method ended");
}
	
	
	public static void main (String args[])
	{
		System.out.println("main method Started");
		mythread m= new mythread();
		m.run();
		for (int i = 0;i<10;i++)
		{
			System.out.println("main"+i);
			
		}
		System.out.println("main method ended");
	}
	
}