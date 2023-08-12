/*
 * Medium level q asked in Unravel Data
 * 
 * You are given an integer array A.
 * You have to find the number of occurences of each number.
 * Return an array containing only the occurences with the smallest value's occurence first.
 * For example, A = [4, 3, 3], you have to return an array [2, 1], where 2 is the number of occurences for element 3, 
 * and 1 is the number of occurences for element 4. But, 2 comes first because 3 is smaller than 4.
 */

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class OccuranceOfNumber {
    public ArrayList<Integer> findOccuranaces(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : A) {
            if (map.get(i) == null)
                map.put(i, 1);
            else
                map.put(i, map.get(i) + 1);
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet())
            ans.add(m.getValue());
        return ans;
    }
}
