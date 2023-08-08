// Given a singly linked list A, determine if it's a palindrome. 
// Return 1 or 0, denoting if it's a palindrome or not, respectively.

// Asked in Amazon, Microsoft

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class PalindromeList {
    Node reverse(Node mid) {
        Node prev = mid, current = mid.next;
        prev.next = null;
        while (current != null) {
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    Node findMidNode(Node A) {
        Node slow = A, fast = A;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public int lPalin(Node A) {
        if (A == null)
            return 1;
        Node mid = findMidNode(A);
        Node last = reverse(mid);
        Node temp = A;
        while (temp != null && last != null) {
            if (temp.data != last.data)
                return 0;
            temp = temp.next;
            last = last.next;
        }
        return 1;
    }
}
