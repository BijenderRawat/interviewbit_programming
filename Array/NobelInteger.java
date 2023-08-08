import java.util.ArrayList;
import java.util.Collections;

public class NobelInteger {
    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        for (int i = 0; i < A.size(); i++) {
            while (i < A.size() - 1 && A.get(i) == A.get(i + 1))
                i++;
            if (A.get(i) == A.size() - i - 1)
                return 1;
        }
        return -1;
    }
}