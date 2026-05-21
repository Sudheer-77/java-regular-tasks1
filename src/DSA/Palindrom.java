package DSA;

public class Palindrom {

	public static void main(String[] args) {
	  String s = "sus";
	  String temp = "";
	  for (int i=s.length()-1;i>=0;i--)
	  {
		  temp = temp + s.charAt(i);
	  }
	  System.out.println(temp);
	  if (s.equals(temp))
	  {
		  System.out.println("its a palindron");
	  }
	  else
	  {
		  System.out.println("its not a palindrom");
	  }
	}

}
