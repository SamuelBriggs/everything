package chapter3Exercises;

public class PatternC {
    public static void main(String[] args) {

        int count = 15;
        int patternCount = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(" ");
            }

            count --;
            System.out.println();

        }
    }
}
