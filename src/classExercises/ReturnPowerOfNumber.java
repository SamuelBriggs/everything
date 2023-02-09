package classExercises;

import java.util.Scanner;

public class ReturnPowerOfNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int count = 1;
        int product = 1;
        while (count <= secondNumber){
            product *= firstNumber;
            count++;
        }
        System.out.println(product);
    }
}
