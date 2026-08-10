package Labtaska;

public class FindingMaxProfit {

	public static void main(String [] args)
	{
		int arr[]= {10,5,7,2,1,3};
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1]<arr[i])
			{
				arr[i]=arr[i]-arr[i+1];
			}
		
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}
}
