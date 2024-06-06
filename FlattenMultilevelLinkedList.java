/*
There is a linked list given to us in multilevels

This linked list contains the node with max of 2 pointer, next and down

eg: 1-2--3--4-5
    |       |
    6-7--8  9-10
      |  |  |
     11 12 13-14
         |  |
        15 16-17

The task is to print this multi level linked list in such a way that 1st level is printed first
2nd level is printed then and so on
*/

import java.util.ArrayDeque;
import java.util.Queue;

class Node {
    int data;
    Node next;
    Node down;

    Node(int data) {
        this.data = data;
        next = down = null;
    }
}

public class FlattenMultilevelLinkedList {

    public static void flatenLinkedListUsingQueue(Node head) {
        // In this function, we are using a queue to solve the list so it takes a space of O(N)
        Queue<Node> q = new ArrayDeque<>();
        Node curr = head;
        while (curr != null) {
            if (curr.next == null)
                curr.next = q.poll();
            if (curr.down != null)
                q.add(curr.down);
            curr = curr.next;
        }
    }

    public static void flatenLinkedList(Node head) {
        // In this function, we are not using any space
        Node last = head;
        Node curr = head;
        while (last.next != null)
            last = last.next;

        while (curr != last) {
            if (curr.down != null) {
                last.next = curr.down;
                Node temp = curr.down;
                while (temp.next != null)
                    temp = temp.next;
                last = temp;
            }
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.down = new Node(6);
        head.down.next = new Node(7);
        head.down.next.next = new Node(8);
        head.next.next.next.down = new Node(9);
        head.next.next.next.down.next = new Node(10);
        head.down.next.down = new Node(11);
        head.down.next.next.down = new Node(12);
        head.next.next.next.down.down = new Node(13);
        head.next.next.next.down.down.next = new Node(14);
        head.down.next.next.down.down = new Node(15);
        head.next.next.next.down.down.down = new Node(16);
        head.next.next.next.down.down.down.next = new Node(17);

        flatenLinkedList(head);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
