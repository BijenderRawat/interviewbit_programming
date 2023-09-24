import java.util.ArrayList;

class MaximumUnsortedSubarray {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int n = A.size();
        ArrayList<Integer> ans = new ArrayList<>();
        if (n == 1) {
            ans.add(-1);
            return ans;
        }
        for (int i = 0, j = n - 1; i < n && j > -1; i++, j--) {
            if (i + 1 < n && A.get(i) > A.get(i + 1)) {
                min = Math.min(min, A.get(i));
                max = Math.max(max, A.get(i));
            }
            if (j - 1 > -1 && A.get(j) < A.get(j - 1)) {
                min = Math.min(min, A.get(j));
                max = Math.max(max, A.get(j));
            }
        }
        if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) {
            ans.add(-1);
            return ans;
        }
        for (int i = 0; i < n; i++) {
            if (min < A.get(i)) {
                ans.add(i);
                break;
            }
        }
        for (int j = n - 1; j > -1; j--) {
            if (max > A.get(j)) {
                ans.add(j);
                break;
            }
        }
        return ans;
    }
}
