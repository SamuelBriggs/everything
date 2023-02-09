package chapter4Exercises;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 5 digits number");
        int input = scanner.nextInt();


        while (input < 10000 || input > 99999) {
            System.out.println("Enter a valid Input: ");
            input = scanner.nextInt();
        }



            if (input >= 10000 && input <= 99999){
                int firstInteger = input / 10000;
                int secondInteger = input % 10000 / 1000;
                int thirdInteger = input % 1000 / 100;
                int fourthInteger = input % 100 / 10;
                int firthInteger = input % 10;
            if (firstInteger == firthInteger && secondInteger == fourthInteger){
                System.out.println("This number is a palindrome");
            }
            else{
                System.out.println("This is not a palindrome");
            }
        }


    }
}
