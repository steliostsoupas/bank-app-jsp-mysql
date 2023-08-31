package gr.personal.bankapp.service.exceptions;

import gr.personal.bankapp.model.Account;

public class IbanNotFoundException extends Throwable {
    private final static long serialVersionUID = 1L;

    public IbanNotFoundException(Account account) {
        super("Account with iban number " + account.getIban() + " already exists");
    }
}
