package udemy_constructor;

public class VipCustomer {
    private String name;
    private String creditLimit;
    private String email;

    public VipCustomer() {
        this("Uknown name", "1000", "Unknown email");
    }

    public VipCustomer(String name, String creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(String name, String email) {
        this(name, "1000", email);
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
