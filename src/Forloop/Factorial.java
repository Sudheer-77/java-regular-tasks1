package Forloop;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact = isFactorial(n);

        System.out.println("Factorial = " + fact);

        sc.close();
    }

    static int isFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * isFactorial(n - 1);
    }
}