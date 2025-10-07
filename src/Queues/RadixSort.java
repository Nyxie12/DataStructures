// Name:		   Keith John
// Class:	   CS 3305/Section04
// Term:		   Fall 2025
// Instructor:    Prof. Bradley
// Assignment:         5
// IDE Name:	   Intellij
package Queues;

import java.util.Scanner;

public class RadixSort {
    public static void main(String[] args) {
        Queue<Integer>[] Q = new Queue[10];
        for (int i = 0; i<10; i++) {
            Q[i] = new Queue<>();
        }
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[0];
        int mainInput = 0;
        int size = 0;

        while (mainInput != 4) {
            System.out.print("---------------MAIN MENU---------------\n" +
                    "1 – Read array size\n" +
                    "2 – Read array values\n" +
                    "3 – Run Radix Sort and print outputs\n" +
                    "4 – Exit program\n" +
                    "\n" +
                    "Enter option number:");
            mainInput = sc.nextInt();

            switch (mainInput) {
                case 1:
                    System.out.print("Array Size: ");
                    size = sc.nextInt();
                    if (size <= 0) {
                        System.out.println("Invalid size");
                    }
                    else {
                        inputs = new int[size];
                        System.out.println("Array size set to " + size + ".");
                    }
                    break;
                case 2:
                    if (size <= 0){
                        System.out.println("Invalid size, set the size in Option 1 on the Menu Page");
                        break;
                    }
                    System.out.println("Enter in " + size + "numbers into the list");
                    for (int i = 0; i < size; i++) {
                        int val;
                        do {
                            System.out.print("Value #" + (i + 1) + ": ");
                            val = sc.nextInt();
                            if (val < 0) {
                                System.out.println("Negative numbers not allowed. Try again.");
                            }
                        } while (val < 0);
                        inputs[i] = val;
                    }
                    break;
                case 3:
                    if (size <= 0 || inputs.length != size) {
                        System.out.println("Please enter array size and values first.");
                        continue;
                    }

                    StringBuilder original = new StringBuilder();
                    for (int i = 0; i < size; i++) {
                        original.append(inputs[i]);
                        if (i < size - 1) original.append(", ");
                    }

                    int maxDigits = 0;
                    for (int i = 0; i < size; i++) {
                        int count = 0;
                        int temp = inputs[i];
                        do {
                            count++;
                            temp /= 10;
                        } while (temp > 0);
                        if (count > maxDigits) maxDigits = count;
                    }

                    for (int pos = 1; pos <= maxDigits; pos++) {
                        for (int i = 0; i < size; i++) {
                            int temp = inputs[i];
                            for (int j = 1; j < pos; j++) {
                                temp /= 10;
                            }
                            int digit = temp % 10;
                            Q[digit].enqueue(inputs[i]);
                        }

                        int index = 0;
                        for (int i = 0; i < 10; i++) {
                            while (!Q[i].isEmpty()) {
                                inputs[index++] = Q[i].dequeue();
                            }
                        }
                    }

                    System.out.print("Array values before sorting:    ");
                    System.out.println(original);
                    System.out.print("Array values after sorting:     ");
                    for (int i = 0; i < size; i++) {
                        System.out.print(inputs[i]);
                        if (i < size - 1) System.out.print(", ");
                    }
                    System.out.println();
            }
        }


    }
}
