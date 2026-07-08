package Labtaska;

import java.util.Scanner;

public class Magicnumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;

        while (n > 9) {
            int sum = 0;

            while (n > 0) {
                int r = n % 10;
                sum = sum + r;
                n = n / 10;
            }

            n = sum;
        }

        if (n == 1) {
            System.out.println(original + " is a Magic Number");
        } else {
            System.out.println(original + " is Not a Magic Number");
        }

        sc.close();
    }
}