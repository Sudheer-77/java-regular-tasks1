package Forloop;

import java.util.Scanner;

public class SumofNnumbers {
public static void main (String args[])

{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sum= 0;
	for(int i = 1;i<=20;i++)
		
	{
		sum= sum+i;
		System.out.println(sum);
	}
	System.out.println(sum);
}
}
