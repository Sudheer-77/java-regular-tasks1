package DSA;

public class Inside_space_patren {
  public static void main (String args[]) {
	  int n=5;

	  for (int i=0;i<n;i++)
	  {
		  for (int j=0;j<n;j++)
		  {
			  if ( i==0 || i==n-1 || j==0 || j==n-1)
			  {
				  System.out.print(" a ");
			  }
			  else
			  {
				  System.out.print("   ");
			  }
		  }
		  
		 System.out.println( );
		 
	  }
	 
  }
}
