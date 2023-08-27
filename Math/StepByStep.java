/*
 * Easy q
 * 
 * Given a target A on an infinite number line, i.e. -infinity to +infinity.
 * You are currently at position 0 and you need to reach the target by moving according 
 * to the below rule:
 * 
 * In ith move you can take i steps forward or backward.
 * Find the minimum number of moves required to reach the target.
 */

public class StepByStep {
    public int solve(int A) {
        A = Math.abs(A);
        int i = 0, sum = 0;
        while (sum < A) {
            i++;
            sum += i;
        }
        while ((sum - A) % 2 != 0) {
            i++;
            sum += i;
        }
        return i;
    }
}
