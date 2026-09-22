
package poc.LibraryManagmentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApplication {

    static Scanner scanner = new Scanner(System.in);

    static Library library = new Library();

    static int nextMemberId = 1001;

    public static void main(String[] args) {

        System.out.println();
        System.out.println("========================================");
        System.out.println("       WELCOME TO LIBRARY SYSTEM");
        System.out.println("========================================");

        while (true) {

            System.out.println();
            System.out.println("Do you have a library pass?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    login();
                    break;

                case 2:
                    createLibraryPass();
                    break;

                case 3:
                    System.out.println("Thank you for using Library System.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void createLibraryPass() {

        System.out.println();
        System.out.println("========================================");
        System.out.println("        CREATE LIBRARY PASS");
        System.out.println("========================================");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Create Pass ID: ");
        String passId = scanner.nextLine();

        System.out.print("Create Password: ");
        String password = scanner.nextLine();

        LibraryPass pass = new LibraryPass(passId, password);

        Member member = new Member(
                nextMemberId++,
                name,
                pass
        );

        System.out.println();
        System.out.println("Library Pass created successfully!");
        System.out.println("----------------------------------------");
        System.out.println("Pass ID : " + passId);
        System.out.println("Name    : " + name);
        System.out.println("----------------------------------------");

        System.out.println();
        System.out.println("Entering library...");

        memberMenu(member);
    }

    static void login() {

        System.out.println();
        System.out.println("========================================");
        System.out.println("         LIBRARY PASS LOGIN");
        System.out.println("========================================");

        System.out.print("Enter Pass ID: ");
        String passId = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        System.out.println();
        System.out.println("Library pass accepted.");
        System.out.println("Welcome to the library!");

        LibraryPass pass = new LibraryPass(passId, password);

        Member member = new Member(
                nextMemberId++,
                "Library Member",
                pass
        );

        memberMenu(member);
    }

    static void memberMenu(Member member) {

        while (true) {

            System.out.println();
            System.out.println("========================================");
            System.out.println("           LIBRARY MAIN MENU");
            System.out.println("========================================");

            System.out.println("1. View Book Genres");
            System.out.println("2. View My Books");
            System.out.println("3. Return Book");
            System.out.println("4. Logout");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    browseGenres(member);
                    break;

                case 2:
                    member.displayMyBooks();
                    break;

                case 3:
                    returnBook(member);
                    break;

                case 4:
                    System.out.println("Logged out successfully.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
    static void browseGenres(Member member) {

        while (true) {

            library.displayGenres();

            System.out.print("Enter genre choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 8) {

                return;
            }

            Genre genre = library.getGenreFromChoice(choice);

            if (genre == null) {

                System.out.println("Invalid genre choice.");

                continue;
            }

            displayBooksByGenre(member, genre);

            System.out.println();
            System.out.println("Do you want any other book?");
            System.out.println("1. Yes");
            System.out.println("2. No");

            System.out.print("Enter your choice: ");

            int anotherBook = scanner.nextInt();
            scanner.nextLine();

            if (anotherBook == 2) {

                System.out.println();
                System.out.println("Returning to main menu...");

                return;
            }
        }
    }

    static void displayBooksByGenre(Member member, Genre genre) {

        ArrayList<Book> availableBooks =
                library.getAvailableBooksByGenre(genre);

        System.out.println();
        System.out.println("========================================");
        System.out.println("        " + genre + " BOOKS");
        System.out.println("========================================");

        if (availableBooks.isEmpty()) {

            System.out.println("No books are currently available.");
            return;
        }

        for (int i = 0; i < availableBooks.size(); i++) {

            Book book = availableBooks.get(i);

            System.out.println(
                    (i + 1)
                    + ". "
                    + book.getBookName()
                    + " | Author: "
                    + book.getAuthor()
                    + " | Charge: Rs."
                    + book.getIssueCharge()
            );
        }

        System.out.println();
        System.out.println("0. Back");

        System.out.print("Select book: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 0) {
            return;
        }

        if (choice < 1 || choice > availableBooks.size()) {

            System.out.println("Invalid book choice.");
            return;
        }

        Book selectedBook = availableBooks.get(choice - 1);

        try {

            library.issueBook(
                    member,
                    selectedBook.getBookId()
            );

        } catch (BookNotAvailableException e) {

            System.out.println(e.getMessage());

        } catch (BookLimitExceededException e) {

            System.out.println(e.getMessage());

        } catch (InvalidLibraryPassException e) {

            System.out.println(e.getMessage());
        }
    }

    static void returnBook(Member member) {

        if (member.getIssuedBooks().isEmpty()) {

            System.out.println();
            System.out.println("You don't have any books to return.");
            return;
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println("             RETURN BOOK");
        System.out.println("========================================");

        ArrayList<IssueRecord> records =
                member.getIssuedBooks();

        for (int i = 0; i < records.size(); i++) {

            IssueRecord record = records.get(i);

            System.out.println(
                    (i + 1)
                    + ". "
                    + record.getBook().getBookName()
                    + " | Due: "
                    + record.getDueDate()
            );
        }

        System.out.println("0. Back");

        System.out.print("Select book: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 0) {
            return;
        }

        if (choice < 1 || choice > records.size()) {

            System.out.println("Invalid choice.");
            return;
        }

        IssueRecord selectedRecord =
                records.get(choice - 1);

        library.returnBook(
                member,
                selectedRecord.getBook().getBookId()
        );
//        inta
    }
}



//
//24. Important Java concepts covered
//
//Your POC currently covers a lot of Core Java:
//
//Concept	Where used
//Class	All classes
//Object	Book, Member, Library
//Constructor	Book, Member, IssueRecord
//Encapsulation	private fields
//Getter/Setter	Book
//Enum	Genre
//ArrayList	Books and issued books
//Exception	Custom exceptions
//try/catch	Issue operation
//throw	Custom exceptions
//static	Scanner, IDs
//final	MAX_BOOKS
//switch	Menus
//Loop	Menus/book lists
//Scanner	User input
//LocalDate	Issue/return dates
//ChronoUnit	Late-day calculation
//synchronized	Book issuing
//Composition	Member → LibraryPass / IssueRecord
//Method Overloading	Can be added later
//Inheritance	Custom exceptions
//Polymorphism	Exception hierarchy
