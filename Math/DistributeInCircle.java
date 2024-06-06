/*
 * Easy level q asked in Goldman Sachs
 * 
 * You are given A number of packages, B is the size and C is the starting position
 * 
 * return the position where the last package will be delivered
 */

class DistributeInCircle {
    public int solve(int A, int B, int C) {
        return (A + C - 1) % B;
    }
}