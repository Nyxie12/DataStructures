// Name:		   Keith John
// Class:	   CS 3305/Section04
// Term:		   Fall 2025
// Instructor:    Prof. Bradley
// Assignment:         2
// IDE Name:	   Intellij

package Recursion;

import java.util.Scanner;

public class AverageGrades {
    //Calculate the average of an integer type array using recursion
    public static double findAverage(int[] grades, int n){
        if (n == 1) {
            return (double) grades[0];
        }
        //The recursion method to find the average.
        return (findAverage(grades, n-1) * (n-1) + grades[n-1]) / n;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int size = 0;
        int[] grades = null;

        while(input != 4){
            //Main Menu
            System.out.println("--------MAIN MENU-------");
            System.out.println("1. Read class size");
            System.out.println("2. Read class grades");
            System.out.println("3. Compute class average");
            System.out.println("4. Exit program\n");
            System.out.print("Enter option number: ");
            input = sc.nextInt();

            switch (input){
                case 1:
                    System.out.print("Enter the class size: ");
                    size = sc.nextInt();
                    if (size > 0){
                        grades = new int[size];
                    }
                    else {
                        //If the size entered is less than 0
                        System.out.println("Invalid class size, must be a positive integer");
                    }
                    break;
                case 2:
                    //If no grades exist
                    if (grades.length == 0 ){
                        System.out.println("Please enter a class size first!");
                    }
                    else {
                        System.out.println("You may now enter the grades for " + size + "students");
                        for (int i = 0; i<grades.length; i++)
                        {
                            System.out.print("Enter the grade for student #" + (i+1));
                            grades[i] = sc.nextInt();
                        }
                    }
                    System.out.println("All grades are updated");
                    break;

                case 3:
                    //If no grades exist
                    if (grades.length == 0){
                        System.out.println("Invalid grade class");
                    }
                    double average = findAverage(grades, grades.length);
                    System.out.println("The class grade average is: " + average);
                    break;

            }

        }
        sc.close();
    }
}
