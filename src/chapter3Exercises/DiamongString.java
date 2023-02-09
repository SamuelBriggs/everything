package chapter3Exercises;

public class DiamongString {
    public static void main(String[] args) {
        String space = " ";
        String asterisk = "*";
        int spaceCount = 5;
        int asteriskCount = 1;

        for (int i = 1; i < 10; i+=2) {
            for (int j = 0; j<spaceCount; j++){
                System.out.print(space);
            }
            for (int k = 0; k < asteriskCount; k++) {
                System.out.print(asterisk);
            }
            System.out.println();
            spaceCount --;
            asteriskCount+=2;
        }
       String newSpace = " ";
       String newAsterisk = "*";
       int newSpaceCount = 3;
       int newAsteriskCount = 7;

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < newSpaceCount; j++) {
                System.out.print(newSpace);
            }
            for (int j = 0; j < newAsteriskCount; j++) {
                System.out.print(newAsterisk);
            }
            newSpaceCount++;
            newAsteriskCount-=2;
            System.out.println();
        }
    }
}
