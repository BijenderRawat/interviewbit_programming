/*
 * Easy q asked in Microsoft and Adobe
 * 
 * You are given a N * N matrix, so print all the anti diagonals
 */

import java.util.ArrayList;

public class AntiDiagonal {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // Number of diagonal present in a matrix is size*2-1

        for (int i = 0; i < A.size() * 2 - 1; i++)
            ans.add(new ArrayList<>());

        // here we are iterating to every row in the input matrix and determing the position at which
        // the element should be present in the ans matrix

        for (int i = 0; i < A.size(); i++)
            for (int j = 0; j < A.size(); j++)
                ans.get(i + j).add(A.get(i).get(j));
        return ans;
    }
}