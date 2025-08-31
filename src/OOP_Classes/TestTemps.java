// Name:		   Keith John
// Class:	   CS 3305/Section04
// Term:		   Fall 2025
// Instructor:    Prof. Bradley
// Assignment:         1
// IDE Name:	   Intellij


package OOP_Classes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestTemps {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Taking in user input for the temp each day
        System.out.print("Enter temp for Monday: ");
        int monday = sc.nextInt();
        System.out.print("Enter temp for Tuesday: ");
        int tuesday = sc.nextInt();
        System.out.print("Enter temp for Wednesday: ");
        int wednesday = sc.nextInt();
        System.out.print("Enter temp for Thursday: ");
        int thursday = sc.nextInt();
        System.out.print("Enter temp for Friday: ");
        int friday = sc.nextInt();
        System.out.print("Enter temp for Saturday: ");
        int saturday = sc.nextInt();
        System.out.print("Enter temp for Sunday: ");
        int sunday = sc.nextInt();

        //Assigning it to the constructor
        DailyTemps temp = new DailyTemps(monday,tuesday,wednesday,thursday,friday,saturday,sunday);

        System.out.println("Testing out printTemps function");
        temp.printTemps();

        System.out.println("Testing out Freezing Function: ");
        System.out.println("Number of freezing days  is " + temp.Freezing() + " days");

        System.out.println("Testing out Warmest Function:   ");
        System.out.println("The warmest day of the week is " + temp.Warmest());

        System.out.println("Testing out setTemp:    ");
        System.out.print("Select a day to change the temp for: ");
        int day = sc.nextInt();
        System.out.print("What's the temp for the day you selected: ");
        int tempDay = sc.nextInt();
        temp.setTemp(day, tempDay);

        temp.printTemps();


    }
}
