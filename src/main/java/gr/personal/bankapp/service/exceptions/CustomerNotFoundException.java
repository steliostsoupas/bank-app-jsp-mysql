package gr.personal.bankapp.service.exceptions;

import gr.personal.bankapp.model.Account;

public class CustomerNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public CustomerNotFoundException(Account account) {
        super("The customer with iban " + account.getIban() + " was not found");
    }

    public CustomerNotFoundException(String  iban) {
        super("The customer with iban " + iban + " was not found");
    }

    public CustomerNotFoundException(long id) {
        super("The customer with id " + id + " was not found");
    }

}
