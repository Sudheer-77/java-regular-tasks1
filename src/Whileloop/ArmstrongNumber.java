package Whileloop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter a number ");
		int n= sc.nextInt();
		int n1=n;
		int temp=n;
		int r;
		 int count=0;
		 int sump=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			count++;
		}

		while(n1>0)
		{
			r=n1%10;
			n1=n1/10;
			sump = sump + (int)Math.pow(r, count);
		}
		if(temp==sump)
		{
			System.out.println("entered number is armstrong");
		}
		else
		{
			System.out.println(" not a armstrong");
		}
	}

}
