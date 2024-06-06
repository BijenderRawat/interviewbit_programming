import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

class SetIntersection {
    public static int setIntersection(ArrayList<ArrayList<Integer>> A) {
        TreeSet<Integer> leftset = new TreeSet<>();
        TreeSet<Integer> rightset = new TreeSet<>();
        TreeSet<Integer> ans = new TreeSet<>();
        for (int i = 0; i < A.size(); i++) {
            int a = A.get(i).get(0);
            int b = A.get(i).get(1);
            if (leftset.contains(a))
                leftset.remove(a);
            else
                leftset.add(a);
            if (rightset.contains(b))
                rightset.remove(b);
            else
                rightset.add(b);
        }
        Iterator<Integer> it = leftset.iterator();
        while (it.hasNext()) {
            ans.add(it.next());
        }
        it = rightset.iterator();
        while (it.hasNext()) {
            ans.add(it.next());
        }
        return ans.size();
    }
}