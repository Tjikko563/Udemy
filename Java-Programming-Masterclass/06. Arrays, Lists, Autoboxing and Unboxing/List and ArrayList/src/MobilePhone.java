import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addNewContact(Contact contact) {
        int i = findContact(contact.getName());
        if (i < 0) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int i = findContact(oldContact);
        if (i >= 0) {
            myContacts.set(i, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        int i = findContact(contact);
        if (i >= 0) {
            myContacts.remove(i);
            return true;
        }
        return false;
    }

    public Contact queryContact(String name) {
        if (findContact(name) >= 0) {
            return myContacts.get(findContact(name));
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.printf("%d. %s -> %s\n", (i + 1), myContacts.get(i).getName(), myContacts.get(i).getPhoneNumber());
        }
    }

}