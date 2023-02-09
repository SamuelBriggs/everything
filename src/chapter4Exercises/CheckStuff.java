package chapter4Exercises;

public class CheckStuff {

    public static void main(String[] args) {
        int number = 10;
     int r = returnDivision(number);
        System.out.println(r);
        System.out.println(number);
    }

    public static int returnDivision(int number){

        return number * number;
    }

}
