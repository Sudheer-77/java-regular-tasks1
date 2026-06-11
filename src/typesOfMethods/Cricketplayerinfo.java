package typesOfMethods;

import java.util.Scanner;

public class Cricketplayerinfo {

	public static void main(String[] args) {
		Cricketplayerinfo cr=new Cricketplayerinfo();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("WEL COME TO CRICKET WORLD");
		System.out.println("enter yout team name");
		String teamname=sc.nextLine();
		cr.getteam_name( teamname);
		
		
		System.out.println("enter your captain  names :");
		String name = sc.nextLine();
		cr.getcaptainname( name);
		
		System.out.println(" enter your capain age :");
		byte age = sc.nextByte();
		cr.getcaptainage(  age );
		
		
		System.out.println("enter run scored by captain  ");
		int score = sc.nextInt();
		cr.getcaptainruns(score);
		
       System.out.println("enter your batting avarage");
       float avg = sc.nextFloat();
      cr.getcaptain_avg( avg);
		
       
       /////////////////////////////////////////////////////////////////////////////////////////
		
  	sc.nextLine();
  	System.out.println("enter your vice captain name :");
		String name1= sc.nextLine();
		cr.getvcaptainname( name1);
		
	
		System.out.println("enter your vice captain age :");
		byte age1 = sc.nextByte();
		cr.getvcaptainage(  age1 );
		
		System.out.println("enter run scored by vc ");
		int score1 = sc.nextInt();
		cr.getvcaptainruns(score1);
		
	    System.out.println("enter your batting avarage");
	       float avg1 = sc.nextFloat();
	       cr.getvcaptain_avg( avg1);
	       System.out.println("enter most runs scored by player in team :");
	       int highscore = sc.nextInt();
	       cr.getmostRunGetter(highscore);
	       
	       
	}
	void getteam_name(String teamname)
	{
		System.out.println("your team name is :"+ teamname);
	}
	
	void getcaptainname(String name)
	{
		System.out.println("Your captain name is :" +name);
	}
	void getcaptainage( byte age ) 
	{
		System.out.println("your captain age is :"+ age);
		
	}
	void getcaptainruns(int score)
	{
		System.out.println("captain total score is :"+score);
	}
	void getcaptain_avg(float avg)
	{
		System.out.println("avarage of captain is :" +avg);
	}
	/////////////////////////////////////////////////////////////////////////////
	
	void getvcaptainname(String name1)
	{
		System.out.println("Your captain name is :" +name1);
	}
	void getvcaptainage( byte age1 ) 
	{
		System.out.println("your v captain age is :"+ age1);
		
	}
	void getvcaptainruns(int score1)
	{
		System.out.println("captain total score is :"+score1);
	}
	void getvcaptain_avg(float avg1)
	{
		System.out.println("avarage of captain is :" +avg1);
	}
	void getmostRunGetter(int highscore)
	{
		System.out.println("most runs score by player is:"+highscore);
	}


}
