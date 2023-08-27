/*
 * Medium level q asked in Facebook
 * 
 * Given an array A. Rearrange the given array so that A[i] becomes A[A[i]] with O(1) extra space.
 * 
 */

import java.util.ArrayList;

public class RearrangeArray {
    public void arrange(ArrayList<Integer> a) {
        int[] array = new int[a.size()];
        for (int i = 0; i < array.length; i++)
            array[i] = a.get(a.get(i));
        a.clear();
        for (int i : array)
            a.add(i);
    }
}