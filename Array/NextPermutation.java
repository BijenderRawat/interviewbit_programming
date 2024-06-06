/*
 * Medium level q asked in Microsoft and Amazon
 * 
 * Implement the next permutation, which rearranges numbers into the numerically next 
 * greater permutation of numbers for a given array A of size N.
 * 
 * If such an arrangement is not possible, it must be rearranged in the lowest possible order 
 * i.e., sorted in ascending order.
 * 
 */

import java.util.ArrayList;
import java.util.Collections;

class NextPermutation {
    public void reverse(ArrayList<Integer> A, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = A.get(i);
            A.set(i, A.get(j));
            A.set(j, temp);
        }
    }

    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        int n = A.size();
        int index = -1;
        for (int i = n - 2; i > -1; i--) {
            if (A.get(i) < A.get(i + 1)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            Collections.reverse(A);
            return A;
        }
        for (int i = n - 1; i >= index; i--) {
            if (A.get(i) > A.get(index)) {
                int temp = A.get(i);
                A.set(i, A.get(index));
                A.set(index, temp);
                break;
            }
        }
        reverse(A, index + 1, n - 1);
        return A;
    }
}