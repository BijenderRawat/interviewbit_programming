import java.util.ArrayList;

public class MaxDistance {
    public static int maximumGap(ArrayList<Integer> A) {
        int size = A.size();
        int[] lmin = new int[size];
        lmin[0] = A.get(0);
        int[] rmax = new int[size];
        rmax[size - 1] = A.get(size - 1);
        for (int i = size - 2, j = 1; i > -1 && j < size; i--, j++) {
            if (A.get(i) >= rmax[i + 1])
                rmax[i] = A.get(i);
            else
                rmax[i] = rmax[i + 1];
            if (A.get(j) <= lmin[j - 1])
                lmin[j] = A.get(j);
            else
                lmin[j] = lmin[j - 1];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0, j = 0; i < size && j < size;) {
            if (rmax[j] >= lmin[i]) {
                max = Math.max(max, j - i);
                j++;
            } else
                i++;
        }
        return max;
    }
}