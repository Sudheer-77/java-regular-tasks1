package Constructor;

public class Cricket {
	String name;
	String team;
	int highScore;
	int lowScore; 
	 
	Cricket ()
	{
		System.out.println("No argconstructor");
		name = "Dhoni";
		team = "INDIA";
		highScore =183;
		lowScore = 93;
		System.out.println("**************************");
	}
	Cricket (String name,String team,int highScore,int lowScore)
	{
		System.out.println(" 4 paramerized constructor");
		this. name= name;
		this. team = team;
		this. highScore =highScore;
		 this. lowScore=lowScore;
	}
	Cricket (String name,String team)
	{
		this.name=name;
		this.team=team;
	}
	Cricket (String name,String team,int highScore)
	{
		this.name =name;
		this.team = team;
		this.highScore=highScore;
	}
	Cricket (String name,String team,int highScore,int lowScore,float avg)
	{
		System.out.println(" 5 paramerized constructor");
		this. name= name;
		this. team = team;
		this. highScore =highScore;
		 this. lowScore=lowScore;
		 this.avg=avg;
	}

	
	public static void main(String []args){
		
		 Cricket c= new  Cricket ();
		 c.cricketinfo();
		 Cricket c1= new  Cricket ("virat","INDIA",183,95);
		 c1.cricketinfo();
		 Cricket c2= new  Cricket ("raina","INDIA");
		 c2.cricketinfo();
		 Cricket c3= new  Cricket ("Pant","INDIA",93);
		 c3.cricketinfo();
		 Cricket c5= new  Cricket ("virat","INDIA",183,95);
		 c5.cricketinfo();

		
	}
	void cricketinfo(){
		System.out.println("name of crickter :"+name);
		System.out.println("name of team "+team);
		System.out.println("highscore :"+highScore);
		System.out.println("lowscore :"+lowScore);
		System.out.println("*********************");
	}

}
