import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        Branch newBranch = findBranch(name);
        if (newBranch == null) {
            newBranch = new Branch(name);
            branches.add(newBranch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            return existingBranch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double newCustomerTransaction) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            return existingBranch.addCustomerTransaction(customerName, newCustomerTransaction);
        }
        return false;
    }

    private Branch findBranch(String name) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(name)) {
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            System.out.println("Customer details for branch " + branchName);
            if (printTransactions) {
                for (int i = 0; i < existingBranch.getCustomers().size(); i++) {
                    System.out.printf("Customer: %s[%d]\nTransactions\n", existingBranch.getCustomers().get(i).getName(), (i + 1));
                    for (int j = 0; j < existingBranch.getCustomers().get(i).getTransactions().size(); j++) {
                        System.out.printf("[%d]  Amount %.2f\n", (j +  1), existingBranch.getCustomers().get(i).getTransactions().get(j));
                    }
                }
            } else {
                for (int i = 0; i < existingBranch.getCustomers().size(); i++) {
                    System.out.printf("Customer: %s[%d]\n", existingBranch.getCustomers().get(i).getName(), (i + 1));
                }
            }
            return true;
        }
        return false;
    }
}
