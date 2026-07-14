package Array;

public class array27Leaders {
	public static void main (String args[])
	{
		int arr[]= {12,23,454,6,34,2};
		int leader= arr[arr.length - 1];
		System.out.println(leader);
		//if we took values from the Scanner then we should take the leade as n-1;
		for (int i=arr.length-1;i>=0;i--)
		{
			if (arr[i]>leader)
			
			{
				leader =arr[i];
				System.out.println(arr[i]);
			}
		}
		//System.out.println(Arrays.toString(arr));
	}
	

}
