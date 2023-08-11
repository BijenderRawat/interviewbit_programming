/*
 * Medium level q asked in Directi
 * 
 * Given an array A containing N integers.
 * You need to find the maximum sum of triplet ( Ai + Aj + Ak ) such that 0 <= i < j < k < N and Ai < Aj < Ak.
 * If no such triplet exist return 0.
 */

import java.util.ArrayList;
import java.util.TreeSet;

public class MaximumSumTriplet {
    public static int solve(ArrayList<Integer> A) {
        int n = A.size();
        int[] max = new int[n];
        max[n - 1] = A.get(n - 1);
        for (int i = n - 2; i > -1; i--)
            max[i] = Math.max(A.get(i), max[i + 1]);
        int[] min = new int[n];
        TreeSet<Integer> set = new TreeSet<>();
        min[0] = 0;
        set.add(A.get(0));
        for (int i = 0; i < n; i++) {
            set.add(A.get(i));
            Integer j = set.lower(A.get(i));
            if (j == null)
                min[i] = 0;
            else
                min[i] = j;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (min[i] == 0 || max[i] <= A.get(i))
                continue;
            ans = Math.max(ans, min[i] + max[i] + A.get(i));
        }
        return ans;
    }
}