package Array;

public class Array32MatrricsDifferentOperation {
	public static void main (String args[]) {
	int arr[][]= {
				{9,2,8},
				{3,7,4},
				{3,5,6},
				{1,3,5}
			};
			
			for(int i =0;i<arr.length;i++)
				
			{
				if(i%2==0)
				{
					for(int j = arr[i].length-1 ;j>=0;j--)
					{
						System.out.print(arr[i][j] + " ");
						System.out.print("| ");
					}
				}
				else
					for(int j=0;j<arr.length-1;j++)
					{
						System.out.print(arr[i][j]*arr[i][j]+ " ");
						System.out.print(" |");
					}
				
				
				System.out.println(" ");
			}
	}

}
