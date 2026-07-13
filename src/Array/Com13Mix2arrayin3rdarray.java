package Array;

public class Com13Mix2arrayin3rdarray {

	public static void main(String[] args) {
		int arr[]= {10,12,40,50,34,56};
		int arr1[]= {12,23,34,5,56,13,445,12};
		int arr2[]= new int[arr.length+arr1.length];
		
		for (int i=0;i<arr.length;i++)
		{
			arr2[i]=arr[i];
		}
      for (int i=0;i<arr1.length;i++)
      {
    	  arr2[arr.length+i]=arr1[i];
      }
      System.out.println(" final array is ");
      for(int i=0;i<arr2.length;i++)
      {
    	  System.out.print(arr2[i]+" ");
      }
	}

}
