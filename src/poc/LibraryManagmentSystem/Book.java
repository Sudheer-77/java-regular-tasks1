package poc.LibraryManagmentSystem;

public class Book {

    private int bookId;
    private String bookName;
    private String author;
    private Genre genre;
    private double issueCharge;
    private double lateFeePerDay;
    private boolean available;

    public Book(int bookId, String bookName, String author,
                Genre genre, double issueCharge, double lateFeePerDay) {

        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.genre = genre;
        this.issueCharge = issueCharge;
        this.lateFeePerDay = lateFeePerDay;
        this.available = true;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public double getIssueCharge() {
        return issueCharge;
    }

    public double getLateFeePerDay() {
        return lateFeePerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayBook() {

        System.out.println("Book ID       : " + bookId);
        System.out.println("Book Name     : " + bookName);
        System.out.println("Author        : " + author);
        System.out.println("Genre         : " + genre);
        System.out.println("Issue Charge  : ₹" + issueCharge);
        System.out.println("Late Fee/Day  : ₹" + lateFeePerDay);
        System.out.println("Status        : "
                + (available ? "Available" : "Issued"));
        System.out.println("--------------------------------");
    }
}
//
//Why private?
//
//Because we're using encapsulation.
//
//The data cannot be directly accessed from outside.
//Interview answer
//
//What is encapsulation?
//
//Encapsulation means wrapping data and methods together inside
//a class and restricting direct access to the data using access modifiers such as private.