package typesOfMethods;
import java.util.*;

public class Bankapplication {

	public static void main(String[] args) {
		
		Bankapplication B = new Bankapplication();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your bank name");
		String bank = sc.nextLine();
		B.Bank(bank);
		System.out.println("enter your name");
		String name = sc.nextLine();
		B.getAccountHolderName(name);
		System.out.println("enter your accout number :");
		long accno = sc.nextInt();
		B.getAccountNumber( accno);
		sc.nextLine();
		System.out.println("enter your ifsc code");
		String ifsc = sc.nextLine();
		B.getIFSCCode( ifsc); 
		
		System.out.println("enter branch name");
		String branch = sc.nextLine();
		B.getBranchName( branch);
		

	}
	void Bank(String bank)
	{
		System.out.println(" Bank name is :"+bank);
	}
	 void getAccountHolderName(String name)
	 {
		 System.out.println("accout holder name is :"+name);
	 }
	 void getAccountNumber(long accno)
	{
		System.out.println("Your account number is "+accno);
	}
	
	 void getBranchName(String branch)
	 {
		 System.out.println(" Your branch name is : "+branch);
	 }
	void getIFSCCode(String ifsc) {
		System.out.println(" Your IFSC code is :"+ifsc);
	}
}
