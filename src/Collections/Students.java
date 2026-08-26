package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Students {
	public static void main( String []args)
	{
		Collection<String>boys = new ArrayList<>();
		boys.add("Sudheer");
		boys.add("Sandeep");
		boys.add("Bhanu");
		boys.add("Sarat");
		boys.add("Sumanth");
		System.out.println(boys);
		System.out.println("************************************");
		Collection<String>girls = new ArrayList<>();
		girls.add("Srividya");
		girls.add("likitha");
		girls.add("lavanya");
		girls.add("durga");
		girls.add("Archana");
		System.out.println(girls);
		System.out.println("************************************");
		Collection<String>Students = new ArrayList<>();
		Students.addAll(boys);
		Students.addAll(girls);
		System.out.println(Students);
		
		
		
		
	}

}
