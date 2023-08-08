// we need to find the length of the last word and return it
// return 0 if last word do not exist

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        if (s.length() == 1 && s.charAt(0) != ' ')
            return 1;
        int i = s.length() - 1;
        while (i > -1 && s.charAt(i) == ' ')
            i--;
        if (i < 0)
            return 0;
        int ans = 0;
        while (i > -1 && s.charAt(i) != ' ') {
            i--;
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "hellol ";
        System.out.println(lengthOfLastWord(s));
    }
}
