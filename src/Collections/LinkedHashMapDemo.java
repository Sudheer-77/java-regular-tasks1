package Collections;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        // Create LinkedHashMap
        LinkedHashMap<Integer, String> players = new LinkedHashMap<>();

        // 1. Add players
        players.put(18, "Virat Kohli");
        players.put(45, "Rohit Sharma");
        players.put(7, "MS Dhoni");
        players.put(93, "Jasprit Bumrah");
        players.put(8, "Ravindra Jadeja");

        System.out.println("Players: " + players);

        // 2. Get value using key
        System.out.println("Jersey 18: " + players.get(18));

        // 3. Update value
        players.put(18, "Virat Kohli - King");

        System.out.println("After update: " + players);

        // 4. Check key
        System.out.println("Jersey 45 present? "
                + players.containsKey(45));

        // 5. Check value
        System.out.println("MS Dhoni present? "
                + players.containsValue("MS Dhoni"));

        // 6. Remove
        players.remove(93);

        System.out.println("After removing Bumrah: " + players);

        // 7. Size
        System.out.println("Size: " + players.size());

        // 8. Iterate using entrySet()
        System.out.println("\nPlayers:");

        for (var entry : players.entrySet()) {
            System.out.println(
                entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}