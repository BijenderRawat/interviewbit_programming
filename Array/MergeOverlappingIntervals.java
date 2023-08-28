/*
 * Medium level q asked in Google, Amazon
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MergeOverlappingIntervals {
    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });
        ArrayList<Interval> ans = new ArrayList<>();
        for (Interval i : intervals) {
            if (ans.isEmpty())
                ans.add(i);
            else {
                Interval temp = ans.get(ans.size() - 1);
                if (temp.start > i.end)
                    ans.add(i);
                else if (temp.end >= i.start) {
                    ans.remove(ans.size() - 1);
                    ans.add(new Interval(Math.min(i.start, temp.start), Math.max(i.end, temp.end)));
                } else
                    ans.add(i);
            }
        }
        return ans;
    }
}