package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo5 {

	public static void main(String[] args) {
	Collection <String>c1= new ArrayList();
	c1.add("10");
	System.out.println(c1);

	System.out.println(c1.hashCode());
	Collection <String>c2=new ArrayList();
	c2.add("10");
	System.out.println(c2);
	System.out.println(c2.hashCode());
	System.out.println("************************************");
	
	Collection <String>c3= new ArrayList();
	c3.add("10");
	c3.add("20");
	System.out.println(c3);
	System.out.println(c3.hashCode());
	
	Collection <String>c4= new ArrayList();
	c4.add("20");
	c4.add("10");
	
	System.out.println(c4);
	System.out.println(c4.hashCode());
	System.out.println(c4.isEmpty());
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
	System.out.println(c4.remove("40"));
	System.out.println(c4.remove("20"));
	
	System.out.println(c4);
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
	System.out.println(c1.remove("10"));
	System.out.println(c1);
	System.out.println("*********************************");
	

	}

}
