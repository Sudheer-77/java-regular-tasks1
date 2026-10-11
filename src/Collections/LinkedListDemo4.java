package Collections;

import java.util.LinkedList;

public class LinkedListDemo4 {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("RAJU");
        names.add("KIRAN");
        names.add("ARUN");

        System.out.println("Before: " + names);

        // Update element
        names.set(1, "RAHUL");

        System.out.println("After: " + names);
    }
}