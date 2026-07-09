package Array;

import java.util.Scanner;

public class Con9SecondhighestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        System.out.println("Enter array elements:");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int secondMax = arr[0];
        int min = arr[0];
        int secondMin = arr[0];
        

        for (int i = 1; i < n; i++) {

            // Maximum and Second Maximum
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }

            // Minimum
            if (arr[i] < min) {
            	secondMin=min;
                min = arr[i];
                
            }
            else if (arr[i]<secondMin && arr[i]!=min)
            {
            	secondMin=arr[i];
            }
        }

        System.out.println("Maximum number is : " + max);
        System.out.println("Second Maximum number is : " + secondMax);
        System.out.println("Minimum number is : " + min);
        System.out.println("Second Minimum number is : " + secondMin);

        sc.close();
    }
}