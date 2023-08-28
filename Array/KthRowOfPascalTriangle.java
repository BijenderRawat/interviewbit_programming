/*
 * Easy q asked in Google
 * 
 * Given an index k, return the kth row of the Pascal's triangle.
 * Example: Input : k = 3
 * Return : [1,3,3,1]
 * Note: k is 0 based. k = 0, corresponds to the row [1]. 
 * Note: Could you optimize your algorithm to use only O(k) extra space?
 */

import java.util.ArrayList;

class KthRowOfPascalTriangle {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i <= A; i++) {
            ArrayList<Integer> row = new ArrayList<>(i + 1);
            int t = 0;
            while (t < i + 1) {
                row.add(1);
                t++;
            }
            for (int j = 1; j < i; j++)
                row.set(j, ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
            ans.add(row);
        }
        return ans.get(A);
    }
}