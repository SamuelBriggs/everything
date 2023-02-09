package Phonebook;

import java.util.Scanner;

public class PhoneBookMain {

  private static PhoneBook phoneBook = new PhoneBook();
  private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        phoneBookMenu();
    }
        private static void phoneBookMenu() throws Exception {
            String mainMenu = """
               
                Welcome to the your Phonebook
                
                1 -> Add Contact
                2 -> View Contact
                3 -> Delete Contact 
                4 -> Edit ContactNumber
                5 -> Edit ContactName
                5 -> Check total Number of Contacts
                6 -> Exit Application
                
                """;

            String userInput = input(mainMenu);

            try {
                switch (userInput.charAt(0)){
                    case '1' -> addContact();
                    case '2' -> viewContact();
                    case '3' -> deleteContact();
                    case '4' -> editContactNumber();
                    case '5' -> editContactName();
                    case '6' -> checkTotalContacts();
                    case '7' -> exitApp();
                    default -> phoneBookMenu();

                }
            }
            catch (StringIndexOutOfBoundsException ex){
                display(ex.getMessage());
                phoneBookMenu();
            }
        }

        private static void exitApp() {
            System.exit(1);
        }
        private static void checkTotalContacts () throws Exception {
            String totalNumber = String.format("""
                The total numbers of entries in this diary is %s
              
                """, phoneBook.totalNumberOfContacts());
            display(totalNumber);
            phoneBookMenu();
        }
        private static void editContactNumber() throws Exception {
          String oldNumber = (input("Please enter Old name or phoneNumber."));
        try {
            phoneBook.findContact(oldNumber);
        }
        catch (RuntimeException ex){
            display(ex.getMessage());
            editContactNumber();
        }
            String newPhoneNumber = input("Enter the new PhoneNumber");
            phoneBook.editContactNumber(oldNumber, newPhoneNumber);
            display("Success!");
            phoneBookMenu();
        }

    private static void editContactName() throws Exception {

        String oldName = (input("Please enter the old Name or PhoneNumber."));
        try {
           phoneBook.findValidContact(oldName);
        }
        catch (RuntimeException ex){
            display(ex.getMessage());
            editContactName();
        }
        String newName = input("Enter the new Name ");
        phoneBook.editContactName(oldName, newName);
        display("Success!");
        phoneBookMenu();
    }
        private static void deleteContact() throws Exception {
          String nameOrPhoneNumber = input("Enter the name or Phone Number");
         try {
             phoneBook.deleteContact(nameOrPhoneNumber);
         }
         catch (RuntimeException ex)
         {
             display(ex.getMessage());
             phoneBookMenu();
         }
         display("success");
         phoneBookMenu();

        }
        private static void viewContact() {
            String nameOrNumber = input("Enter the name or number");
            try {
            display(phoneBook.findContact(nameOrNumber));}
            catch (RuntimeException ex){
                display(ex.getMessage());
                viewContact();
            }

        }
        private static void addContact() throws Exception {
            String contactName = input("Enter the Contact Name");
            String contactPhoneNumber = input("Enter the Phone Number");
            try {
                phoneBook.addContact(contactName, contactPhoneNumber);
            }
            catch (Exception ex){
                display(ex.getMessage());
                addContact();
            }
            display("Entry added successfully!");
            phoneBookMenu();
        }
        private static String input(String prompt){
            display(prompt);
            return scanner.nextLine();
        }
        private static void display(String prompt){
            System.out.println(prompt);
        }

    }

