/*
 * Medium level q asked in Amazon
 * 
 * Given an array of all positive integers and an element “x”. 
 * 
 * You need to find out whether all array elements can be made equal or not by performing 
 * any of the 3 operations: add x to any element in array, subtract x from any element from array, 
 * do nothing.
 * 
 * This operation can be performed only once on an element of array.
 */

import java.util.ArrayList;

public class MakeEqualElements {
    public int solve(ArrayList<Integer> A, int B) {
        if (B == 0)
            return 0;
        int n = A.size();

        // One way to solve the problem
        for (int i = 1; i < n; i++) {
            int t = A.get(i);
            int j = A.get(i - 1);
            if (t != j + B && t != j - B && t != j && t + B != j && t - B != j && t + B != j + B && t + B != j - B
                    && t - B != j + B && t - B != j - B) {
                return 0;
            }
        }
        // return 1;

        // Another way to solve the problem
        int min = A.get(0);
        for (int i : A)
            if (i < min)
                min = i;
        for (int i : A)
            if (i != min + B && i + B != min + B && i - B != min + B)
                return 0;
        return 1;
    }
}
