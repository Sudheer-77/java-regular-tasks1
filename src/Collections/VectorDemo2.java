package Collections;

import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {

        Vector<String> names = new Vector<>();

        names.add("RAJU");
        names.add("KIRAN");
        names.add("king");

        // Add ARUN at index 2
        names.add(2, "ARUN");

        System.out.println(names);
    }
}