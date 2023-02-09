package chapter3Exercises;

public class NumbersPyramid {
    public static void main(String[] args) {

        int number = 1;

        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            number++;

        }
    }

}
