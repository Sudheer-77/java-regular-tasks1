package Array;

public class Array34Count0s {

	public static void main(String[] args) {
		int arr[]= {12,0,2,0,2,0,23,6,0};
		int count=0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				count++;
			
			}
		
		}
		System.out.println(count);

	}

}
