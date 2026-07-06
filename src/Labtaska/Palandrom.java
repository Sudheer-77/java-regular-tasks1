package Labtaska;

import java.util.Scanner;

public class Palandrom {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number ");
	int n = sc.nextInt();

	
 	 boolean  b =palandrom( n);
 	 if(b)
 	 {
 		 System.out.println(" it is a palandrom number");
 	 }
 	 else 
 	 {
 		 System.out.println(" not a palandrom number");
 	 }

	}

	 static boolean palandrom(int n) {
			int temp= n;
		 int rev=0;
		 while(n>0) {
		  int r= n%10;
	
		   rev=rev*10+r;
		   n=n/10;
		 }
		  if (rev==temp)
		  {
			 
			  return true;
		  }
		return false;
	}
}
