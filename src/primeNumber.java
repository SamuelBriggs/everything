import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean check = false;
        System.out.println("Enter a number here: ");
        int number = input.nextInt();
        int startingPoint = 2;

        while (startingPoint < number) {
            if (number % startingPoint == 0){check = true;}
            startingPoint += 1;
        }
        if (check)
        {
            System.out.printf("%s is not prime number", number);
        }
        else {
            System.out.printf("%s is a prime number", number);
        }
    }


}

