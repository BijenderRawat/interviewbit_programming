/*
 * Medium level q asked in Amazon
 * 
 * Given a positive integer n and a string s consisting only of letters D or I, 
 * you have to find any permutation of first n positive integer that satisfy the given input string.
 * 
 * D means the next number is smaller, while I means the next number is greater.
 * 
 * Notes
 * Length of given string s will always equal to n - 1
 * Your solution should run in linear time and space.
 */

import java.util.ArrayList;

class FindPermutation {
    public ArrayList<Integer> findPerm(final String A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 1, j = B, k = 0;
        while (i < j) {
            if (A.charAt(k) == 'I') {
                ans.add(i);
                i++;
            } else {
                ans.add(j);
                j--;
            }
        }
        ans.add(i);
        return ans;
    }
}