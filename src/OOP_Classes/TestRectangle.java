// Name:		   Keith John
// Class:	   CS 3305/Section04
// Term:		   Fall 2025
// Instructor:    Prof. Bradley
// Assignment:         1
// IDE Name:	   Intellij

package OOP_Classes;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args){
        //Initialize Scanner
        Scanner sc = new Scanner(System.in);

        //Creating new object with values from default constructor
        Rectangle myRectangle = new Rectangle();
        System.out.println("myRectangle: \n ______________");
        System.out.println("Width:          " + myRectangle.getWidth());
        System.out.println("Height:         " + myRectangle.getHeight());
        System.out.println("Area:           " + myRectangle.getArea());
        System.out.println("Perimeter:      " + myRectangle.getPerimeter());
        System.out.println();
        myRectangle.printRectangle("myRectangle");
        System.out.println();

        //Taking input from user for height and width
        System.out.print("Please enter the width of your rectangle: ");
        int width = sc.nextInt();
        System.out.print("Please enter the height of your rectangle: ");
        int height = sc.nextInt();

        //Creates s new Rectangle object with the values provided by the user
        Rectangle yourRectangle = new Rectangle(width,height);
        System.out.println("yourRectangle: \n ______________");
        System.out.println("Width:          " + yourRectangle.getWidth());
        System.out.println("Height:         " + yourRectangle.getHeight());
        System.out.println("Area:           " + yourRectangle.getArea());
        System.out.println("Perimeter:      " + yourRectangle.getPerimeter());
        System.out.println();
        yourRectangle.printRectangle("yourRectangle");

        //Testing out methods with correct formatting
        System.out.println("Testing Method get getWidth");
        System.out.println(yourRectangle.getWidth());
        System.out.println("Testing Method getHeight");
        System.out.println(yourRectangle.getHeight());
        System.out.println("Testing Method get Area");
        System.out.println(yourRectangle.getArea());
        System.out.println("Testing Method get Perimeter");
        System.out.println(yourRectangle.getPerimeter());
    }
}
