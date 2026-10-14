package Collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        // Create PriorityQueue
        PriorityQueue<Integer> scores = new PriorityQueue<>();

        // 1. Add scores
        scores.offer(85);
        scores.offer(45);
        scores.offer(120);
        scores.offer(60);

        System.out.println("Scores: " + scores);

        // 2. Peek
        // Shows the highest-priority element
        // For Integer, smallest value has priority
        System.out.println("Highest priority score: " + scores.peek());

        // 3. Poll
        // Removes the highest-priority element
        System.out.println("Removed: " + scores.poll());

        System.out.println("After poll: " + scores);

        // 4. Add another score
        scores.offer(30);

        System.out.println("After adding 30: " + scores);

        // 5. Check size
        System.out.println("Size: " + scores.size());

        // 6. Search
        System.out.println("Is 60 present? " + scores.contains(60));

        // 7. Iterate
        System.out.println("Elements:");

        while (!scores.isEmpty()) {
            System.out.println(scores.poll());
        }
    }
}