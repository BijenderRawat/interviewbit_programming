import java.util.ArrayList;
import java.util.Collections;

class AllFactors {
    public ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(A); i++) {
            if (A % i == 0) {
                ans.add(i);
                if (i != A / i)
                    ans.add(A / i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}