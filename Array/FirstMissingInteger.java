/*
 * Medium level q asked in Amazon, Microsoft, FreeCharge, Walmart, InMobi
 * 
 * Given an unsorted integer array, find the first missing positive integer.
 * Your algorithm should run in O(n) time and use constant space.
 */

import java.util.ArrayList;

public class FirstMissingInteger {
    public void swap(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }

    public int firstMissingPositive(ArrayList<Integer> A) {
        int n = A.size();
        for (int i = 0; i < n; i++) {
            int element = A.get(i);
            int chair = element - 1;
            if (element > 0 && element <= n && A.get(chair) != element) {
                swap(A, i, chair);
                i--;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != A.get(i) - 1)
                return i + 1;
        }
        return n + 1;
    }
}
