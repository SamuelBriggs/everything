import java.util.Scanner;
public class factoors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float largest = Float.NEGATIVE_INFINITY;
        float smallest = Float.POSITIVE_INFINITY;

        System.out.println("Input a number here: ");
        int number = input.nextInt();

        while (number != 0)
            {

                if (number > largest){
                    largest = number;
                }

                if (number < smallest)
                    {smallest = number;}

                System.out.println("Do you still want to enter a number here: ");
                 number = input.nextInt();


            }

        System.out.println(largest);
        System.out.println(smallest);

    }
}