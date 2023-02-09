package Chapter8.TimeClassExercise.DiaryApp;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int deleteCount=4;
    private static int editCount = 4;
    private static int viewCount = 4;

    private static Entry entry = new Entry();
    private static Diary diary;

    public static void main(String[] args) {
   //     grantAccess();
            gotoMainMenu();
    }

    private static void grantAccess(){
        String userName = input("Enter your username: ");
        String password = input("Enter your password: ");
        diary = new Diary(userName, password);
    }
    private static void gotoMainMenu(){
        String mainMenu = """
               
                Welcome to the Diary App
                
                1 -> Create Entry
                2 -> View Entry 
                3 -> Delete Entry 
                4 -> Edit Entry 
                5 -> Check Number of Entries
                6 -> Exit Application
                
                """;

        String userInput = input(mainMenu);

      try {
          switch (userInput.charAt(0)){
              case '1' -> createEntry();
              case '2' -> viewEntry();
              case '3' -> deleteEntry();
              case '4' -> editEntry();
              case '5' -> checkNumberOfEntries();
              case '6' -> exitApplication();
              default -> gotoMainMenu()
              ;
          }
      }
      catch (StringIndexOutOfBoundsException ex){
        //
          display(ex.getMessage());
          gotoMainMenu();
      }
    }

    private static void exitApplication() {
        diary.animatedDisplay("Exiting");
        System.exit(1);
    }
    private static void checkNumberOfEntries() {
        String entryNumber = String.format("""
                The total numbers of entries in this diary is %s
              
                """, diary.countOfItemsInDiary());
        display(entryNumber);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        gotoMainMenu();
    }

    private static void editEntry(){
        int id = 0;
        try {
             id = Integer.parseInt(input("Please enter the ID."));
        }
        catch (NumberFormatException ex){
            display("Enter an Integer");
            editEntry();
        }
        try {
            diary.validateID(id);
        }
        catch (NullPointerException ex){
            editCount--;
            if(editCount==0) {
                editCount = 4;
                gotoMainMenu();}
            display(ex.getMessage());
            display("You have " + editCount + " attempts Left.");
            editEntry();
        }
        String title = input("Enter the New Title");
        String body = input("Enter the New Body");
            diary.editAction(id, title, body);
            diary.animatedDisplay("editing");
            display("Entry edited successfully!");
            gotoMainMenu();
    }

    private static void deleteEntry() {
        int id = 0;
        try {
            id = Integer.parseInt(input("Enter ID"));
        }
        catch (NumberFormatException ex){
            display("Enter an Integer");
            deleteEntry();
        }
        try {
            diary.deleteEntry(id);
            diary.animatedDisplay("Deleting");
        }
        catch (NullPointerException ex){
            deleteCount--;
            if (deleteCount == 0) {
                deleteCount = 4;
                gotoMainMenu();}
            display(ex.getMessage());
            display("You have " + deleteCount + " attempt(s) left. ");
            deleteEntry();
        }
        display("Entry Deleted!");
        gotoMainMenu();
    }
    private static void viewEntry() {
        int id = 0;
        try {
             id = Integer.parseInt(input("Provide ID"));
        }
        catch (NumberFormatException ex) {
            display("Invalid Integer, Try again");
            viewEntry();
        }
        try {
            diary.animatedDisplay("fetching");
            display(diary.viewEntry(id));

        }
        catch (
        NullPointerException ex){
            viewCount--;
            if (viewCount == 0) {
                viewCount = 4;
                gotoMainMenu();}
                display(ex.getMessage());
                display("You have " + viewCount + " attempts Left. ");
                viewEntry();
        }
        gotoMainMenu();
    }
    private static void createEntry() {
            String title = input("Enter Diary Title");
            String body = input("Enter Body Diary");
            String userName = input("Enter your username");
            String password = input("Enter your password");
            diary.createEntry(title, body, userName, password);
            display("Entry added successfully!");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        gotoMainMenu();
        }
    private static String input(String prompt){
        display(prompt);
        return scanner.nextLine();
    }
    private static void display(String prompt){
        System.out.println(prompt);
    }

}



  