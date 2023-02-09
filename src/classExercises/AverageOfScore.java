package classExercises;

import java.util.Scanner;

public class AverageOfScore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int numberOfStudents = 1;
        int average = 0;
        int studentScore = 0;
        while (numberOfStudents <= 10) {

            if (numberOfStudents == 1) {
                System.out.print("Enter the first grade: ");
                studentScore = scanner.nextInt();
                if (studentScore > 0 && studentScore < 100) {
                    average = studentScore + average;
                    numberOfStudents++;
                } else {
                    System.out.println("Enter a valid Number");
                }
            } else if (numberOfStudents == 2) {
                System.out.print("Enter the second Grade: ");
                studentScore = scanner.nextInt();
                if (studentScore > 0 && studentScore < 100) {
                    average = studentScore + average;
                    numberOfStudents++;
                } else {
                    System.out.println("Enter a valid number");
                }
            } else if (numberOfStudents == 3) {
                System.out.print("Enter the third number grade: ");
                studentScore = scanner.nextInt();
                if (studentScore > 0 && studentScore < 100) {
                    average = studentScore + average;
                    numberOfStudents++;
                } else {
                    System.out.println("Enter a valid number");
                }
            } else if (numberOfStudents == 4) {
                System.out.print("Enter a fourth Number: ");
                studentScore = scanner.nextInt();
                if (studentScore > 0 && studentScore < 100) {
                    average = studentScore + average;
                    numberOfStudents++;
                } else {
                    System.out.println("Enter a valid number");
                }
            } else if (numberOfStudents == 5) {
                System.out.print("Enter the fifth Grade: ");
                studentScore = scanner.nextInt();
                if (studentScore > 0 && studentScore < 100) {
                    average = studentScore + average;
                    numberOfStudents++;
                } else {
                    System.out.println("Enter a valid number");
                }
            } else if (numberOfStudents == 6) {
                System.out.print("Enter the sixth grade: ");
                studentScore = scanner.nextInt();
                if (studentScore > 0 && studentScore < 100) {
                    average = studentScore + average;
                    numberOfStudents++;
                } else {
                    System.out.println("Enter a valid number");
                }
            } else if (numberOfStudents == 7) {
                System.out.print("Enter the 7th grade: ");
                studentScore = scanner.nextInt();

                if (studentScore > 0 && studentScore < 100) {
                    average = studentScore + average;
                    numberOfStudents++;
                } else {
                    System.out.println("Enter a valid number");
                }
            } else if (numberOfStudents == 8) {
                System.out.print("Enter the 8th grade: ");
                studentScore = scanner.nextInt();

                if (studentScore > 0 && studentScore < 100) {
                    average = studentScore + average;
                    numberOfStudents++;
                } else System.out.println("Enter a valid number");
            } else if (numberOfStudents == 9) {
                System.out.print("Enter the 9th grade: ");
                studentScore = scanner.nextInt();

                if (studentScore > 0 && studentScore < 100) {
                    average = studentScore + average;
                    numberOfStudents++;
                } else System.out.println("Enter a valid number");
            } else if (numberOfStudents == 10) {
                System.out.print("Enter the 10th grade: ");
                studentScore = scanner.nextInt();

                if (studentScore > 0 && studentScore < 100) {
                    average = studentScore + average;
                    numberOfStudents++;
                } else System.out.println("Enter a valid number");
            }


        }
        System.out.println(average);
        System.out.println(average / 10);


    }}

