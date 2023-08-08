import java.util.ArrayList;

public class AddNToNumber {

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A, int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int num;
        int carry = n;
        for (int i = A.size() - 1; i > -1; i--) {
            int temp = A.get(i) + carry;
            carry = 0;
            num = temp % 10;
            carry = temp / 10;
            A.set(i, num);
        }
        if (carry >= 1)
            ans.add(1);
        for (int i : A) {
            if (i == 0 && ans.size() == 0)
                continue;
            ans.add(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(9);
        A.add(9);
        A.add(9);
        for (int i : plusOne(A, 1))
            System.out.print(i + " ");
    }
}
