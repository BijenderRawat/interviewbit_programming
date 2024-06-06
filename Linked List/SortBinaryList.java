/*
There is a binary linked list i.e only 1s and 0sealed
Sort that list so that is a list 1-0-0-1 becomes 0-0-1-1

Easy q asked in Amazon
*/

class SortBinaryList {
    Node sort(Node A) {
        int numberofzeroes = 0, numberofones = 0;
        Node temp = A;
        while (temp != null) {
            if (temp.data == 0)
                numberofzeroes++;
            else
                numberofones++;
            temp = temp.next;
        }
        temp = A;
        while (numberofzeroes > 0) {
            temp.data = 0;
            temp = temp.next;
            numberofzeroes--;
        }
        while (numberofones > 0) {
            temp.data = 1;
            temp = temp.next;
            numberofones--;
        }
        return A;
    }
}
