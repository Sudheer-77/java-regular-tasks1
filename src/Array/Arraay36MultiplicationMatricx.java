package Array;

public class Arraay36MultiplicationMatricx {

	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		int arr1 [][]= {
				{12,12,12},{23,34,54},{56,67,78}};
		int arr2 [][]=
			{
					{12,23,34},{34,45,56},{56,67,78}
			};
		int result [][]=new int [3][3];
 for (int i = 0 ;i<arr1.length;i++)
 {
	 for(int j = 0 ;j<arr2[0].length;j++)
	 {
		for (int k =0;k< arr1[0].length;k++)
		{
			result[i][j]+=arr1[i][k]*arr2[k][j];
		}
	 }
	 	
 }
 System.out.println(" result mattrix : ");
  for (int i=0;i<result.length;	i++)
  {
	  for ( int j =0;j< result[i].length;j++)
	  {
		  System.out.print(result[i][j] + " ");
	  }
	  System.out.println();
  }
	
	}

}
