package Labtaska;

import java.util.Scanner;

public class Nperfectnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        System.out.println("Perfect numbers under " + n + " are:");

        for (int num = 2; num < n; num++) {
            int sum = 0;

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (sum == num) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}