import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransaction) {
        Customer newCustomer = findCustomer(name);
        if (newCustomer == null) {
            newCustomer = new Customer(name, initialTransaction);
            customers.add(newCustomer);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double newTransaction) {
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null) {
            int i = customers.indexOf(existingCustomer);
            customers.get(i).addTransaction(newTransaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(customer)) {
                return customers.get(i);
            }
        }
        return null;
    }


}
