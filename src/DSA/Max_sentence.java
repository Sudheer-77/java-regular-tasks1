package DSA;

public class Max_sentence {
	public static void main (String [] args)
	{
		 int count =1;
		String sen = "hello i hi tata  welcome back";
				for (int  i=0;i<sen.length();i++)
				{
					if (sen.charAt(i)==' ')
						count++;
				}
				System.out.println(count);
	}

}
