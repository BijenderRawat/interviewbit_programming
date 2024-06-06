/*
You are given an array A containing N integers. 
The special product of each ith integer in this array is defined as the product of the following:

LeftSpecialValue: For an index i, it is defined as the index j such that A[j]>A[i] and (i>j). 
If multiple A[j]'s are present in multiple positions, the LeftSpecialValue is the maximum value of j. 
Here LeftSpecialValue is the index j and not A[j].
RightSpecialValue: For an index i, it is defined as the index j such that A[j]>A[i] and (j>i). 
If multiple A[j]'s are present in multiple positions, the RightSpecialValue is the minimum value of j. 
Here RightSpecialValue is the index j and not A[j].

NOTE:  As the answer can be large, output your answer modulo 109 + 7
*/

import java.util.*;

public class MAXPPROD {
    public ArrayList<Integer> leftMax(ArrayList<Integer> A) {
        ArrayList<Integer> left = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.size(); i++) {
            while (!stack.empty() && A.get(stack.peek()) <= A.get(i))
                stack.pop();
            if (stack.empty())
                left.add(0);
            else
                left.add(stack.peek());
            stack.push(i);
        }
        return left;
    }

    public ArrayList<Integer> rightMax(ArrayList<Integer> A) {
        ArrayList<Integer> right = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = A.size() - 1; i > -1; i--) {
            while (!stack.empty() && A.get(stack.peek()) <= A.get(i))
                stack.pop();
            if (stack.empty())
                right.add(0, 0);
            else
                right.add(0, stack.peek());
            stack.push(i);
        }
        return right;
    }

    public int maxSpecialProduct(ArrayList<Integer> A) {
        ArrayList<Integer> left = leftMax(A);
        ArrayList<Integer> right = rightMax(A);
        long max = 0;
        for (int i = 0; i < A.size(); i++)
            max = Math.max(max, (long) left.get(i) * (long) right.get(i));
        return (int) (max % 1000000007);
    }
}
