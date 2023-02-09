package classExercises;

import java.util.Scanner;

public class SwitchCasesForNokiaPhone {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String mainMenuList = """
                1. PhoneBook
                2. Messages 
                3. Chat 
                4. Register
                5. Tones 
                6. Settings 
                7. Call divert 
                8. Games
                9. Calculator 
                10. Reminders 
                11. Clock 
                12. Profiles 
                13. SIM services
              """;
        System.out.println(mainMenuList);
        int userInput = input.nextInt();
    while (userInput > 0 && userInput <= 11) {
        switch (userInput) {
            case 1:
                String phoneBook = """
                        1.PhoneBook   
                           1. Search 
                           2. Service Nos.
                           3. Add Name
                           4. Erase
                           5. Edit
                           6. Assign Tone 
                           7. Send b'card 
                           8: Options
                               1. type of View 
                               2. Memory Status 
                           9. Speed dials 
                           10. Voice Tags
                           11. Return to Main Menu
                           """;
                System.out.println(phoneBook);
                System.out.println("Enter a Number to continue in PhoneBook");

                int subPhoneBook = input.nextInt();
                switch (subPhoneBook) {
                    case 1:
                        System.out.println("Search");
                        System.out.println("Press 1 to return to phonebook");
                        phoneBook = input.next();
                        break;
                    case 2:
                        System.out.println("Servies Nos");
                        System.out.println("Press 1 to return to phonebook");
                        phoneBook = input.next();
                        break;
                    case 3:
                        System.out.println("Add name");
                        System.out.println("Press 1 to return to phonebook");
                        phoneBook = input.next();
                        break;
                    case 4:
                        System.out.println("Erase");
                        System.out.println("Press 1 to return to phonebook");
                        phoneBook = input.next();
                        break;
                    case 5:
                        System.out.println("Edit");
                        System.out.println("Press 1 to return to phonebook");
                        phoneBook = input.next();
                        break;
                    case 6:
                        System.out.println("Assign Tone");
                        System.out.println("Press 1 to return to phonebook");
                        phoneBook = input.next();
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        System.out.println("Press 1 to return to phonebook");
                        phoneBook = input.next();
                        break;
                    case 8:
                        String options = """
                                1. Type of View
                                2. Memory Status
                                """;
                        System.out.println(options);

                        int subOptions = input.nextInt();
                        switch (subOptions) {
                            case 1:
                                System.out.println("Type of view");
                                break;
                            case 2:
                                System.out.println("Memory Status");
                                break;
                        }
                        System.out.println("Enter 1 to return to phonebook");
                        phoneBook = input.next();
                        break;
                    case 9:
                        System.out.println("Speed dials");
                        System.out.println("Press 1 to return to phonebook");
                        phoneBook = input.next();
                        break;
                    case 10:
                        System.out.println("Voice Tags");
                        System.out.println("Press 1 to return to phonebook");
                        phoneBook = input.next();
                            break;
                    case 11:
                        System.out.println(mainMenuList);
                        userInput = input.nextInt();
                }
                break;
            case 2:
                String message = """
                        1. Write Messages 
                        2. Inbox
                        3. Outbox
                        4. Picture Messages
                        5. Templates
                        6. Smileys
                        7. Messages Settings
                                      
                        """;
                System.out.println(message);
                System.out.println("Enter a number to continue in messages");

                int messages = input.nextInt();

                switch (messages) {
                    case 1:
                        System.out.println("Write Messages");
                        System.out.println("Enter 1 to return to menu menu");
                        message = input.next();
                        break;
                    case 2:
                        System.out.println("Inbox");
                        System.out.println("Enter 1 to return to message menu");
                        message = input.next();
                        break;
                    case 3:
                        System.out.println("Outbox");
                        System.out.println("Press anything to return to message menu");
                        message = input.next();
                        break;
                    case 4:
                        System.out.println("Picture Messages");
                    case 5:
                        System.out.println("Templates");
                        break;
                    case 6:
                        System.out.println("Smiley");
                        break;
                    case 7:
                       String messageSettings = """ 
                                1: Message Settings 
                                    1. Set 1
                                        1. Message Center Number 
                                        2. Messages sent as 
                                        3. Message validity
                                    2. Common   
                                        1. Delivery reports 
                                        2. Reply via same centre
                                        3. Character support 
                                    
                        """;

                        System.out.println(messageSettings);
                        System.out.println("Enter 1 to continue in messsage Settings");

                        int subMessageSeettings = input.nextInt();

                        switch (subMessageSeettings){
                            case 1:
                                String set1 = """
                                          1. Set 1
                                                1. Message centre Number
                                                2. Messages sent as 
                                                3. Message validity
                                        """;
                                System.out.println(set1);
                                int subSet1 = input.nextInt();

                                switch (subSet1){
                                    case 1:
                                        System.out.println("Message Centre Number");
                                        System.out.println("Enter any number to return to set 1");
                                        System.out.println(set1);
                                        subSet1 = input.nextInt();
                                        break;
                                    case 2:
                                        System.out.println("Messages sent as");
                                        break;
                                    case 3:
                                        System.out.println("Messages validity");
                                        break;
                                }break;
                            case 2:
                                System.out.println("Common");
                                break;


                        }

                }
        }

    }
    }}


