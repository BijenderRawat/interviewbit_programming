
/*
 * Given an integer array A of size N.
 * You have to pick exactly B elements from either left or right end of the array A to get the maximum sum.
 * Find and return this maximum possible sum.
 */
import java.util.ArrayList;

public class PickFromBothSides {
    public static int solve(ArrayList<Integer> A, int B) {
        int size = A.size();
        int maxSum = 0;
        for (int i = 0; i < B; i++)
            maxSum += A.get(i);
        if (B == size)
            return maxSum;
        int localSum = maxSum;
        int startPointer = B - 1;
        int endPointer = size - 1;
        for (int i = startPointer; i >= 0; i--) {
            localSum -= A.get(i);
            localSum += A.get(endPointer);
            maxSum = Math.max(localSum, maxSum);
            endPointer--;
        }
        return maxSum;
    }
}
