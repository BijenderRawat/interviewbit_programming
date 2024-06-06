/*
 * Given a string A denoting an expression. 
 * It contains the following operators '+', '-', '*', '/'.
 * Check whether A has redundant braces or not.
 * NOTE: A will be always a valid expression.
 */

import java.util.Stack;

class RedundantBraces {
    public int braces(String A) {
        Stack<Character> s = new Stack<>();
        for (char ch : A.toCharArray()) {
            if (ch != ')')
                s.push(ch);
            else {
                int j = 0;
                while (!s.empty() && s.peek() != '(') {
                    s.pop();
                    j++;
                }
                if (j <= 1)
                    return 1;
                s.pop();
                s.push('a');
            }
        }
        return 0;
    }
}