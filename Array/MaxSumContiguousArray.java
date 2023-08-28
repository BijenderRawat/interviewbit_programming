// This is an easy level question asked in fb, microsoft, amazon, deloitte, yahoo, paypal, linkedin
// This problem is nothing but kadane's algorithm itself.

import java.util.ArrayList;

class MaxSumContiguousArray {
    public int maxSubArray(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE;
        int temp = 0;
        for (int i : A) {
            temp += i;
            if (temp < i)
                temp = i;
            max = Math.max(max, temp);
        }
        return max;
    }
}
