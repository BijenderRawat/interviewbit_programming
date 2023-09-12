class QuickSort {
    public static Node pivot(Node left, Node right) {
        Node pivot = left;
        
    }

    public static void quickSort(Node left, Node right) {
        if (left == right)
            return;
        Node pivot = pivot(left, right);
    }

    public static void main(String[] args) {
        Node A = new Node(1);
        A.next = new Node(4);
        A.next.next = new Node(5);
        A.next.next.next = new Node(3);

        Node end = A;
        while (end.next != null)
            end = end.next;

        quickSort(A, end);

        while (A != null) {
            System.out.print(A.data + " ");
            A = A.next;
        }
    }
}
