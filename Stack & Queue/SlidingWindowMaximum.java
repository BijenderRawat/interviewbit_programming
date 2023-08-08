/*
Medium level q asked in Google, Walmart, Amazon and Microsoft

Given an array of integers A.  There is a sliding window of size B which 

is moving from the very left of the array to the very right. 

You can only see the w numbers in the window. Each time the sliding window moves 

rightwards by one position. You have to find the maximum for each window. 

The following example will give you more clarity.

The array A is [1 3 -1 -3 5 3 6 7], and B is 3.

Window position	Max
———————————-	————————-
[1  3  -1] -3  5  3  6  7	3
1 [3  -1  -3] 5  3  6  7	3
1  3 [-1  -3  5] 3  6  7	5
1  3  -1 [-3  5  3] 6  7	5
1  3  -1  -3 [5  3  6] 7	6
1  3  -1  -3  5 [3  6  7]	7
Return an array C, where C[i] is the maximum value of from A[i] to A[i+B-1].

Note: If B > length of the array, return 1 element with the max of the array.
*/

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMaximum {
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> q = new ArrayDeque<>();
        int i;
        for (i = 0; i < B; i++) {
            while (!q.isEmpty() && A.get(i) >= A.get(q.peekLast()))
                q.removeLast();
            q.addLast(i);
        }
        for (; i < A.size(); i++) {
            ans.add(A.get(q.peekFirst()));
            while (!q.isEmpty() && q.peek() <= i - B)
                q.removeFirst();
            while (!q.isEmpty() && A.get(i) >= A.get(q.peekLast()))
                q.removeLast();
            q.addLast(i);
        }
        ans.add(A.get(q.peekFirst()));
        return ans;
    }
}