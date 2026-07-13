package Array;

public class Com18lastdigitwithoutSymbol {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Array Elements:");

        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
              
                System.out.print(arr[i]);
            } else {
     
                System.out.print(arr[i] + " | ");
            }
        }
    }
}