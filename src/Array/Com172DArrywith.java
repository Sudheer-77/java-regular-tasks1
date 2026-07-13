package Array;

public class Com172DArrywith {

	public static void main(String[] args) {
		int arr[][]= {{10,21,12},{1,2,3},{12,45,6,3}};
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+ " ");
				System.out.print("|");
			}
			System.out.println(" ");
		}

	}

}
