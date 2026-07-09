package Array;

public class com5minAndMaxinArray {

	public static void main ( String args[])
	{
		
		int[]arr = {10,12,54,65,76,87,98};

        int max = arr[0];
        int min = arr[0];
		for(int i=0;i<7;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			if(min >arr[i])
			{
				min= arr[i];
			}
		}
		System.out.println(" max number is :"+max);
		System.out.println(" max number is :"+min);
	}
}
