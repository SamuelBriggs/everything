package chapter3Exercises;

import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        int indexNumber = 1;
        for (int column = 0; column < numbers.length; column++) {
            for (int row = 0; row < numbers[column].length; row++) {
                numbers[column][row] = indexNumber;
                indexNumber ++;
                }



            }
        for (int[] row :numbers) {
            System.out.println(Arrays.toString(row));

        }
        }


    }

