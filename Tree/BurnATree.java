package Tree;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Depth {
    int d;

    Depth(int d) {
        this.d = d;
    }
}

public class BurnATree {
    public static int ans = -1;

    public static int min_burn(Node A, int B, Depth depth) {
        if (A == null)
            return 0;
        if (A.data == B) {
            depth.d = 1;
            return 1;
        }
        Depth ld = new Depth(-1);
        Depth rd = new Depth(-1);

        int lh = min_burn(A, B, ld);
        int rh = min_burn(A, B, rd);

        if (ld.d != 1) {
            ans = Math.max(ans, ld.d + 1 + rh);
            depth.d = ld.d + 1;
        }
        if (rd.d != 1) {
            ans = Math.max(ans, rd.d + 1 + lh);
            depth.d = rd.d + 1;
        }
        return Math.max(lh, rh) + 1;
    }

    public static int solve(Node A, int B) {
        Depth d = new Depth(-1);
        min_burn(A, B, d);
        return ans;
    }
}