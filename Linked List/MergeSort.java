// Time complexity of sorting a linked list using merge sort is O(nlogn)
// with O(1) space complexity

class MergeSort {
    public Node conquer(Node left, Node right) {
        if (left == null)
            return right;
        if (right == null)
            return left;
        Node result = null;
        if (left.data < right.data) {
            result = left;
            result.next = conquer(left.next, right);
        } else {
            result = right;
            result.next = conquer(left, right.next);
        }
        return result;
    }

    public Node findMid(Node A) {
        Node slow = A, fast = A.next;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public Node sortList(Node A) {
        if (A == null || A.next == null)
            return A;
        Node mid = findMid(A);
        Node midNext = mid.next;
        mid.next = null;
        Node left = sortList(A);
        Node right = sortList(midNext);
        return conquer(left, right);
    }
}
