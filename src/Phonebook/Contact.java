package Phonebook;

public class Contact {
    private String phoneNumber;
    private String contactName;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String toString(){
        return String.format("""
                  ContactName = %s
                  PhoneNumber = %s
             
                """, this.contactName, this.phoneNumber);
    }
}
