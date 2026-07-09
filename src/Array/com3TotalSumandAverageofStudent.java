package Array;

import java.util.Scanner;

public class com3TotalSumandAverageofStudent {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of subjects");
	int n = sc.nextInt();
	System.out.println(" enter marks");
	int []marks= new int[n];
	int sum=0;
	double avg=0;
	for (int i=0;i<n;i++)
	{
	marks[i]=sc.nextInt();
	sum= sum+marks[i];
	}
	avg=(double)sum/n;
	 
	System.out.println("sum of marks :"+ sum);
	System.out.println(" average of marks" + avg);
	

	}

}
