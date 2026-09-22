package poc.LibraryManagmentSystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class IssueRecord {

    private Book book;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

    public IssueRecord(Book book) {

        this.book = book;

        this.issueDate = LocalDate.now();

        this.dueDate = issueDate.plusDays(7);
    }

    public Book getBook() {

        return book;
    }

    public LocalDate getIssueDate() {

        return issueDate;
    }

    public LocalDate getDueDate() {

        return dueDate;
    }

    public LocalDate getReturnDate() {

        return returnDate;
    }

    public void returnBook() {

        this.returnDate = LocalDate.now();
    }

    public long getLateDays() {

        LocalDate date = returnDate;

        if (date == null) {

            date = LocalDate.now();
        }

        if (date.isAfter(dueDate)) {

            return ChronoUnit.DAYS.between(dueDate, date);
        }

        return 0;
    }

    public double calculateLateFee() {

        return getLateDays() * book.getLateFeePerDay();
    }

    public double getTotalCharge() {

        return book.getIssueCharge() + calculateLateFee();
    }

    public void displayRecord() {

        System.out.println("Book       : " + book.getBookName());
        System.out.println("Issue Date : " + issueDate);
        System.out.println("Due Date   : " + dueDate);

        if (returnDate != null) {

            System.out.println("Return Date: " + returnDate);
            System.out.println("Late Days  : " + getLateDays());
            System.out.println("Late Fee   : Rs." + calculateLateFee());
            System.out.println("Total      : Rs." + getTotalCharge());

        } else {

            System.out.println("Status     : Currently Issued");
        }

        System.out.println("----------------------------------------");
    }
}