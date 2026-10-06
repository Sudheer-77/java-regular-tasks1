package Collections;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        // Create HashSet
        HashSet<String> names = new HashSet<>();

        // 1. Add elements
        names.add("RAJU");
        names.add("KIRAN");
        names.add("ARUN");
        names.add("SURESH");

        // Duplicate value
        names.add("RAJU");

        System.out.println("HashSet: " + names);

        // 2. Check size
        System.out.println("Size: " + names.size());

        // 3. Search
        if (names.contains("ARUN")) {
            System.out.println("ARUN is present");
        } else {
            System.out.println("ARUN is not present");
        }

        // 4. Remove
        names.remove("KIRAN");

        System.out.println("After removing KIRAN: " + names);

        // 5. Iterate
        System.out.println("Elements:");

        for (String name : names) {
            System.out.println(name);
        }

        // 6. Check empty
        System.out.println("Is empty? " + names.isEmpty());

        // 7. Clear all elements
        names.clear();

        System.out.println("After clear: " + names);
        System.out.println("Is empty? " + names.isEmpty());
    }
}