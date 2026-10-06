package Collections;

import java.util.ArrayList;

public class ArrayListDemo6 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("RAJU");
        names.add("KIRAN");
        names.add("ARUN");
        names.add("SURESH");

        // Iterate ArrayList
        for (String name : names) {
            System.out.println(name);
        }
    }
}