/*
 * Medium level q asked in Amazon
 * 
 * You are given an array of logs. 
 * Each log is a space-delimited string of words, where the first word is the identifier.
 * 
 * There are two types of logs:
 * Letter-logs: All words (except the identifier) consist of lowercase English letters.
 * Digit-logs: All words (except the identifier) consist of digits.
 * 
 * Reorder these logs so that:
 * The letter-logs come before all digit-logs.
 * The letter-logs are sorted lexicographically by their contents. 
 * If their contents are the same, then sort them lexicographically by their identifiers.
 * The digit-logs maintain their relative ordering.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ReorderDataInLogFiles {
    public ArrayList<String> reorderLogs(ArrayList<String> A) {
        ArrayList<String> ans = new ArrayList<>();
        for (String s : A) {
            String[] array = s.split("-");
            if (array[1].toCharArray()[0] >= 48 && array[1].toCharArray()[0] <= 57)
                continue;
            ans.add(s);
        }
        Collections.sort(ans, new Comparator<String>() {
            public int compare(String a, String b) {
                String[] a1 = a.split("-");
                String[] a2 = b.split("-");
                int i = 1;
                for (; i < a1.length; i++) {
                    if (a1[i].compareTo(a2[i]) == 0)
                        continue;
                    return a1[i].compareTo(a2[i]);
                }
                return a1[0].compareTo(a2[0]);
            }
        });
        for (String s : A) {
            String[] array = s.split("-");
            if (array[1].toCharArray()[0] >= 48 && array[1].toCharArray()[0] <= 57)
                ans.add(s);
        }
        return ans;
    }
}