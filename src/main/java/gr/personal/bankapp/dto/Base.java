package gr.personal.bankapp.dto;

public abstract class Base {
    private Long id;

    public Base() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
