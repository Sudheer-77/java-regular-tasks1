package Collections;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("RAJU");
        names.add("KIRAN");
        names.add("ARUN");

        System.out.println("Before update: " + names);

        // Update KIRAN to RAHUL
        names.set(1, "RAHUL");

        System.out.println("After update: " + names);
    }
}