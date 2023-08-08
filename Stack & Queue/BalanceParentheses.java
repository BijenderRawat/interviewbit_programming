/*
Given a string A consisting only of '(' and ')'.
You need to find whether parantheses in A is balanced or not ,if it is balanced then return 1 else return 0.
Easy q asked in Amazon and Google
*/

import java.util.Stack;

public class BalanceParentheses {
    public int solve(String A) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (ch == '(')
                s.push(ch);
            else {
                if (ch == ')' && s.isEmpty())
                    return 0;
                else if (s.peek() == '(')
                    s.pop();
                else
                    return 0;
            }
        }
        if (s.isEmpty())
            return 1;
        return 0;
    }
}