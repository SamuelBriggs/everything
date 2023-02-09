package classExercises;

import java.security.SecureRandom;
import java.util.Arrays;

public class ArrayStuff {

    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();
        int[] frequency = new int[7];

        for (int roll = 0; roll < 60_000; roll++) {
            int rolling = 1 + randomNumbers.nextInt(6);
            frequency[rolling]++;

        }


        System.out.printf("%s%s10s%n", "Face", "Frequency");
        for (int face = 1; face < frequency.length; face++) {
            System.out.printf("%4d%10d%n", face, frequency[face]);

        }
        System.out.println(frequency[0]);
    }
}




