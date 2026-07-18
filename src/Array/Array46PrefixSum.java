package Array;

public class Array46PrefixSum {

    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 10};

        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.println("Prefix Sum:");

        for (int i = 0; i < prefix.length; i++) {
            System.out.print(prefix[i] + " ");
        }
    }
}