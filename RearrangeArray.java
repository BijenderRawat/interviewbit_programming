import java.util.ArrayList;

public class RearrangeArray {
    public static void arrange(ArrayList<Integer> a) {
        int[] array = new int[a.size()];
        for (int i = 0; i < array.length; i++)
            array[i] = a.get(a.get(i));
        a.clear();
        for (int i : array)
            a.add(i);
    }
}