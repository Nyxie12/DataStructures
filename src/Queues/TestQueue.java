// Name:		   Keith John
// Class:	   CS 3305/Section04
// Term:		   Fall 2025
// Instructor:    Prof. Bradley
// Assignment:         5
// IDE Name:	   Intellij

package Queues;

import java.util.Scanner;

public class TestQueue {

    //Like the last assignment I have made my own method to printing out the queue
    public static void printIntQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        Queue<Integer> t = new Queue<>();
        while (!queue.isEmpty()) {
            Integer i = queue.dequeue();
            System.out.print(i + " ");
            t.enqueue(i);
        }

        while (!t.isEmpty()) {
            queue.enqueue(t.dequeue());
        }
    }
    public static void main(String[]args) {
        Queue<Integer> queue = new Queue<Integer>();
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int data = 0;

        while (input != 7) {
            System.out.println("--------MAIN MENU--------\n" +
                    "1 – Enqueue element\n" +
                    "2 – Dequeue element\n" +
                    "3 – Get front element\n" +
                    "4 – get queue size\n" +
                    "5 – Is Empty queue?\n" +
                    "6 - Print queue\n" +
                    "7 - Exit program");
            System.out.print("Enter option number: ");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println();
                    System.out.print("Enter the number: ");
                    data = sc.nextInt();
                    System.out.print("Queue before adding " + data + " is: ");
                    printIntQueue(queue);
                    System.out.println();
                    queue.enqueue(data);
                    System.out.print("Queue after adding " + data + " is: ");
                    printIntQueue(queue);
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Queue before dequeue is: ");
                    printIntQueue(queue);
                    System.out.println();
                    queue.dequeue();
                    System.out.print("Queue after dequeue is ");
                    printIntQueue(queue);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("The Queue");
                    printIntQueue(queue);
                    if (queue.isEmpty()) {
                        System.out.println("The que is empty");
                    } else {
                        System.out.print("The front element from the queue is " + queue.front());
                    }
                    break;
                case 4:
                    System.out.println("The Queue size is " + queue.size());
                    break;
                case 5:
                    if (queue.isEmpty()) {
                        System.out.println("The Queue is empty!");
                    }
                    else {
                        System.out.println("THe Queue is not empty");
                    }
                    break;
                case 6:
                    System.out.print("The Queue: " );
                    printIntQueue(queue);
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }

    }
}
