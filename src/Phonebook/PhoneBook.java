package Phonebook;

import java.util.ArrayList;

public class PhoneBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    private Contact contact = new Contact();

    public void addContact(String contactName, String contactnumber) throws Exception {
        Contact contact = new Contact();
        if (checkIfNameOrNumberAlreadyExists(contactName, contactnumber) == false)
            throw new RuntimeException("Name or PhoneNumber already Exists. Choose Something Different.");
        contact.setContactName(contactName);
        contact.setPhoneNumber(contactnumber);
        contacts.add(contact);
    }

    public boolean checkIfNameOrNumberAlreadyExists(String contactname, String contactNumber) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            Boolean invalid = contact.getContactName().equalsIgnoreCase(contactname) || contact.getPhoneNumber().equalsIgnoreCase(contactNumber);
            if (invalid) return false;
        }
        return true;
    }

    public String findContact (String nameOrPhoneNumber){
        Contact contact = findValidContact(nameOrPhoneNumber);
        if (contact == null) throw new RuntimeException("Contact Not Found");
        return contact.toString();
    }
    public Contact findValidContact(String nameOrPhoneNumber) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            boolean validContact = (contact.getContactName().equalsIgnoreCase(nameOrPhoneNumber) || contact.getPhoneNumber().equalsIgnoreCase(nameOrPhoneNumber));
            boolean invalidContact = validContact == false;
            if (validContact) return contact;
            if (invalidContact) throw new RuntimeException("Contact does not exist");
        }
        return null;
    }
    public void editContactName(String oldcontactName, String newContactName) {
        if (findContact(oldcontactName) == null) throw new RuntimeException("not found");
        Contact contact = findValidContact(oldcontactName);
        contact.setContactName(newContactName);
        }
    public void editContactNumber(String oldcontactNumber, String newContactNumber) {
        if (findContact(oldcontactNumber) == null) throw new RuntimeException("not found");
        Contact contact = findValidContact(oldcontactNumber);
        contact.setPhoneNumber(newContactNumber);
    }
    public void deleteContact(String nameOrPhoneNumber) {
        if (findContact(nameOrPhoneNumber) == null) throw new RuntimeException("not found");
        Contact contact = findValidContact(nameOrPhoneNumber);
        contacts.remove(contact);
    }

    public int totalNumberOfContacts(){
        return contacts.size();
    }

}
