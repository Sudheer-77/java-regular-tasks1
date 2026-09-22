package poc.LibraryManagmentSystem;

public class BookNotAvailableException extends Exception {

    public BookNotAvailableException(String message) {

        super(message);
    }
}