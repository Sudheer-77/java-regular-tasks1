package DSA;

public class Palindron2 {
	public static void main (String args[])
	{
		boolean palindrome =true;
	String s = "susususususd";
	int n = s.length();

	
	for (int i=0;i<=n/2;i++)
	{
		
	
		if(s.charAt(i)!=s.charAt(n-i-1))
		{
		 palindrome = false;
		 break;
		}
	}
		if ( palindrome == true)
		{
		System.out.println("its a palindrom");
    	}
		else
		{
			System.out.println("its not a palindrom");
		}
	}
	
}

