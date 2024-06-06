
/*
 * Given a read-only array of n + 1 integers between 1 and n, find one number that repeats in 
 * linear time using less than O(n) space and traversing the stream sequentially O(1) times.
 * If there are multiple possible answers, output any one, if there is no duplicate, output -1
 * 
 * Easy level question asked in Amazon, Microsoft
 */
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class FindDuplicateInArray {
    public static int repeatedNumber(final List<Integer> A) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : A) {
            if (set.contains(num))
                return num;
            else
                set.add(num);
        }
        return A.size() + 1;
    }
}