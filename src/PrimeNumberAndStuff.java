import java.util.Scanner;

public class PrimeNumberAndStuff {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter a number here: ");
       // int number = scanner.nextInt();
        int count = 0;
        for (int i = 2; i <= 10000 ; i++) {
            boolean result = returnPrime(i);
            if (result == true)
                {count ++;}
        }
        System.out.println(count);
    }
            public static boolean returnPrime(int number) {
             boolean check = false;
             for (int startingPoint = 2; startingPoint < number ; startingPoint++) {
                 if (number % startingPoint == 0) {
                     return false;
                 }
             }
             return true;
         }}