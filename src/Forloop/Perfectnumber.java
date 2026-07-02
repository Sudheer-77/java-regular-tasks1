package Forloop;

import java.util.Scanner;

public class Perfectnumber {

	public static void main(String[] args) {
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check perfect number or not");
		int n=sc.nextInt();
	for (int i=1;i<=n/2;i++)
	{
		if (n%i==0)
		{
			
			sum +=i;
			
		
	
		}
	
	}
	if ( sum==n)
	{
		System.out.println("Enterd number is perfect number");
	}
	}

}
