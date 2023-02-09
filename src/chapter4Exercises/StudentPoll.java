package chapter4Exercises;

import java.util.Arrays;

public class StudentPoll {
    public static void main(String[] args) {
        int[] responses =  {1,2,5,3,5,1,4,1,1,2,3,3,1,3,3,3,2,3,3,2,14};
        int[] frequency = new int[6];

        for (int answer = 0; answer < responses.length; answer++) {
            try {
                int answerCall = responses[answer];
                frequency[answerCall] = frequency[answerCall] + 1;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf("    responses[%d] = %d%n%n", answer, responses[answer]);
            }

        }

        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.printf("%6d%10d%n", rating, frequency[rating]);

        }
        System.out.println(frequency[4]);
        System.out.println(Arrays.toString(frequency));
        System.out.println((frequency[3]));
    }


}
