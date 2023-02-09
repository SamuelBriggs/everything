package chapter4Exercises;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int number = 0;
        int largestNumber = 0;
        int secondLargest = 0;

        while (counter <= 10){
            System.out.println("Enter a number;");
            number = scanner.nextInt();
            if (number > largestNumber){
                secondLargest = largestNumber;
                largestNumber = number;
            }
            counter++;



        }
        System.out.println(largestNumber);
        System.out.println(secondLargest);
    }
}
