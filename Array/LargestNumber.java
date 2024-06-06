
/*
 * Medium level question asked in Amazon and Microsoft
 * 
 * You are given an arraylist of integers, so merge the numbers of the arraylist so that the number
 * formed is maximum
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class LargestNumber {
    public static String solve(ArrayList<Integer> a) {
        String[] arr = new String[a.size()];
        for (int i = 0; i < a.size(); i++)
            arr[i] = String.valueOf(a.get(i));
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });
        String ans = "";
        for (String i : arr)
            ans += i;
        return ans;
    }
}

// To make the smallest number, you just have to reverse the consition inside
// the comparator