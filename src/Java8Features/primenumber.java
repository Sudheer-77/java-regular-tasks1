
package Java8Features;

import java.util.Scanner;

// Functional Interface
interface In {
    public abstract void isprime(int a);
}

public class primenumber {

    public static void main(String args[]) {

        // Lambda expression
        In i = (a) -> {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a value:");
            int num = sc.nextInt();

            int count = 0;

            // Check divisibility
            for (int j = 2; j < num; j++) {

                if (num % j == 0) {
                    count++;
                }
            }

            // Prime number has no divisors other than 1 and itself
            if (count == 0) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }

            sc.close();
        };

        // Calling the abstract method
        i.isprime(0);
    }
}

