// Given a linked list A , reverse the order of all nodes at even positions.

// Medium level q asked in Amazon

class EvenReverse {
    int length(Node A) {
        if (A == null)
            return 0;
        if (A.next == null)
            return 1;
        int length = 0;
        while (A != null) {
            length++;
            A = A.next;
        }
        return length;
    }

    Node evenReverse(Node A) {
        if (A == null)
            return null;
        int length = length(A);
        if (length < 4)
            return A;
        int j = length - 1;
        while (j % 2 == 0)
            j--;
        int i = 1;
        while (i < j) {
            int t = 0;
            Node node = A;
            while (t < i) {
                node = node.next;
                t++;
            }
            Node lastnode = node;
            while (t < j) {
                lastnode = lastnode.next;
                t++;
            }
            int data = lastnode.data;
            lastnode.data = node.data;
            node.data = data;
            i += 2;
            j -= 2;
        }
        return A;
    }

}
