package chapter3Exercises;

import java.util.Scanner;

public class ChristmasDay {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();


        while (userInput <= 12) {
            switch (userInput) {

                case 1:
                    System.out.println(firstVerse());
                    System.out.println("\nEnter another number to continue the song");
                    userInput = input.nextInt();




            }


        }
    }


    private static String firstVerse() {
        return """
                \nOn the first day of Christmas, my true love sent to me
                A partridge in a pear tree
                
                """;
    }

    private static String secondVerse(){

        return null;
    }








































}