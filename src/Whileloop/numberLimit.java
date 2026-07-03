package Whileloop;

import java.util.Scanner;

public class numberLimit{
	public static void main ( String []args)
	{
		Scanner sc = new Scanner ( System.in);
		int count =0;

	
	 while ( count<5)
	 {
		 System.out.println(" enter a number ");
			int n = sc.nextInt();
			boolean num=isprime(n);
			if ( num )
			{
				System.out.println(" entered number is prime ");
				count++;
			}
			else 
			{
				System.out.println(" it's not a prime enter another value");
			}
			System.out.println("your enterdd number is: "+n);
		
		
	 }
	 System.out.println(" limit reached");
	
	}

	private static boolean isprime(int a) {
	
	
	  
		  if (a==1||a==0)
	     {
			  return false;
		  }
		  
		  for(int i=2;i<a/2;i++)
		  {
			  if(a%i==0) {
				 
			  return false;
			  }
		  }
	  
		

	return true;
	
}
	}



