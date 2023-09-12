/*
Task is to remove all the duplicate number of elements from a linked list

eg in 1-1-1-2-3-4, 1 is coming more than once so remove the extra 1's 
so that list become 1-2-3-4

Easy q asked in Microsoft and Amazon
*/

class DeleteDuplicates {
    public Node deleteDuplicates(Node A) {
        if (A == null || A.next == null)
            return A;
        Node dummy = new Node(-1);
        Node prev = dummy;
        Node curr = A;
        while (curr != null) {
            if (curr.next != null && curr.data == curr.next.data) {
                while (curr.next != null && curr.data == curr.next.data)
                    curr = curr.next;
                prev.next = curr;
            } else {
                prev = prev.next;
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
