/*
 * Medium level q asked in Unravel Data
 * 
 * In an array of 0s and 1s, move all 0s to the left and 1s to the right
 * 
 * Do it in O(N)
 */
import java.util.ArrayList;

public class Segregate0sand1s {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        for (int i = 0, j = A.size() - 1; i < j;) {
            if (A.get(i) == 0) {
                i++;
                continue;
            }
            if (A.get(j) == 1) {
                j--;
                continue;
            }
            if (A.get(i) == 1 && A.get(j) == 0) {
                int temp = A.get(i);
                A.set(i, A.get(j));
                A.set(j, temp);
            }
        }
        return A;
    }
}