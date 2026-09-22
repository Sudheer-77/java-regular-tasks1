package poc.LibraryManagmentSystem;

import java.util.ArrayList;

public class Member {

    private int memberId;
    private String name;
    private LibraryPass libraryPass;
    private ArrayList<IssueRecord> issuedBooks;

    private static final int MAX_BOOKS = 3;

    public Member(int memberId, String name, LibraryPass libraryPass) {

        this.memberId = memberId;
        this.name = name;
        this.libraryPass = libraryPass;
        this.issuedBooks = new ArrayList<>();
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public LibraryPass getLibraryPass() {
        return libraryPass;
    }

    public ArrayList<IssueRecord> getIssuedBooks() {
        return issuedBooks;
    }

    public boolean canBorrowBook() {

        return issuedBooks.size() < MAX_BOOKS;
    }

    public void addIssuedBook(IssueRecord record) {

        issuedBooks.add(record);
    }

    public void removeIssuedBook(IssueRecord record) {

        issuedBooks.remove(record);
    }

    public void displayMyBooks() {

        System.out.println();
        System.out.println("========================================");
        System.out.println("             MY BOOKS");
        System.out.println("========================================");

        if (issuedBooks.isEmpty()) {

            System.out.println("You have no books.");
            return;
        }

        for (IssueRecord record : issuedBooks) {

            record.displayRecord();
        }

        System.out.println("Books Taken: "
                + issuedBooks.size() + "/" + MAX_BOOKS);
    }
}