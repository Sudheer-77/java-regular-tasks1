package Collections;

import java.util.LinkedList;

public class LinkedListDemo6 {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("RAJU");
        names.add("KIRAN");
        names.add("ARUN");

        if (names.contains("KIRAN")) {
            System.out.println("KIRAN is present");
        } else {
            System.out.println("KIRAN is not present");
        }
    }
}