import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        // System.out.println("Creating new mobile phone with number: " + myNumber);

        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    // should be called contactExists?
    public boolean addNewContact(Contact contact) {
        // System.out.println("In addNewContact: " + contact.getName() + " " + contact.getPhoneNumber() + contact);
        if(!(findContact(contact) >= 0)){
            myContacts.add(contact);
            return true;
        };
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        // System.out.println("In updateContact: " + oldContact.getName() + " " + oldContact.getPhoneNumber());
        // System.out.println("In updateContact: " + newContact.getName() + " " + newContact.getPhoneNumber());

        if (findContact(oldContact) >= 0) {
            myContacts.set(findContact(oldContact), newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        // System.out.println("In removeContact: " + contact.getName() + " " + contact.getPhoneNumber());
        if(findContact(contact) >= 0) {
            myContacts.remove(contact);
            return true;
        };
        return false;
    }

    private int findContact(Contact contact) {
        // System.out.println("In findContact: " + contact.getName() + " " + contact.getPhoneNumber() + contact);
        // System.out.println("Index with indexOf: " + myContacts.indexOf(contact));
        // System.out.println("Index with findContact: " + findContact(contact.getName()));
        return findContact(contact);
    }

    private int findContact(String searchString) {
        for(int i = 0; i < myContacts.size(); i++) {
            if(myContacts.get(i).getName() == searchString) return i;
        }
        return -1;
    }

    public Contact queryContact(String searchString) {
        int index = findContact(searchString);
        if(index >= 0) return myContacts.get(index);
        return null;
    }

    public void printContacts() {
        int i = 1;
        System.out.println("Contact List: ");
        for (Contact contact : myContacts) {
            System.out.println(i + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
            i++;
        }
    }
}
