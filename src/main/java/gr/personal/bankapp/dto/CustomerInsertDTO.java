package gr.personal.bankapp.dto;

public class CustomerInsertDTO extends Base {
    private String firstname;
    private String lastname;
    private String contactInfo;
    private String dateOfBirth;
    private String address;
    private String ssn;

    public CustomerInsertDTO() {}

    public CustomerInsertDTO(String firstname, String lastname, String contactInfo, String dateOfBirth, String address, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactInfo = contactInfo;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
