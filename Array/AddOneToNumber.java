// Easy level q in Google, Microsoft

import java.util.ArrayList;

public class AddOneToNumber {
    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int num, carry = 1;
        for (int i = A.size() - 1; i > -1; i--) {
            num = A.get(i);
            num += carry;
            carry = 0;
            if (num == 10) {
                carry = 1;
                num = 0;
            }
            A.set(i, num);
        }
        if (carry == 1)
            res.add(1);
        for (int i : A) {
            if (i == 0 && res.size() == 0)
                continue;
            res.add(i);
        }
        return res;
    }
}