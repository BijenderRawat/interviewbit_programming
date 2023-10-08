/*
 * Medium level q asked in Google
 *
 * You're given a read-only array of N integers. 
 * Find out if any integer occurs more than N/3 times in the array in linear time and 
 * constant additional space.
 * If so, return the integer. If not, return -1.
 * 
 * If there are multiple solutions, return any one.
 */

import java.util.ArrayList;

public class RepeatNumber {
    public int repeatedNumber(ArrayList<Integer> A) {
        int candidate1 = Integer.MIN_VALUE, candidate2 = Integer.MIN_VALUE, life1 = 0, life2 = 0;
        for (int i : A) {
            if (candidate1 == i)
                life1++;
            else if (candidate2 == i)
                life2++;
            else if (life1 == 0) {
                candidate1 = i;
                life1 = 1;
            } else if (life2 == 0) {
                candidate2 = i;
                life2 = 1;
            } else {
                life1--;
                life2--;
            }
        }
        int count1 = 0, count2 = 0;
        for (int i : A) {
            if (i == candidate1)
                count1++;
            if (i == candidate2)
                count2++;
        }
        if (count1 > A.size() / 3)
            return candidate1;
        if (count2 > A.size() / 3)
            return candidate2;
        return -1;
    }
}
