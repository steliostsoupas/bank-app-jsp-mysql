package gr.personal.bankapp.service.exceptions;

public class SsnNotValidException extends Exception {
    private static final long serialVersionUID = 1L;

    public SsnNotValidException(){}

    public SsnNotValidException(String ssn) {
        super("Ssn " + ssn + "is not valid");
    }
}
