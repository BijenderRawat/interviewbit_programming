import java.util.ArrayList;

public class Flip {
    public static ArrayList<Integer> checkMax(ArrayList<Integer> A) {
        int a = 0, b = Integer.MIN_VALUE, left = 0, right = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        ans.add(0);
        for (int i = 0; i < A.size(); i++) {
            a += A.get(i);
            if (a < 0) {
                a = 0;
                left = i + 1;
            }
            if (a > b) {
                b = a;
                right = i;
                ans.set(0, left + 1);
                ans.set(1, right + 1);
            }
        }
        return ans;
    }

    public static ArrayList<Integer> flip(String A) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean is0present = false;
        for (char ch : A.toCharArray()) {
            if (ch == '0') {
                list.add(1);
                is0present = true;
            } else
                list.add(-1);
        }
        if (!is0present)
            return new ArrayList<>();
        return checkMax(list);
    }
}