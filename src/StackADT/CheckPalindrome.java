package StackADT;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        StringBuilder newStr = new StringBuilder();
        MyStack<Character> stack = new MyStack<>();
        char[] charStr = str.toCharArray();
        for(char c : charStr){
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            newStr.append(stack.pop());
        }
        return newStr.toString().equals(str);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        String str = "";

        while (input != 3) {
            System.out.println("-----------------MAIN MENU----------------\n" +
                    "1 – Read input string\n" +
                    "2 – Check palindrome and display output\n" +
                    "3 - Exit program\n" );
            System.out.print("Enter option number: ");
            input = sc.nextInt();

            switch (input){
                case 1:
                    sc.nextLine();
                    System.out.print("Enter input string: ");
                    str = sc.nextLine();
                    break;
                case 2:
                    System.out.println("Entered String:    " + str);
                    if (isPalindrome(str)){
                        System.out.println("Judgement:         Palindrome" );
                        break;
                    }
                    System.out.println("Judgement:         Not Palindrome" );
                    break;
                case 3:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        sc.close();
    }
}
