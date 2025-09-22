// Name:		   Keith John
// Class:	   CS 3305/Section04
// Term:		   Fall 2025
// Instructor:    Prof. Bradley
// Assignment:         2
// IDE Name:	   Intellij

package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Vowels {
    //Goes through the entire string checking. After each char checked it "removes it" from the
    //total string and goes on. If it finds a vowel it increments the counter
    public static int countVowels(String s){
        int counter = 0;
        s = s.toLowerCase();
        if (s.isEmpty()){
            return 0;
        }
        char beg = s.charAt(0);
        if (beg == 'a' || beg == 'e' || beg == 'i' || beg == 'o' || beg == 'u'){
            counter++;
        }

        return counter + countVowels(s.substring(1));
    }

    public static void main(String[] args){
        //ArrayList to host all the string inputted. Since ArrayLists can grow, i used it.
        ArrayList<String> strs = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        int menu = 0;

        while(menu != 3){
            System.out.println("---------MAIN MENU---------");
            System.out.println("1. Read input string");
            System.out.println("2. Compute the number of vowels");
            System.out.println("3. Exit program\n");
            System.out.print("Enter option number: ");
            menu = sc.nextInt();

            sc.nextLine();
            switch (menu){
                case 1:
                    System.out.print("Enter input string: ");
                    String input = sc.nextLine();
                    strs.add(input);
                    break;

                case 2:
                    for (String s : strs){
                        System.out.println("You entered string: " + s);
                        System.out.println("Number of vowels: " + countVowels(s));;
                    }
                    break;
                case 3:
                    break;
            }

        }


    }
}
