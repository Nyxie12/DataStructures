// Name:		   Keith John
// Class:	   CS 3305/Section04
// Term:		   Fall 2025
// Instructor:    Prof. Bradley
// Assignment:         4
// IDE Name:	   Intellij
package Queues;


public class Queue<E> {
    private class Node {
        E data;
        Node next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node beg;
    private Node end;
    private int size;

    public Queue() {
        beg = null;
        end = null;
        size = 0;
    }

    public void enqueue(E e) {
        Node node = new Node(e);
        if (beg == null) {
            beg = end = node;
        }
        else {
            end.next = node;
            end = node;
        }
        size++;
    }

    public E dequeue() {
        if (beg == null) {
            return null;
        }
        E e = beg.data;
        beg = beg.next;
        size--;
        if (beg == null) {
            end = null;
        }
        return e;
    }

    public E front() {
        if (beg == null) {
            return null;
        }
        return beg.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (beg == null) {
            return true;
        }
        return false;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node e = beg;
        System.out.print("Queue contents: ");
        while (e != null) {
            System.out.print(e.data);
            if (e.next != null) System.out.print(" -> ");
            e = e.next;
        }
        System.out.println();
    }
}


