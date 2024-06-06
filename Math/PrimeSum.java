/* 
 * Easy q
 * 
 * Given an even number as input
 * 
 * return the 2 prime number, x and y whose sum is = that number
 * 
 * return lexicographically smaller prime numbers
 */

import java.util.ArrayList;

/*
 * In this question, the line "return lexicographically smaller primes" is of no use
 * 
 * because answer of this question would be the very first 2 primes
 */

class PrimeSum {
    public boolean isPrime(int A) {
        for (int i = 2; i <= Math.sqrt(A); i++)
            if (A % i == 0)
                return false;
        return true;
    }

    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 2; i <= A / 2; i++) {
            if (isPrime(i) && isPrime(A - i)) {
                ans.add(i);
                ans.add(A - i);
                break;
            }
        }
        return ans;
    }
}