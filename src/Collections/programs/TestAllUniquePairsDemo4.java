package Collections.programs;

import java.util.ArrayList;

public class TestAllUniquePairsDemo4 {

	public static void main(String[] args) {
	ArrayList<Integer> l=new ArrayList<>();
	l.add(12);
	l.add(2);
	l.add(7);
	l.add(4);
	l.add(3);
	l.add(5);
	l.add(8);
	l.add(1);
	
	
int target =9;
  for (int i = 0; i<l.size();i++)
  {
	  for (int j=i+1;j<l.size()-1;j++)
	  {
		  if(i+j==target)
		  {
			 System.out.println(i +" "+j); 
		  }
	  }
  }
	             
	

	}

}
