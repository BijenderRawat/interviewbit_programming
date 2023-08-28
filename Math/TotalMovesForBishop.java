/*
 * Easy Q asked in Goldman Sachs
 * 
 * In a chess of 8 * 8, count the total number of possible space, bishop can visit in 1 move
 * 
 * indexing starts from 1 to 8
 */

class TotalMovesForBishop {

    /*
     * Solution approach is to count the number of moves, a bishop can make on all
     * of its
     * 4 directions, which is minimum of number of col and rol in each direction.
     */
    public int solve(int A, int B) {
        return Math.min(A - 1, B - 1) + Math.min(A - 1, 8 - B) + Math.min(8 - A, 8 - B) + Math.min(8 - A, B - 1);
    }
}