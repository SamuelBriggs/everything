package chapter4Exercises;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int miles;
        int gallons;
        double mpg = 0;
        double totalMpg = 0;
        int trip = 0;
        System.out.println("Welcome Driver, Enter Miles and Gallons for each Trip");

        while (trip != -1){

            System.out.println("Enter the Miles here and Gallons here: Enter 1 to end. ");
            miles = scanner.nextInt();

            System.out.println("Enter the Gallons here: ");
            gallons = scanner.nextInt();

            mpg = (double) miles / gallons;

            System.out.println("Mpg for this trip is " + mpg);

            totalMpg += mpg;

            System.out.println("total Mpg is " + totalMpg);
            System.out.println("press 0 to continue, or -1 to end");
            trip = scanner.nextInt();
        }

    }

}
