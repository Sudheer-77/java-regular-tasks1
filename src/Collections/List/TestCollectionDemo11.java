package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TestCollectionDemo11 {

	public static void main(String[] args) {
		String[]vegies= {"banana","carrot","potato"};
		Collection<String> veg= new ArrayList<>(Arrays.asList(vegies));
		System.out.println(veg);
		

	}

}
