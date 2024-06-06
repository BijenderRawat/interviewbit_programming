/*
 * Easy q to check where from the given lengths, a rectangle can be formed or not?
 */

class IsRectangle {
    public int solve(int A, int B, int C, int D) {
        if (A == B && B == C && C == D)
            return 1;
        if (A == B && C == D)
            return 1;
        if (A == C && B == D)
            return 1;
        if (A == D && B == C)
            return 1;
        return 0;
    }
}