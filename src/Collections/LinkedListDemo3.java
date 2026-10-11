package Collections;

import java.util.LinkedList;

public class LinkedListDemo3 {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("RAJU");
        names.add("KIRAN");
        names.add("ARUN");

        // Get element
        System.out.println(names.get(0));
        System.out.println(names.get(2));
    }
}