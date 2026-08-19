package Array;

public class Array61StringFrequency {

    public static void main(String[] args) {

        String[] arr = {"Java", "SQL", "Java", "Python", "SQL", "Java"};

        for (int i = 0; i < arr.length; i++) {

            int count = 1;

            // Check whether this String was already processed
            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i].equals(arr[k])) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            // Count frequency
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }

            System.out.println(arr[i] + " = " + count);
        }
    }
}