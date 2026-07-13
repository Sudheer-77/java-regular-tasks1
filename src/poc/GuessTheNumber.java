package poc;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber = 0;
     int   chooice=5;
     String s;

        do {
        	  System.out.println("Guess my number (1-100): ");
            for(int i=0;i<chooice;i++) {
            	
                  userNumber = sc.nextInt();
            if (userNumber == myNumber) {
                System.out.println("WOOHOO .. CORRECT NUMBER!!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your number is too large.");
            } else {
                System.out.println("Your number is too small.");
            }
        }
            System.out.println(" your choices have been completed");
           System.out.println("do you want to continue yes/no");
           sc.nextLine();
           s=sc.nextLine();
            } while (s.equals("yes"));

       System.out.println("My number was: " + myNumber);
    }
}
