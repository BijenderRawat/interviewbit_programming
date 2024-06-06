import java.util.ArrayList;
import java.util.Stack;

public class LargestRectangleHistogram {
    int[] prevSmaller(ArrayList<Integer> A) {
        int[] ans = new int[A.size()];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < A.size(); i++) {
            while (!s.isEmpty() && A.get(s.peek()) >= A.get(i))
                s.pop();
            if (s.isEmpty())
                ans[i] = -1;
            else
                ans[i] = s.peek();
            s.push(i);
        }
        return ans;
    }

    int[] nextSmaller(ArrayList<Integer> A) {
        int[] ans = new int[A.size()];
        Stack<Integer> s = new Stack<>();
        for (int i = A.size() - 1; i > -1; i--) {
            while (!s.isEmpty() && A.get(i) >= A.get(s.peek()))
                s.pop();
            if (s.isEmpty())
                ans[i] = A.size();
            else
                ans[i] = s.peek();
            s.push(i);
        }
        return ans;
    }

    int largestRectangleArea(ArrayList<Integer> A) {
        if (A.size() == 1)
            return A.get(0);
        int[] nextsmaller = nextSmaller(A);
        int[] prevsmaller = prevSmaller(A);
        int maxArea = 0;
        for (int i = 0; i < A.size(); i++) {
            int area = A.get(i) * (nextsmaller[i] - prevsmaller[i] - 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
