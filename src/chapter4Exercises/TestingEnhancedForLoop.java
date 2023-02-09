package chapter4Exercises;

public class TestingEnhancedForLoop {
    public static void main(String[] args) {
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;
        int total2 = 0;

        for (int number : array){
            total += number;
            //System.out.println(number);
        }
        System.out.println(total);
        for (int counter = 0; counter < array.length; counter++) {
            total2+= array[counter];
        }
        System.out.println("Total2 is " + total2);
    }

}
