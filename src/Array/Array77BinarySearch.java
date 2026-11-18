
package Array;

public class Array77BinarySearch {

    public static void main(String[] args) {

        int arr[] = {20, 30, 40, 50, 55, 67};

        int target = 57;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {

                System.out.println("Element found: " + arr[mid]);
                return;
            }

            if (arr[mid] > target) {

                right = mid - 1;

            } else {

                left = mid + 1;
            }
        }

        System.out.println("Element not found");
    }
}
