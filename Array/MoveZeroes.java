/*
 * Medium level q asked in Adobe
 * 
 * Given an integer array A, move all 0's to the end of it while maintaining the relative 
 * order of the non-zero elements.
 */

import java.util.ArrayList;

public class MoveZeroes {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        // Solution with taking a space
        ArrayList<Integer> ans = new ArrayList<>();
        int countzero = 0;
        for (int i : A) {
            if (i != 0)
                ans.add(i);
            else
                countzero++;
        }
        while (countzero != 0) {
            ans.add(0);
            countzero--;
        }
        // return ans;

        // Solution without taking a space
        int l = 0, h = 0, n = A.size();
        while (l < n && h < n) {
            if (A.get(l) != 0)
                l++;
            else {
                h = l + 1;
                while (h < n && A.get(h) == 0)
                    h++;
                if (h == n)
                    h--;
                int temp = A.get(l);
                A.set(l, A.get(h));
                A.set(h, temp);
                l++;
            }
        }
        return A;
    }
}