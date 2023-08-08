/*
Given a string A representing an absolute path for a file (Unix-style).

Return the string A after simplifying the absolute path.

Note:

In Unix-style file system:
A period '.' refers to the current directory.
A double period '..' refers to the directory up a level.
Any multiple consecutive slashes '//' are treated as a single slash '/'.
In Simplified Absolute path:
The path starts with a single slash '/'.
Any two directories are separated by a single slash '/'.
The path doesn't end with trailing slashes '/'.
The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
The path will not have whitespace characters.
*/

// Medium level q asked in microsoft

import java.util.Stack;

public class SimplifyDirectoryPath {
    public String simplifyPAth(String A) {
        Stack<String> stack = new Stack<>();
        int size = A.length();
        int start;
        String s;
        for (int i = 0; i < size;) {
            while (i < size && A.charAt(i) == '/')
                i++;
            if (i >= size)
                break;
            start = i;
            while (i < size && A.charAt(i) != '/')
                i++;
            s = A.substring(start, i);
            if (s.equalsIgnoreCase("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else if (!s.equalsIgnoreCase("."))
                stack.push(s);
        }
        String ans = "";
        if (stack.isEmpty())
            ans = "/";
        while (!stack.isEmpty())
            ans = "/" + stack.pop() + ans;
        return ans;
    }
}
