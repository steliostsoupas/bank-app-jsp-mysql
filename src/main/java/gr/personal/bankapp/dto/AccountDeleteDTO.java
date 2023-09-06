package gr.personal.bankapp.dto;

public class AccountDeleteDTO extends Base {
    private CustomerInsertDTO customer;
    private String iban;
    private double balance;

    public AccountDeleteDTO() {}

    public AccountDeleteDTO(CustomerInsertDTO customer, String iban, double balance) {
        this.customer = customer;
        this.iban = iban;
        this.balance = balance;
    }

    public CustomerInsertDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerInsertDTO customer) {
        this.customer = customer;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
