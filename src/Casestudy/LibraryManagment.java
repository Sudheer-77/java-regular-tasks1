package Casestudy;

import java.util.Scanner;

public class LibraryManagment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("     LIBRARY MANAGEMENT SYSTEM");
        System.out.println("====================================");

     
        System.out.print("Do you have a library card? (yes/no): ");
        String s = sc.nextLine();

        if (s.equalsIgnoreCase("yes")) {

            System.out.println("\nChecking library card... Please wait...");

            
            System.out.print("Enter number of books already borrowed: ");
            int count = sc.nextInt();

            if (count >= 3) {

                System.out.println("\nBorrowing limit reached.");
                System.out.println("You cannot borrow another book.");

            } else {

                System.out.println("\nYou are eligible to borrow a book.");

                System.out.println("\nSelect Book Category");
                System.out.println("1. Fiction");
                System.out.println("2. Science");
                System.out.println("3. History");

                System.out.print("Enter your choice: ");
                int n = sc.nextInt();

                if (n == 1) {

                    System.out.println("\nAvailable Fiction Books");
                    System.out.println("1. Harry Potter");
                    System.out.println("2. The Hobbit");
                    System.out.println("3. Sherlock Holmes");
                    System.out.println("Borrow Period : 7 Days");

                } else if (n == 2) {

                    System.out.println("\nAvailable Science Books");
                    System.out.println("1. Physics Fundamentals");
                    System.out.println("2. Chemistry Basics");
                    System.out.println("3. Biology Today");
                    System.out.println("Borrow Period : 14 Days");

                } else if (n == 3) {

                    System.out.println("\nAvailable History Books");
                    System.out.println("1. Indian History");
                    System.out.println("2. World War II");
                    System.out.println("3. Ancient Civilizations");
                    System.out.println("Borrow Period : 21 Days");

                } else {

                    System.out.println("\nInvalid Category Entered.");

                }

            }

        } else {

            System.out.println("\nLibrary card required to borrow books.");

        }

        System.out.println("\nThank you for using the Library Management System.");

        sc.close();
    }
}

//Java

//C
//
//1. You are developing a Library Management System to issue books to students. Design a Java program that satisfies the following:
//
//a. Ask the student whether they have a library card (Yes/No).
//
//d.
//
//3 books, display "Borrowing limit reached. You cannot
//
//e
//
//If the student has a library card, check the number of books already borrowed.
//
//If the student has already borrowed 3 books,
//
//borrow another book."
//
//Otherwise, ask the student to select a book category:
//
//i Fiction, 2 Science, 3→ History
//
//Displav the borrowing period based on the selected category:
//
//Fiction 7 days, Science 14 days, History→ 21 days
//
//If the student does not have a library card, display "Library card required to borrow books."
//
//Display "Invalid Category" if an invalid option is entered.

