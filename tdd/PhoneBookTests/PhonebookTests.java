package PhoneBookTests;

import Phonebook.Contact;
import Phonebook.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhonebookTests {

    private PhoneBook phoneBook;
    private Contact contact;

    @BeforeEach
    public void setup() {
        phoneBook = new PhoneBook();
        contact = new Contact();
    }

    @Test
    public void addContactTest() throws Exception {
        String expected = """
                ContactName = Samuel
                PhoneNumber = 09051243133
                     
                        """;
        phoneBook.addContact("Samuel", "09051243133");
        //  assertEquals(expected, phoneBook.findContact("Samuel"));
        System.out.println(phoneBook.findContact("Samuel"));
    }

    @Test
    public void testThatUserCannotSetNameOrPhoneNumberThatAlreadyExists() throws Exception {
        phoneBook.addContact("Samuel", "09051243133");
        //  phoneBook.addContact("Samuel", "09051243133");
        // assertThrows(RuntimeException.class, () -> phoneBook.addContact("Samuel", "09051243133"));

        System.out.println(phoneBook.findContact("Samuel"));
    }

    @Test
    public void testThatUserCanEditName() throws Exception {
        phoneBook.addContact("samuel", "09051243133");
        phoneBook.editContactName("Samuel", "Tolu");
        System.out.println(phoneBook.findContact("tolu"));
    }

    @Test
    public void testThatExceptionIsThrownWhenTryingToEditWithWrongName() throws Exception {
        phoneBook.addContact("samuel", "09051243133");
        assertThrows(RuntimeException.class, () -> phoneBook.editContactName("samel", "Tolulope"));
    }

    @Test
    public void testThatContactCanBeRemoved() throws Exception {
        phoneBook.addContact("Samuel", "0951243133");
        phoneBook.deleteContact("09051243133");
        System.out.println(phoneBook.findContact("samuel"));
    }

    @Test
    public void testThatUserCanEditNumber() throws Exception {
        phoneBook.addContact("samuel", "09051243133");
      //  phoneBook.editContactNumber("09051243133", "090612431333");
        System.out.println(phoneBook.findContact("samuel"));


    }

}