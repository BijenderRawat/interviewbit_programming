import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacter {

    public static String solve(String s) {
        char[] arr = new char[26];
        String ans = "";
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
            if (arr[ch - 'a'] == 1)
                q.add(ch);
            while (!q.isEmpty() && arr[q.peek() - 'a'] > 1)
                q.remove();
            if (q.isEmpty())
                ans += "#";
            else
                ans += q.peek();
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "jyhrcwuengcbnuchctluxjgtxqtfvrebveewgasluuwooupcyxwgl";
        System.out.print(solve(s));
    }
}
