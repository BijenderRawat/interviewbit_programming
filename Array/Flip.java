/*
 * Easy level q asked in Microsoft and Amazon
 * 
 * You are given a binary string A. In a single operation, you can choose two indices L and R 
 * such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, ..., AR. 
 * By flipping, we mean change character 0 to 1 and vice-versa.
 * 
 * Your aim is to perform ATMOST one operation such that in final string number of 1s is maximised.
 * 
 * If you don't want to perform the operation, return an empty array. 
 * Else, return an array consisting of two elements denoting L and R. 
 * If there are multiple solutions, return the lexicographically smallest pair of L and R.
 * 
 */

import java.util.ArrayList;

class Flip {
    public static ArrayList<Integer> checkMax(ArrayList<Integer> A) {
        int a = 0, b = Integer.MIN_VALUE, left = 0, right = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        ans.add(0);
        for (int i = 0; i < A.size(); i++) {
            a += A.get(i);
            if (a < 0) {
                a = 0;
                left = i + 1;
            }
            if (a > b) {
                b = a;
                right = i;
                ans.set(0, left + 1);
                ans.set(1, right + 1);
            }
        }
        return ans;
    }

    public static ArrayList<Integer> flip(String A) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean is0present = false;
        for (char ch : A.toCharArray()) {
            if (ch == '0') {
                list.add(1);
                is0present = true;
            } else
                list.add(-1);
        }
        if (!is0present)
            return new ArrayList<>();
        return checkMax(list);
    }
}