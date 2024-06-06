class InsertionSort {
    public Node insertionSortList(Node head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        Node sorted = null;
        Node current = head.next;
        while (current != null) {
            Node next = current.next;
            if (sorted == null || sorted.data >= current.data) {
                current.next = sorted;
                sorted = current;
            } else {
                Node node = sorted;
                while (node.data < current.data)
                    node = node.next;
                current.next = null;
                node.next = current;
            }
            current = next;
        }
        return sorted;
    }
}