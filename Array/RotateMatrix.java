import java.util.ArrayList;

class RotateMatrix {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = a.get(i).get(j);
                a.get(i).set(j, a.get(j).get(i));
                a.get(j).set(i, temp);
            }
        }
        for (ArrayList<Integer> A : a) {
            for (int i = 0; i < A.size() / 2; i++) {
                int temp = A.get(i);
                A.set(i, A.get(n - i - 1));
                A.set(n - i - 1, temp);
            }
        }
    }
}