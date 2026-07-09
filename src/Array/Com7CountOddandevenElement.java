package Array;

import java.util.Scanner;

public class Com7CountOddandevenElement {

	public static void main(String[] args) {
	Scanner sc= new Scanner ( System.in);
	System.out.println(" enter size of array");
	int n = sc.nextInt();
	
	int[]arr=new int[n];
	System.out.println(" enter array values");
	for (int i=0;i<arr.length;i++)
	arr[ i]= sc.nextInt();
	int evencount=0;
	int oddcount=0;
	for (int i=0;i<n;i++)
	{
		if (arr[i]%2==0)
		{
			evencount++;
		}
		else
		{
			oddcount++;
		}
	}
 System.out.println("even number count "+evencount);
 System.out.println("odd number count "+oddcount);
	}

}
