public class BubbleSort {
    public Node bubbleSortList(Node A) {
        if (A == null || A.next == null)
            return A;
        Node curr = A;
        while (curr != null) {
            Node index = curr.next;
            while (index != null) {
                if (index.data > curr.data)
                    index = index.next;
                else {
                    int temp = index.data;
                    index.data = curr.data;
                    curr.data = temp;
                }
            }
            curr = curr.next;
        }
        return A;
    }
}
