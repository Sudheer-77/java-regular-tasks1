package DSA;

public class Patrenswithoutspace
{
	public static void main ( String args[])
	{

	int n = 5;
//	int m = 10;
		for (int i = 0; i<=n;i++) 
		{	
			for (int j=0;j<=n;j++)
			{
				if (j==n) {
				System.out.print("*");
				}
				else
				{
					System.out.print("*_");
									}
			 }
			System.out.println(" ");
		}
	
	}
}