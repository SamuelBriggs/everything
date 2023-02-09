package chapter4Exercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiAdd {

    public static void main(String[] args) {
        int[][]a = new int[3][4];
        int count = 1;

        for (int row = 0; row <a.length ; row++) {
            for (int column = 0; column < a[row].length; column++) {
                a[row][column] = count;
                count++;
            }
        }
        for (int[] row :a) {
            System.out.println(Arrays.toString(row));
    }
        int total = 0;

        for (int couting = 0; couting < a.length ; couting++) {

            for (int co = 0; co < a[couting].length; co++) {
                total += a[couting][co];

            }

        }
        System.out.println(total);

    }


}
