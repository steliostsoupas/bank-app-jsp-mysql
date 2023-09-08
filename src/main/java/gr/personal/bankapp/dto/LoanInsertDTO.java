package gr.personal.bankapp.dto;

public class LoanInsertDTO extends Base {
    private Long loanAmount;
    private String approvalStatus;

    public LoanInsertDTO() {}

    public LoanInsertDTO(Long loanAmount, String approvalStatus) {
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
