package Collections.programs;

import java.util.Arrays;
import java.util.List;

public class TestMaximumAndSecondhighestNumbersInList {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 40, 20, 50, 30);

        int max = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : numbers) {

            if (num > max) {
                secondHighest = max;
                max = num;
            } 
            else if (num > secondHighest && num != max) {
                secondHighest = num;
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Second Highest: " + secondHighest);
    }
}