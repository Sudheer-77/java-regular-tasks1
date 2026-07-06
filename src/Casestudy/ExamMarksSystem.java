package Casestudy;

import java.util.Scanner;

public class ExamMarksSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks = 0;
        int attemptedQuestions = 0;

        System.out.println("Enter the response for 20 questions:");
        System.out.println("1 = Correct");
        System.out.println("0 = Incorrect");
        System.out.println("-1 = Not Attempted");

        for (int i = 1; i <= 20; i++) {

            System.out.print("Question " + i + ": ");
            int answer = sc.nextInt();

            if (answer == 1) {
                marks++;
                attemptedQuestions++;
            } 
            else if (answer == 0) {
                attemptedQuestions++;
            } 
            else if (answer == -1) {
  
                continue;
            } 
            else {
                System.out.println("Invalid input! Please enter 1, 0 or -1.");
                i--; 
            }
        }

        double percentage = (marks / 20.0) * 100;

        System.out.println("\n----- Result -----");
        System.out.println("Attempted Questions : " + attemptedQuestions);
        System.out.println("Marks Scored        : " + marks);
        System.out.println("Percentage          : " + percentage + "%");

        sc.close();
    }
}