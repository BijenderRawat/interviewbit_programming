/*
 * Easy but not so easy problem asked in Microsoft and Amazon
 * 
 * You are given an integer and return a square matrix with elements from 1 to A*A in spiral order
 * 
 */

import java.util.ArrayList;

public class SpiralOrderMatrixII {

    /*
     * The approach to solve this problem is traversing in the 2D matric in a
     * particular order
     * 
     * First we are moving from left to right
     * then from top to bottom
     * then from right to left
     * and then from bottom to top
     * 
     * This order is continued till we don't reach the limit of A
     * 
     */
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(A);
        for (int i = 0; i < A; i++) {
            ans.add(new ArrayList<Integer>(A));
            for (int j = 0; j < A; j++)
                ans.get(i).add(0);
        }
        int left = 0, right = A - 1, top = 0, bottom = A - 1;
        int k = 1;
        while (k <= A * A) {

            // This loop is moving left to right
            for (int i = left; i <= right && k <= A * A; i++)
                ans.get(top).set(i, k++);

            // This loop is moving from top to bottom
            for (int i = top + 1; i <= bottom - 1 && k <= A * A; i++)
                ans.get(i).set(right, k++);

            // This loop is moving from right to left
            for (int i = right; i >= left && k <= A * A; i--)
                ans.get(bottom).set(i, k++);

            // This loop is moving from bottom to top
            for (int i = bottom - 1; i >= top + 1 && k <= A * A; i--)
                ans.get(i).set(left, k++);

            left++;
            right--;
            top++;
            bottom--;
        }
        return ans;
    }
}
