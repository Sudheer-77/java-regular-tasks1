package Array;

import java.util.Scanner;

public class Com12ProductOfArray {
	public static void  main (String args[]) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int pro= 1;
		
		int [] arr= new int [n];
		System.out.println(" enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			
			pro= pro* arr[i];
		}
		System.out.println("product  of array is"+ pro);
		
	}

}
