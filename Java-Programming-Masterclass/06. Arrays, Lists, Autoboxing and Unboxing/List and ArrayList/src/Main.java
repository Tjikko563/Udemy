import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mp = new MobilePhone("1234");

    public static void main(String[] args) {

        System.out.println("Available actions:");
        printChoices();
        boolean flag = true;
        while (flag) {
            System.out.println("Enter action:");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    mp.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printChoices();
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }

    }

    private static void printChoices() {
        System.out.println("0 -> Close program.\n" +
                "1 -> Print all contacts.\n" +
                "2 -> Add a new contact.\n" +
                "3 -> Update existing contact.\n" +
                "4 -> Remove existing contact.\n" +
                "5 -> Query existing contact.\n" +
                "6 -> Print Available actions.");
    }

    public static void addNewContact() {
        System.out.println("Enter contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter contact number:");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name, number);
        if (mp.addNewContact(newContact)) {
            System.out.println("New contact: " + name + ", with phone number: " + number + " has been added.");
        } else {
            System.out.println("Cannot add: " + name + ". Contact already exists.");
        }
    }

    private static void updateContact() {
        System.out.println("Enter old contact name:");
        String name = scanner.nextLine();
        Contact oldContact = mp.queryContact(name);
        if (oldContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact name:");
        name = scanner.nextLine();
        System.out.println("Enter new contact number:");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if (mp.updateContact(oldContact, newContact)) {
            System.out.println("Successfully updated contact.");
        } else {
            System.out.println("Error updating contact.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter contact name wanted for deletion:");
        String name = scanner.nextLine();
        Contact contact = mp.queryContact(name);
        if (contact == null) {
            System.out.println("Contact not found.");
            return;
        }
        if (mp.removeContact(contact)) {
            System.out.println("Successfully deleted contact.");
        } else {
            System.out.println("Error deleting contact.");
        }
    }

    public static void queryContact() {
        System.out.println("Enter contact name:");
        String name = scanner.nextLine();
        Contact contact = mp.queryContact(name);
        if (contact == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println("Contact has been found.");
        }
    }
}
