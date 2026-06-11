package DSA;

public class Greatest_no {

	
	public static void main (String []args) {
		
	
	int sr[]= {5,4,5,45,4,50,7,77,15,18};
	 int greatest   =sr[0];
    for(int i=0;i<=sr.length-1;i++) 
    {
    	
    	
//    	if (greatest<sr[i])
//    	{
//    		greatest = sr[i];
 greatest =Math.max(sr[i],greatest);
//    	}
    	}
    System.out.println(greatest);
    }
	
	}

