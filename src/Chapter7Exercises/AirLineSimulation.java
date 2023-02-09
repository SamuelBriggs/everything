package Chapter7Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class AirLineSimulation {
    Scanner scanner = new Scanner(System.in);
    private int userInput;
    String answer;
    private boolean [] seatingChart = new boolean[10];
    public void displayInitialMessage(){
            System.out.println("Please type 1 for First Class and pleasey type 2 for Economy.");
            userInput = scanner.nextInt();
    }

    public void setInitialValuesOfSeatingChart(){
        for (int i = 0; i < seatingChart.length ; i++){
            seatingChart[i] = false;
        }
    }

    public String getSeatingChart(){
        return Arrays.toString(seatingChart);
    }

    public void setFirstClass(boolean[] arr){
        for (int i = 0; i < seatingChart.length/2; i++){

            if (seatingChart[i] == false) {seatingChart[i] = true;
                break;
            }

    }}

    public void setSecondClass(boolean[] arr){
        for (int i = 5; i < seatingChart.length; i++){
            if (seatingChart[i] == false) {seatingChart[i] = true;
                break;
            }
        }}
    public void setSeatingPosition() {
        if (userInput == 1) setFirstClass(seatingChart);
        if (userInput == 2) setSecondClass(seatingChart);
    }

    public void swapSeats(int startingIndex){
        System.out.println("Do you want to move to another Class? ");
        answer = scanner.next();
         if (answer.equalsIgnoreCase("yes"))
             for (int i = startingIndex; i < seatingChart.length ; i++) {
        if(seatingChart[i] == false) {
            seatingChart[i] = true;
            break;}
    }

         else System.out.println("Check Next Flight");
}
     public void setSeatIfAParticularClassIsFull(){
         if (checkIfSecondClassIsFull(seatingChart)){
             swapSeats(0);
         }
         if (checkIfFirstClassIsFull(seatingChart)) {
             swapSeats(5);
         }
    }
    public boolean checkIfFirstClassIsFull(boolean [] arr){
        int counter = 0;
        for (int i = 0; i < 5; i++){
            if (seatingChart[i] == true) counter ++;
        }
        if (counter == 5) return true;
        return false;
    }
    public boolean checkIfSecondClassIsFull(boolean [] arr){
        int counter = 0;
        for (int i = 5; i < seatingChart.length; i++){
            if (seatingChart[i] == true) counter ++;
        }
        if (counter == 5) return true;
        return false;
    }

    public void printTicketPass(int index){



    }


}
