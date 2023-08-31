package gr.personal.bankapp.service.exceptions;

import gr.personal.bankapp.model.Account;

public class CustomerIdAlreadyExistsException extends Exception {
    private static final long serialVersionUID = 1L;

    public CustomerIdAlreadyExistsException(Account account) {
        super("Account with id " + account.getId() + " already exists");
    }
}
