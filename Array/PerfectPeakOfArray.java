/*
 * Easy level q asked in flipkart, Ola
 * 
 * Given an integer array A of size N.
 * You need to check that whether there exist a element which is strictly greater than all the 
 * elements on left of it and strictly smaller than all the elements on right of it.
 * If it exists return 1 else return 0.
 * Do not consider the corner elements i.e A[0] and A[N-1] as the answer.
 */

import java.util.ArrayList;

public class PerfectPeakOfArray {
    public int perfectPeak(ArrayList<Integer> A) {
        int n = A.size();
        int[] left = new int[n];
        left[0] = A.get(0);
        int[] right = new int[n];
        right[n - 1] = A.get(n - 1);
        for (int i = 1; i < n; i++)
            left[i] = Math.max(A.get(i), left[i - 1]);
        for (int i = n - 2; i > -1; i--)
            right[i] = Math.min(A.get(i), right[i + 1]);
        for (int i = 1; i < n - 1; i++)
            if (A.get(i) > left[i - 1] && A.get(i) < right[i + 1])
                return 1;
        return 0;
    }
}