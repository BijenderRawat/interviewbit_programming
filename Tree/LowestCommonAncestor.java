package Tree;

/*
Find the lowest common ancestor in an unordered binary tree given two values in the tree.

Lowest common ancestor: the lowest common ancestor (LCA) of two nodes v and w in a tree or directed acyclic graph (DAG) is the lowest (i.e. deepest) node that has both v and w as descendants.

Note:
You are given 2 values. Find the lowest common ancestor of the two nodes represented by val1 and val2
No guarantee that val1 and val2 exist in the tree. If one value doesn't exist in the tree then return -1.
There are no duplicate values.
You can use extra memory, and helper functions, and can modify the node struct but, you can't add a parent pointer.
*/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class LowestCommonAncestor {
    public boolean checkForPresence(TreeNode A, int B) {
        if (A == null)
            return false;
        if (A.val == B)
            return true;
        return checkForPresence(A.left, B) || checkForPresence(A.right, B);
    }

    public int checklca(TreeNode A, int B, int C) {
        if (A == null)
            return -1;
        if (A.val == B || A.val == C)
            return A.val;
        int left = checklca(A.left, B, C);
        int right = checklca(A.right, B, C);
        if (left == -1)
            return right;
        if (right == -1)
            return left;
        return A.val;
    }

    public int lca(TreeNode A, int B, int C) {
        if (A == null)
            return -1;
        boolean bpresent = checkForPresence(A, B);
        boolean cpresent = checkForPresence(A, C);
        if (!bpresent || !cpresent)
            return -1;
        return checklca(A, B, C);
    }
}
