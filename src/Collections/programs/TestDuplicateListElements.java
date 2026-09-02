package Collections.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class TestDuplicateListElements {

	public static void main(String[] args) {
		List<Integer>numbers= new ArrayList<>(Arrays.asList(10,20,30,40,50,20,10));
		LinkedHashSet<Integer> uniqueNumber=new  LinkedHashSet<>(numbers);
		  List<Integer> result = new ArrayList<>(uniqueNumber);
		  System.out.println("Original list :"+numbers);
		  System.out.println("UniquElements:"+uniqueNumber);
	

	}

}
