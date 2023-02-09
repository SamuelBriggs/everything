import java.util.Scanner;
public class checkingNumbersWithForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double smallest = Double.POSITIVE_INFINITY;
        double largest = Double.NEGATIVE_INFINITY;
        //System.out.print("Do you want to enter a number: ");
        String continue_loop = "yes";

        for (; continue_loop.equals("yes");)

            {
                System.out.print("Enter a number here: ");
                int userInput = input.nextInt();
                if (userInput > largest)
                {largest = userInput; }

                if (userInput < smallest)
                {smallest = userInput;}

                System.out.print("Do you still want to input a number? ");
                continue_loop = input.next();

            }

        int intLargest = (int) largest;
        int intSmallest = (int) smallest;
        System.out.println((intLargest));
        System.out.println(intSmallest);







    }
}
