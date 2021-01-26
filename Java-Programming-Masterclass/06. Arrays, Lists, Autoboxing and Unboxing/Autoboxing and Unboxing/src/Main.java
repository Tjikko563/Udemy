import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("People's bank");

    public static void main(String[] args) {
        System.out.println("Available actions");
        printActions();
        boolean flag = true;

        while (flag) {
            System.out.println("Enter action: ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    addBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    addCustomerTransaction();
                    break;
                case 4:
                    listCustomers();
                    break;
                case 5:
                    printActions();
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }

    private static void printActions() {
        System.out.println("0 -> Close program.\n" +
                "1 -> Add a new branch.\n" +
                "2 -> Add a new customer.\n" +
                "3 -> Add a new customer transaction.\n" +
                "4 -> List customers and/or customer transactions in given branch.\n" +
                "5 -> Print available actions.");
    }

    private static void addBranch() {
        System.out.println("Add branch name:");
        String branchName = scanner.nextLine();
        if (bank.addBranch(branchName)) {
            System.out.println("New branch added.");
        } else {
            System.out.println("Branch already exists.");
        }
    }

    private static void addCustomer() {
        System.out.println("Enter branch name:");
        String branchName = scanner.nextLine();
        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();
        System.out.println("Enter initial transaction");
        double initialTransaction = scanner.nextDouble();
        scanner.nextLine();
        if (bank.addCustomer(branchName, customerName, initialTransaction)) {
            System.out.println("Customer successfully added.");
        } else {
            System.out.println("Error adding customer.");
        }
    }

    private static void addCustomerTransaction() {
        System.out.println("Enter branch name:");
        String branchName = scanner.nextLine();
        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();
        System.out.println("Enter new transaction");
        double newTransaction = scanner.nextDouble();
        scanner.nextLine();
        if (bank.addCustomerTransaction(branchName, customerName, newTransaction)) {
            System.out.println("Transaction successfully added.");
        } else {
            System.out.println("Error adding transaction.");
        }
    }

    private static void listCustomers() {
        System.out.println("Enter branch name:");
        String branchName = scanner.nextLine();
        System.out.println("Print customer transactions? Type 'true' for yes, and 'false' for no.");
        boolean printTransactions = scanner.nextBoolean();
        scanner.nextLine();
        if (printTransactions) {
            if (bank.listCustomers(branchName, true)) {
                System.out.println("Customers have been printed.");
            } else {
                System.out.println("Error printing customers.");
            }
        } else {
            if (bank.listCustomers(branchName, false)) {
                System.out.println("Customers have been printed.");
            } else {
                System.out.println("Error printing customers.");
            }
        }
    }
}
