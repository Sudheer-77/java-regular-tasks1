
package Array;

import java.util.Arrays;

public class Arrsysmovingtoright {
	public static void main (String args[])
	{     int index = 0;
		int arr []= {12,0,34,0,456};
		for ( int i =0;i<arr.length;i++)
		{
			if ( arr[i]>0) {
			arr[index]=arr[i];
			index++;
			}
		}
		for ( int  i= index;i<arr.length;i++)
		{
			arr[index]=0;
			index++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
