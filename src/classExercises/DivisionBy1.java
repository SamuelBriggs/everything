package classExercises;

import java.util.Scanner;

public class DivisionBy1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        double number = input.nextInt();
        double count = 1;
        int counta = 1;
        double otherCount =1;
        double division = 0;
        double productofOtherCount = 1;
        double fraction = 0;


        while (count <= number ){
            division += (otherCount/count);
            //System.out.println(otherCount + "/" + count);
            productofOtherCount = productofOtherCount*count;
            count +=1;
        }
        while (counta <= number){
            //System.out.println(productofOtherCount);
            fraction = fraction+(productofOtherCount / counta);
            counta ++;
        }

        System.out.println(division);
        System.out.println(fraction);
        System.out.println(productofOtherCount);
    }

}
