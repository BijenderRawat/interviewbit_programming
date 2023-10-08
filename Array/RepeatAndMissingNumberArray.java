/*
 * Medium level q asked in Amazon
 * 
 * There are certain problems which are asked in the interview to also check how you take 
 * care of overflows in your problem.
 * 
 * This is one of those problems.
 * Please take extra care to make sure that you are type-casting your ints to long properly and at all places. 
 * Try to verify if your solution works if number of elements is as large as 105
 * 
 * Food for thought :
 * Even though it might not be required in this problem, in some cases, 
 * you might be required to order the operations cleverly so that the numbers do not overflow.
 * 
 * For example, if you need to calculate n! / k! where n! is factorial(n), 
 * one approach is to calculate factorial(n), factorial(k) and then divide them.
 * 
 * Another approach is to only multiple numbers from k + 1 ... n to calculate the result.
 * Obviously approach 1 is more susceptible to overflows.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatAndMissingNumberArray {
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int n = A.size();
        HashMap<Integer, Integer> map = new HashMap<>(n);
        for (int i = 1; i <= n; i++)
            map.put(i, 0);
        for (int i : A)
            if (i > 0 && i <= n)
                map.replace(i, (int) map.get(i) + 1);
        int missing = -1;
        int repeat = -1;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if ((int) m.getValue() == 0)
                missing = (int) m.getKey();
            if ((int) m.getValue() > 1)
                repeat = (int) m.getKey();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(repeat);
        ans.add(missing);
        return ans;
    }
}
