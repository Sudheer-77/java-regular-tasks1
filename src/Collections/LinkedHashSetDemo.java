package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        // Create LinkedHashSet
        LinkedHashSet<String> players = new LinkedHashSet<>();

        // 1. Add players
        players.add("Virat Kohli");
        players.add("Rohit Sharma");
        players.add("MS Dhoni");
        players.add("Jasprit Bumrah");

        // Duplicate player
        players.add("Virat Kohli");

        System.out.println("Players: " + players);

        // 2. Size
        System.out.println("Size: " + players.size());

        // 3. Search
        if (players.contains("MS Dhoni")) {
            System.out.println("MS Dhoni is present");
        } else {
            System.out.println("MS Dhoni is not present");
        }

        // 4. Remove
        players.remove("Rohit Sharma");

        System.out.println("After removing Rohit: " + players);

        // 5. Iterate
        System.out.println("Players:");

        for (String player : players) {
            System.out.println(player);
        }

        // 6. Check empty
        System.out.println("Is empty? " + players.isEmpty());

        // 7. Clear
        players.clear();

        System.out.println("After clear: " + players);
    }
}