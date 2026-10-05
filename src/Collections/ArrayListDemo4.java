package Collections;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("RAJU");
        names.add("KIRAN");
        names.add("ARUN");
        names.add("SURESH");

        System.out.println("Before remove: " + names);

        // Remove element at index 1
        names.remove(1);

        System.out.println("After remove: " + names);
    }
}