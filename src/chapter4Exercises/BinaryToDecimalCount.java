package chapter4Exercises;

import java.util.Scanner;

public class BinaryToDecimalCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Binary Integer: ");
        int binaryInt = scanner.nextInt();
        
        int count = 0;
        while(binaryInt != 0)
        {
            binaryInt = binaryInt / 10;
            count = count + 1;
        }
        System.out.println(count);
    }


}
