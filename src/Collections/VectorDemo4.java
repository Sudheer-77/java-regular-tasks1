package Collections;

import java.util.Vector;

public class VectorDemo4 {

    public static void main(String[] args) {

        Vector<String> names = new Vector<>();

        names.add("RAJU");
        names.add("KIRAN");
        names.add("ARUN");

        System.out.println("Before: " + names);

        // Update KIRAN
        names.set(1, "RAHUL");

        System.out.println("After: " + names);
    }
}