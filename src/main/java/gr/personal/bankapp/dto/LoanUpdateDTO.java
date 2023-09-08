package gr.personal.bankapp.dto;

public class LoanUpdateDTO extends Base {
    private Long loanAmount;
    private String approvalStatus;

    public LoanUpdateDTO() {}

    public LoanUpdateDTO(Long loanAmount, String approvalStatus) {
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
}
