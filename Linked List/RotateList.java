/* Problem Description
Given a list, rotate the list to the right by k places, where k is non-negative.

Input Format
The first argument is ListNode A, pointing to the head of the list.
The second argument is an integer B, representing the value of k. */

// Asked in Amazon

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class RotateList {
    public Node rotateRight(Node A, int B) {
        if (A == null)
            return null;
        if (A.next == null)
            return A;
        int totalSize = 0;
        Node node = A;
        while (node != null) {
            totalSize++;
            node = node.next;
        }
        B = B % totalSize;
        if (B == 0)
            return A;
        Node lastNode = null;
        node = A;
        for (int i = 0; i < totalSize - B; i++) {
            lastNode = A;
            node = node.next;
        }
        Node head = node;
        lastNode.next = null;
        while (node.next != null)
            node = node.next;
        node.next = A;
        return head;
    }
}