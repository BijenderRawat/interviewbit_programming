/*
 * Easy q asked in Google and Amazon
 * 
 * Return a pascal tree of A rows. 
 */

import java.util.ArrayList;

public class PascalTriangle {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            int t = 0;
            while (t < i + 1) {
                row.add(1);
                t++;
            }
            for (int j = 1; j < i; j++)
                row.add(j, ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
            ans.add(row);
        }
        return ans;
    }
}
