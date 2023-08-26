package gr.personal.bankapp.model;

public class Loan extends AbstractEntity {
    private Long loanAmount;
    private String approvalStatus;

    public Loan() {}

    public Loan(Long loanAmount, String approvalStatus) {
        this.loanAmount = loanAmount;
        this.approvalStatus = approvalStatus;
    }

    public Long getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Long loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanAmount=" + loanAmount +
                ", approvalStatus='" + approvalStatus + '\'' +
                '}';
    }
}
