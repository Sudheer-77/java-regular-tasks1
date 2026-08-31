package Collections.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestDemo8 {

	public static void main(String[] args) {
	Collection<String>fruits=new ArrayList<>();
	fruits.add("Banana");
	fruits.add("Cheku");
	if(!fruits.isEmpty())
	{
		fruits.add("ORANGE");
		fruits.add("APPLE");
		fruits.add("pinapple");
		fruits.add("pappaya");
		fruits.add("muskmillon");
		fruits.add("graphs");
	}
	System.out.println(fruits);
	System.out.println("*******************************************************");
	for(String fruit:fruits) {
		System.out.println(fruit);
	}
	System.out.println("*******************************************************");
	Iterator <String>itr= fruits.iterator();
	while(itr.hasNext())
	{
		if(itr.next().equals("banana")){
			itr.remove();
		}
		System.out.println(itr.next());
	}
	
	

	}

}
