package poc.LibraryManagmentSystem;

public class LibraryPass {

    private String passId;
    private String password;

    public LibraryPass(String passId, String password) {

        this.passId = passId;
        this.password = password;
    }

    public String getPassId() {
        return passId;
    }

    public boolean verifyPassword(String password) {

        return this.password.equals(password);
    }
}