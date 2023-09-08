package gr.personal.bankapp.dto;

public class LoanReadOnlyDTO extends Base {
    private Long loanAmount;
    private String approvalStatus;

    public LoanReadOnlyDTO() {}

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
}
