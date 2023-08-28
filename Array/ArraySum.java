/*
 * Medium level q asked in Paytm
 * 
 * You are given two arrays A and B.
 * 
 * You have to return an array which representing the sum of the two given numbers.
 * 
 * Array A and Array B can be of different size.
 */

import java.util.ArrayList;

class ArraySum {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = A.size() - 1;
        int j = B.size() - 1;
        int carry = 0;
        while (i > -1 && j > -1) {
            int a = A.get(i);
            int b = B.get(j);
            int temp = a + b + carry;
            if (temp > 9) {
                carry = temp / 10;
                temp = temp % 10;
                ans.add(0, temp);
            } else {
                carry = 0;
                ans.add(0, temp);
            }
            i--;
            j--;
        }
        if (i == -1) {
            while (j > -1) {
                int a = B.get(j);
                int temp = a + carry;
                if (temp > 9) {
                    carry = temp / 10;
                    temp = temp % 10;
                    ans.add(0, temp);
                } else {
                    carry = 0;
                    ans.add(0, temp);
                }
                j--;
            }
        }
        if (j == -1) {
            while (i > -1) {
                int a = A.get(i);
                int temp = a + carry;
                if (temp > 9) {
                    carry = temp / 10;
                    temp = temp % 10;
                    ans.add(0, temp);
                } else {
                    carry = 0;
                    ans.add(0, temp);
                }
                i--;
            }
        }
        if (carry != 0)
            ans.add(0, carry);
        return ans;
    }
}
