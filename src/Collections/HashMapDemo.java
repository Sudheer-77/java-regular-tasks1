package Collections;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, String> players = new HashMap<>();

        // 1. Add key-value pairs
        players.put(18, "Virat Kohli");
        players.put(45, "Rohit Sharma");
        players.put(7, "MS Dhoni");
        players.put(93, "Jasprit Bumrah");

        System.out.println("Players: " + players);

        // 2. Get value using key
        System.out.println("Player with jersey 18: "
                + players.get(18));

        // 3. Update value
        players.put(18, "Virat Kohli - King");

        System.out.println("After update: " + players);

        // 4. Check key
        System.out.println("Is jersey 45 present? "
                + players.containsKey(45));

        // 5. Check value
        System.out.println("Is MS Dhoni present? "
                + players.containsValue("MS Dhoni"));

        // 6. Remove using key
        players.remove(93);

        System.out.println("After removing Bumrah: " + players);

        // 7. Size
        System.out.println("Size: " + players.size());

        // 8. Iterate using keySet()
        System.out.println("\nJersey Numbers:");

        for (Integer jersey : players.keySet()) {
            System.out.println(jersey);
        }

        // 9. Iterate using values()
        System.out.println("\nPlayers:");

        for (String player : players.values()) {
            System.out.println(player);
        }

        // 10. Iterate using entrySet()
        System.out.println("\nJersey and Player:");

        for (var entry : players.entrySet()) {
            System.out.println(
                entry.getKey() + " → " + entry.getValue()
            );
        }
    }
}