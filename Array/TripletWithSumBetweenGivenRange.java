/*
 * Medium level q
 * 
 * Given an array of real numbers greater than zero in form of strings. 
 * Find if there exists a triplet such that 1 < a+b+c < 2. 
 * Return 1 for true or 0 for false.
 * O(n) solution is expected.
 */

import java.util.ArrayList;
import java.util.Collections;

class TripletWithSumBetweenGivenRange {
    public int solve(ArrayList<String> A) {
        Collections.sort(A);
        int i = 0, j = A.size() - 1;
        while (j - i >= 2) {
            double a = Double.parseDouble(A.get(i));
            double b = Double.parseDouble(A.get((i + j) / 2));
            double c = Double.parseDouble(A.get(j));
            if (a + b + c < 1)
                i++;
            else if (a + b + c > 2)
                j--;
            else
                return 1;
        }
        return 0;
    }
}