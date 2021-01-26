public class VipCustomer {
    private String customerName;
    private double customerCreditLimit;
    private String customerEmail;

    public VipCustomer() {
        this("Default name", 0.00, "Default email");
    }

    public VipCustomer(String customerName, double customerCreditLimit) {
        this(customerName, customerCreditLimit, "Default email");
    }

    public VipCustomer(String customerName, double customerCreditLimit, String customerEmail) {
        this.customerName = customerName;
        this.customerCreditLimit = customerCreditLimit;
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCustomerCreditLimit() {
        return customerCreditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
