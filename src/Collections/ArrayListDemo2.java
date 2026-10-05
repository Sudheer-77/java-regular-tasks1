package Collections;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("RAJU");
        names.add("KIRAN");
        names.add("ARUN");
        names.add("SURESH");

        // Get element using index
        System.out.println(names.get(0));
        System.out.println(names.get(2));
    }
}