/*
 * Medium level q in Microsoft
 * 
 * Given an integer A, return the number of trailing zeroes in A!.
 * Your solution should be in logarithmic time complexity.
 */

class TrailingZeroesInFactorial {
    public int trailingZeroes(int A) {
        int res = 0;
        for (int i = 5; i <= A; i *= 5)
            res = res + A / i;
        return res;
    }
}
