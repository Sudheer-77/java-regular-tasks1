package Collections.List;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo9 {

	public static void main(String[] args) {
	//converting Collection to Array and
	
	
		Collection<String> Crickter = new ArrayList<>();

		Crickter.add("Dhoni");
		Crickter.add("Virat");
		Crickter.add("Rohit");
		Crickter.add("Bumrah");

		System.out.println(Crickter);
		System.out.println("**************************");
		Object[] objArr=Crickter.toArray();
		for (int i =0;i<objArr.length;i++)
		{
			System.out.println(objArr[i]);
		}
		//array to Collections in testcollection demo 10,11;
		

	}

}
