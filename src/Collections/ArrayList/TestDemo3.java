package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo3 {
	public static void main(String args[])
	{
		Collection <String> boys= new ArrayList();
		boys.add("virat");
		boys.add("dileep");
		boys.add("kiran");
		boys.add("sai");
		boys.add("teja");
		boys.add("mahesh");
		boys.add("sandeep");
		
		System.out.println(boys);
		System.out.println("**************************************");
		Collection <String> girls = new ArrayList();
		girls.add("pallavi");
		girls.add("sita");
		girls.add("laxmi");
		girls.add("puspa");
		girls.add("puja");
		girls.add("durga");
		girls.add("lavanya");
		System.out.println(girls);
		System.out.println("**************************************");
		Collection <String>Students = new ArrayList();
		Students.addAll(boys);
		Students.addAll(girls);
		System.out.println(Students);
		System.out.println("**************************************");
		boys.clear();
		System.out.println(boys);
		System.out.println("**************************************");
		
		System.out.println(Students);
		System.out.println("**************************************");
		System.out.println(Students.contains("sandeep"));
		System.out.println(Students.containsAll(girls));
		System.out.println(Students.containsAll(boys));
		System.out.println(Students.contains("sudheer"));
		
		

		
	}

}
