/*
 * Given a string, determine if it is a palindrome.
 * While checking for a palindrome, you have to ignore spaces, case, and all special characters; 
 * i.e. consider only alphanumeric characters.
 */

class PalindromeString {
    public int isPalindrome(String A) {
        int first = 0;
        int last = A.length() - 1;
        while (first < last) {
            if (!Character.isLetterOrDigit(A.charAt(first))) {
                first++;
                continue;
            }
            if (!Character.isLetterOrDigit(A.charAt(last))) {
                last--;
                continue;
            }
            if (Character.toLowerCase(A.charAt(first)) != Character.toLowerCase(A.charAt(last)))
                return 0;
            first++;
            last--;
        }
        return 1;
    }
}