/*
for every ith position in the given arraylist, find the jth element that is nearest smallest such that
j < if

in other words find previous smallest element for every ith position in the arraylist

Easy q asked in Amazon and Microsoft
*/

import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallerElement {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for (int i : A) {
            while (!s.isEmpty() && s.peek() >= i)
                s.pop();
            if (s.isEmpty())
                ans.add(-1);
            else
                ans.add(s.peek());
            s.push(i);
        }
        return ans;
    }
}
