package classExercises;
import java.util.Scanner;

public class PlayerPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number here between 1 and 11: ");
        int input = scanner.nextInt();

        switch (input){
            case 1 -> System.out.println("GoalKeeper");
            case 2 -> System.out.println("Defender");
            case 3 -> System.out.println("Defender");
            case 4 -> System.out.println("Defender");
            case 5 -> System.out.println("Defender");
            case 6 -> System.out.println("Midfielder");
            case 7 -> System.out.println("Midfielder");
            case 8 -> System.out.println("MidFielder");
            case 9 -> System.out.println("Attacker");
            case 10 -> System.out.println("Attacker");
            case 11 -> System.out.println("Attacker");
            default -> System.out.println("You noe sabi Player");
        }
    }
}
