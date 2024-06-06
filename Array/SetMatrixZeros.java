/*
 * Given a matrix, A of size M x N of 0s and 1s. 
 * If an element is 0, set its entire row and column to 0.
 * Note: This will be evaluated on the extra memory used. 
 * Try to minimize the space and time complexity.
 */

import java.util.ArrayList;

class SetMatrixZeros {
    public void setZeroes(ArrayList<ArrayList<Integer>> A) {
        int m = A.size(), n = A.get(0).size();
        int x = 1, y = 1;
        for (int i = 0; i < n; i++)
            if (A.get(0).get(i) == 0)
                x = 0;
        for (int i = 0; i < m; i++)
            if (A.get(i).get(0) == 0)
                y = 0;
        for (int j = 1; j < n; j++)
            for (int i = 1; i < m; i++)
                if (A.get(i).get(j) == 0) {
                    A.get(0).set(j, 0);
                    A.get(i).set(0, 0);
                }
        for (int j = 1; j < n; j++)
            if (A.get(0).get(j) == 0)
                for (int i = 1; i < m; i++)
                    A.get(i).set(j, 0);
        for (int i = 1; i < m; i++)
            if (A.get(i).get(0) == 0)
                for (int j = 1; j < n; j++)
                    A.get(i).set(j, 0);
        if (x == 0)
            for (int i = 0; i < n; i++)
                A.get(0).set(i, 0);
        if (y == 0)
            for (int i = 0; i < m; i++)
                A.get(i).set(0, 0);
    }
}