/*
 * It's a nedium level question
 * 
 * You are given a 1D integer array B containing A integers.
 * Count the number of ways to split all the elements of the array into 3 contiguous parts so that the sum of elements in each part is the same.
 * Such that : sum(B[1],..B[i]) = sum(B[i+1],...B[j]) = sum(B[j+1],...B[n]) 
 */

public class Partitions {
    public static int solve(int[] A) {
        int sum = 0;
        for (int i : A)
            sum += i;
        if (sum % 3 != 0)
            return 0;
        int cumulativesum = 0;
        int result = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            cumulativesum += A[i];
            if (cumulativesum == (2 * sum) / 3 && i > 0 && i < A.length - 1)
                result += count;
            if (cumulativesum == sum / 3)
                count++;
        }
        return result;
    }
}