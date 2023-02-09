import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int startingPoint = 1;

        while (startingPoint <= number)
            {
                if (number % startingPoint == 0) {
                    count += 1;}

                startingPoint += 1;
            }
        System.out.println(count);
    }
}


