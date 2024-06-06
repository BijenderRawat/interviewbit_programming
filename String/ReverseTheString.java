/* 
    Easy q asked in Microsoft, Facebook and Amazon
    
    Reverse the string word by word
    Reversed string must not include any leading or trailing spaces
    Is there are multiple spaces between the words in input string then reduce them only 
    to one space in reversed string
*/

class ReverseTheString {
    public String solve(String s) {
        int j = s.length() - 1;
        while (j > -1 && s.charAt(j) == ' ')
            j--;
        if (j < 0)
            return "";
        int i = 0;
        while (i < j && s.charAt(i) == ' ')
            i++;
        if (i == j)
            Character.toString(s.charAt(i));
        String ans = "";
        for (; j >= i;) {
            int t = j;
            while (t > -1 && s.charAt(t) != ' ')
                t--;
            ans += s.substring(i + 1, j + 1) + " ";
            while (t > -1 && s.charAt(t) == ' ')
                t--;
            j = t;
        }
        return ans.substring(0, ans.length() - 1);
    }
}