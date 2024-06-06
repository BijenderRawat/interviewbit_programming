/*
Two sorted linkedlist are given, return a linkedlist with elements of both lists in sorted form
Easy level q asked in Microsoft, Amazon, Yahoo
*/

class MergeSortedList {
    public Node mergeTwoList(Node A, Node B) {
        if (A == null)
            return B;
        if (B == null)
            return A;
        Node head = new Node(0);
        Node node = head;
        while (A != null && B != null) {
            if (A.data <= B.data) {
                node.next = A;
                A = A.next;
            } else {
                node.next = B;
                B = B.next;
            }
            node = node.next;
        }
        if (A == null)
            node.next = B;
        else
            node.next = A;
        return head.next;
    }
}