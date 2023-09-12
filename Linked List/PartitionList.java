/*
partition a list such that all nodes less than B come before nodes greater than or equal to B. 

eg if 1-4-3-2-5-2 is a list and B = 3, then the list would become 1-2-2-4-3-2
Medium level q asked in Microsoft
*/

class PartitionList {
    public Node partition(Node A, int B) {
        Node lessprev = null;
        Node greaterprev = null;
        Node greaterprevhead = null;
        Node head = A;
        while (A != null) {
            if (A.data < B) {
                if (lessprev != null) {
                    lessprev.next = A;
                    lessprev = A;
                } else {
                    lessprev = A;
                    head = A;
                }
            } else {
                if (greaterprev != null) {
                    greaterprev.next = A;
                    greaterprev = greaterprev.next;
                } else {
                    greaterprevhead = A;
                    greaterprev = A;
                }
            }
            A = A.next;
        }
        if (greaterprev != null)
            greaterprev.next = null;
        if (lessprev != null)
            lessprev.next = greaterprevhead;
        return head;
    }
}