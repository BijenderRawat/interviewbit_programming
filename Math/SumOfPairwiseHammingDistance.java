/*
 * Medium level q asked in Google
 * 
 * Hamming distance between two non-negative integers is defined as the number of positions 
 * at which the corresponding bits are different.
 * 
 * Given an array A, find the sum of hamming distances of all pairs of integers in the array. 
 * Return the answer modulo 1000000007.
 */

import java.util.List;

class SumOfPairwiseHammingDistance {
    public int hammingDistance(List<Integer> A) {
        long ans = 0;
        for (int i = 0; i < 32; i++) {
            long count1 = 0, count0 = 0;
            for (int j = 0; j < A.size(); j++)
                if (((1 << i) & A.get(j)) == 0)
                    count0++;
                else
                    count1++;
            ans += count1 * count0 * 2;
        }
        return (int) (ans % 1000000007);
    }
}
