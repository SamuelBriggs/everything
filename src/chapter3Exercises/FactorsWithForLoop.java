package chapter3Exercises;

import java.util.Scanner;

public class FactorsWithForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new here: ");
        int number = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
