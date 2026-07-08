package Labtaska;

import java.util.Scanner;

public class PrimePosition {

	public static void main(String[] args) {
		Scanner sc  =new  Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
    
	boolean prime  =isprime( n);
  int primecounter=0;
   for (int i=2;i<=n;i++)
   {
	   if(isprime(i))
		   primecounter++;
	   if(isprime (primecounter))
	   {
		   System.out.println(i);
	   }
   }
	
	}

	private static boolean isprime(int n) {
		 if(n==1||n==0)
			 
		return  false;
		 for(int i=2;i<=n/2;i++) {
			 if(n%i==0)
			 {
				 return false;
			 }
	
	}
		 return true;
	}
}
