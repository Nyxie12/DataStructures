// Name:		   Keith John
// Class:	   CS 3305/Section04
// Term:		   Fall 2025
// Instructor:    Prof. Bradley
// Assignment:    1
// IDE Name:	   Intellij

package OOP_Classes;

public class Rectangle {
    private double width;
    private double height;

    //Default constructor
    public Rectangle(){
        this.width = 1;
        this.height = 1;
    }
    //Constructor
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }

    public double getArea() {
        return this.height * this.width;
    }
    public double getPerimeter(){
        return (2*this.height) + (2*this.width);
    }

    //Print out if of rectangle with good format
    public void printRectangle(String objectName){
        System.out.println("Rectangle " + objectName + " is " + this.width + " units wide and " + this.height + " units high.");
    }


}
