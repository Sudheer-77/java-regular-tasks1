package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TestCollectionDemo10 {

	public static void main(String[] args) {
		// Array
		String[] Crickters = { "VIRAT", "DHONI", "GABBAR", "YUVI" };
		// ARRAY to Collection
		Collection<String>Crickterss = new ArrayList<>(Arrays.asList(Crickters));
		System.out.println(Crickterss);

	}

}
//package Collections.List;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//
//public class TestCollectionDemo10 {
//
//    public static void main(String[] args) {
//
//        // Array
//        String[] Crickters = {"VIRAT", "DHONI", "GABBAR", "YUVI"};
//
//        // Array to Collection
//        Collection<String> cricketers =
//                new ArrayList<>(Arrays.asList(Crickters));
//
//        System.out.println(cricketers);
//    }
//}
