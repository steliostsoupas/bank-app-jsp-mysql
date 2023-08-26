package gr.personal.bankapp.model;

public class Account extends AbstractEntity {
    private Customer customer = new Customer();
    private String iban;
    private double balance;

    public Account() {}

    public Account(Customer customer, String accountNumber, Long balance) {
        this.customer = customer;
        this.iban = accountNumber;
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
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

    @Override
    public String toString() {
        return "Account{" +
                "customer=" + customer +
                ", accountNumber=" + iban +
                ", balance=" + balance +
                '}';
    }
}
