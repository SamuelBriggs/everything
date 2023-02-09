package chapter4Exercises;

public class Asterisks {
    public static void main(String[] args) {
        String asterisk = "*";
        String space= " ";

        for (int j = 0; j < 4 ; j++) {
            for (int i = 0; i < 8; i++) {
                System.out.print(asterisk);
                System.out.print(space);}
            System.out.println();
            for (int i = 0; i < 8 ; i++) {
                System.out.print(space);
                System.out.print(asterisk);
            }
            System.out.println();
        }
    }
}
