/*
 * Easy q asked in Amazon
 * 
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
 * return the length of last word in the string.
 * 
 * If the last word does not exist, return 0.
 * 
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * Please make sure you try to solve this problem without using library functions. 
 * Make sure you only traverse the string once.
 */

class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
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
}
