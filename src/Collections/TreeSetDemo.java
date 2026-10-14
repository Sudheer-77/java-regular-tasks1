package Collections;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        // Create TreeSet
        TreeSet<String> players = new TreeSet<>();

        // 1. Add players
        players.add("Virat Kohli");
        players.add("Rohit Sharma");
        players.add("MS Dhoni");
        players.add("Jasprit Bumrah");
        players.add("Ravindra Jadeja");

        // Duplicate
        players.add("Virat Kohli");

        System.out.println("Players: " + players);

        // 2. Size
        System.out.println("Size: " + players.size());

        // 3. Search
        if (players.contains("MS Dhoni")) {
            System.out.println("MS Dhoni is present");
        }

        // 4. Remove
        players.remove("Rohit Sharma");

        System.out.println("After removing Rohit: " + players);

        // 5. First element
        System.out.println("First player: " + players.first());

        // 6. Last element
        System.out.println("Last player: " + players.last());

        // 7. Iterate
        System.out.println("Players:");

        for (String player : players) {
            System.out.println(player);
        }
    }
}