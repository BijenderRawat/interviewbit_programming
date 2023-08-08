/*
Remove nth node from a linked list from its RemoveFromEnd

Easy q asked in Amazon
*/

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class RemoveFromEnd {
    public int length(Node A) {
        int length = 0;
        while (A != null) {
            length++;
            A = A.next;
        }
        return length;
    }

    public Node removeNthFromLast(Node A, int B) {
        if (A == null)
            return null;
        int length = length(A);
        Node head = new Node(-1);
        head.next = A;
        Node temp = head;
        for (int i = 0; i < length - B; i++)
            temp = temp.next;
        temp.next = temp.next.next;
        return head.next;
    }
}