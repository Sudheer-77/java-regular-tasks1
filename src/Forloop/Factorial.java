package Forloop;

import java.util.Scanner;

public class Factorial {

	public static void main ( String []args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number to fimd factor :");
		int n = sc.nextInt();
		for (int i=1;i<+n;i++)
		{
			if ( n%i==0)
			{
				System.out.print(i +" ");
			}
				
		}
				
				
	}
}
