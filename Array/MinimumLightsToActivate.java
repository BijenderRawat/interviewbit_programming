/*
 * Easy level q asked in Directi
 * 
 * There is a corridor in a Jail which is N units long. Given an array A of size N. 
 * The ith index of this array is 0 if the light at ith position is faulty otherwise it is 1.
 * All the lights are of specific power B which if is placed at position X, it can light the corridor from [ X-B+1, X+B-1].
 * Initially all lights are off.
 * Return the minimum number of lights to be turned ON to light the whole corridor or -1 if the whole corridor cannot be lighted.
 */

import java.util.ArrayList;

public class MinimumLightsToActivate {
    public int solve(ArrayList<Integer> A, int B) {
        int count = 0, i = 0, n = A.size();
        while (i < n) {
            int left = Math.max(0, i - B + 1);
            int right = Math.min(n - 1, i + B - 1);
            boolean bulbfound = false;
            while (right >= left) {
                if (A.get(right) == 1) {
                    bulbfound = true;
                    break;
                }
                right--;
            }
            if (!bulbfound)
                return -1;
            count++;
            i = right + B;
        }
        return count;
    }
}