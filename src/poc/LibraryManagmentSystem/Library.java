package poc.LibraryManagmentSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {

    private ArrayList<Book> books;
    private Map<String, Member> members;

    public Library() {

        books = new ArrayList<>();
        members = new HashMap<>();

        loadBooks();
    }

    private void loadBooks() {

        books.add(new Book(
                101,
                "Java Programming",
                "James Gosling",
                Genre.PROGRAMMING,
                20,
                10
        ));

        books.add(new Book(
                102,
                "Effective Java",
                "Joshua Bloch",
                Genre.PROGRAMMING,
                25,
                10
        ));

        books.add(new Book(
                103,
                "Clean Code",
                "Robert Martin",
                Genre.PROGRAMMING,
                25,
                10
        ));

        books.add(new Book(
                104,
                "Head First Java",
                "Kathy Sierra",
                Genre.PROGRAMMING,
                20,
                8
        ));

        books.add(new Book(
                201,
                "Harry Potter",
                "J.K. Rowling",
                Genre.FANTASY,
                30,
                15
        ));

        books.add(new Book(
                202,
                "The Hobbit",
                "J.R.R. Tolkien",
                Genre.FANTASY,
                25,
                12
        ));

        books.add(new Book(
                301,
                "Sapiens",
                "Yuval Noah Harari",
                Genre.HISTORY,
                25,
                12
        ));

        books.add(new Book(
                302,
                "India After Gandhi",
                "Ramachandra Guha",
                Genre.HISTORY,
                30,
                15
        ));

        books.add(new Book(
                401,
                "Atomic Habits",
                "James Clear",
                Genre.SELF_HELP,
                20,
                10
        ));

        books.add(new Book(
                402,
                "The 7 Habits",
                "Stephen Covey",
                Genre.SELF_HELP,
                20,
                10
        ));

        books.add(new Book(
                501,
                "A Brief History of Time",
                "Stephen Hawking",
                Genre.SCIENCE,
                30,
                15
        ));

        books.add(new Book(
                601,
                "Steve Jobs",
                "Walter Isaacson",
                Genre.BIOGRAPHY,
                25,
                12
        ));

        books.add(new Book(
                701,
                "The Alchemist",
                "Paulo Coelho",
                Genre.FICTION,
                20,
                10
        ));
    }

    public void registerMember(Member member) {

        members.put(member.getLibraryPass().getPassId(), member);
    }

    public Member getMember(String passId) {

        return members.get(passId);
    }

    public void displayGenres() {

        System.out.println();
        System.out.println("========================================");
        System.out.println("             BOOK GENRES");
        System.out.println("========================================");

        System.out.println("1. Fiction");
        System.out.println("2. Programming");
        System.out.println("3. Science");
        System.out.println("4. History");
        System.out.println("5. Biography");
        System.out.println("6. Fantasy");
        System.out.println("7. Self Help");
        System.out.println("8. Back");
    }

    public Genre getGenreFromChoice(int choice) {

        switch (choice) {

            case 1:
                return Genre.FICTION;

            case 2:
                return Genre.PROGRAMMING;

            case 3:
                return Genre.SCIENCE;

            case 4:
                return Genre.HISTORY;

            case 5:
                return Genre.BIOGRAPHY;

            case 6:
                return Genre.FANTASY;

            case 7:
                return Genre.SELF_HELP;

            default:
                return null;
        }
    }

    public ArrayList<Book> getAvailableBooksByGenre(Genre genre) {

        ArrayList<Book> result = new ArrayList<>();

        for (Book book : books) {

            if (book.getGenre() == genre && book.isAvailable()) {

                result.add(book);
            }
        }

        return result;
    }

    public Book findBookById(int bookId) {

        for (Book book : books) {

            if (book.getBookId() == bookId) {

                return book;
            }
        }

        return null;
    }

    public synchronized void issueBook(Member member, int bookId)
            throws BookNotAvailableException,
            BookLimitExceededException,
            InvalidLibraryPassException {

        if (member == null) {

            throw new InvalidLibraryPassException(
                    "Invalid library pass."
            );
        }

        if (!member.canBorrowBook()) {

            throw new BookLimitExceededException(
                    "You already have 3 books. Return a book before borrowing another."
            );
        }

        Book book = findBookById(bookId);

        if (book == null) {

            throw new BookNotAvailableException(
                    "Book does not exist."
            );
        }

        if (!book.isAvailable()) {

            throw new BookNotAvailableException(
                    "This book is already issued to another member."
            );
        }

        book.setAvailable(false);

        IssueRecord record = new IssueRecord(book);

        member.addIssuedBook(record);

        System.out.println();
        System.out.println("========================================");
        System.out.println("       BOOK ISSUED SUCCESSFULLY");
        System.out.println("========================================");

        System.out.println("Book          : " + book.getBookName());
        System.out.println("Issue Charge  : Rs." + book.getIssueCharge());
        System.out.println("Issue Date    : " + record.getIssueDate());
        System.out.println("Due Date      : " + record.getDueDate());
        System.out.println("Late Fee/Day  : Rs." + book.getLateFeePerDay());
    }

    public void returnBook(Member member, int bookId) {

        IssueRecord selectedRecord = null;

        for (IssueRecord record : member.getIssuedBooks()) {

            if (record.getBook().getBookId() == bookId) {

                selectedRecord = record;
                break;
            }
        }

        if (selectedRecord == null) {

            System.out.println("You have not issued this book.");
            return;
        }

        selectedRecord.returnBook();

        Book book = selectedRecord.getBook();

        book.setAvailable(true);

        member.removeIssuedBook(selectedRecord);

        System.out.println();
        System.out.println("========================================");
        System.out.println("        BOOK RETURNED SUCCESSFULLY");
        System.out.println("========================================");

        System.out.println("Book          : " + book.getBookName());
        System.out.println("Return Date   : " + selectedRecord.getReturnDate());
        System.out.println("Issue Charge  : Rs." + book.getIssueCharge());
        System.out.println("Late Days     : " + selectedRecord.getLateDays());
        System.out.println("Late Fee      : Rs." + selectedRecord.calculateLateFee());
        System.out.println("Total Charge  : Rs." + selectedRecord.getTotalCharge());
    }
}