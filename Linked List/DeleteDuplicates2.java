/*
Task is to remove all the nodes which are comming more than once

eg in 1-2-3-3-4-5 list, 3 is comming twice so remove both the 3
so that list becomes 1-2-4-5

Medium level q asked in Microsoft
*/

class DeleteDuplicates2 {
    public Node deleteDuplicates(Node A) {
        if (A == null || A.next == null)
            return A;
        Node dummy = new Node(-1);
        dummy.next = A;
        Node prev = dummy;
        Node curr = A;
        while (curr != null) {
            if (curr.next != null && curr.next.data == curr.data) {
                while (curr != null && prev.next.data == curr.data)
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