package chapter4Exercises;

public class Mystery {
    public static void main(String[] args) {
        int x = -2;
        int total = 0;
        while(x <= 10){
            int y = x + 2;
            x++;
            total +=y;
            System.out.println("y is," + y);
            System.out.println("total is, " + total);


        }
    }
}


