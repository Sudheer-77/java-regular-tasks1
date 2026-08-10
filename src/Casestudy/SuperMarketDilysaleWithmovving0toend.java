package Casestudy;

public class SuperMarketDilysaleWithmovving0toend {

	public static void main(String[] args) {
		int arr[]=new int[6];
		arr[0] = 23;
		arr[1] = 0;
		arr[2] = 45;
		arr[3] = 6;
		arr[4] = 0; 
		arr[5] = 96;
	    int result[] = new int[arr.length];
	    int index=0;
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				result[index] =arr[i];
				index++;
			}
			
		}
		for (int i=0;i<result.length;i++)
			System.out.println(" sales are :"+result[i]);

	}

}
