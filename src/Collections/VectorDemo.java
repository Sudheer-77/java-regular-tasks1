package Collections;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        // Create Vector
        Vector<String> names = new Vector<>();

        // 1. Add elements
        names.add("RAJU");
        names.add("KIRAN");
        names.add("ARUN");
        names.add("SURESH");

        System.out.println("Original Vector: " + names);

        // 2. Add element at a specific index
        names.add(2, "RAVI");

        System.out.println("After adding RAVI: " + names);

        // 3. Get element
        System.out.println("Element at index 1: " + names.get(1));

        // 4. Update element
        names.set(1, "RAHUL");

        System.out.println("After update: " + names);

        // 5. Remove element
        names.remove("SURESH");

        System.out.println("After remove: " + names);

        // 6. Search element
        if (names.contains("ARUN")) {
            System.out.println("ARUN is present");
        } else {
            System.out.println("ARUN is not present");
        }

        // 7. Size
        System.out.println("Size: " + names.size());

        // 8. Capacity
        System.out.println("Capacity: " + names.capacity());

        // 9. Iterate
        System.out.println("All elements:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}