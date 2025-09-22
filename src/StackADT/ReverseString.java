// Name:		   Keith John
// Class:	   CS 3305/Section04
// Term:		   Fall 2025
// Instructor:    Prof. Bradley
// Assignment:         4
// IDE Name:	   Intellij

package StackADT;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        MyStack<String> stack = new MyStack<>();
        String[] arr = {};
        Scanner sc = new Scanner(System.in);
        int input = 0;
        String str = "";

        while (input !=3) {
            System.out.println("-----------------MAIN MENU---------------\n" +
                    "1 – Read input string of words\n" +
                    "2 – Reverse string and display outputs \n" +
                    "3 - Exit program\n");
            System.out.print("Enter option number: ");
            input = sc.nextInt();
            switch (input){
                case 1:
                    //takes the String from the user and already splits it up based the spaces then puts into an arr which i then push into the stack
                    //by doing this i just need to pop each element and it will already have everything in reverse order
                    sc.nextLine();
                    System.out.print("Enter the string: ");
                    str = sc.nextLine();

                    break;
                case 2:
                    arr = str.split(" ");
                    for (String s : arr){
                        stack.push(s);
                    }
                    while (!stack.isEmpty()){
                        System.out.print(stack.pop() + " ");
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Exiting Program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Menu Number");
            }
        }
    }
}
