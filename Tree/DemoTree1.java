package Tree;

import java.util.*;

public class DemoTree1 {
    public static void main(String[] args) {
        // right
        TreeNode n22 = new TreeNode(7, null, null);
        TreeNode n21 = new TreeNode(5, null, null);
        TreeNode n2 = new TreeNode(5, n21, n22);

        // left
        TreeNode n1 = new TreeNode(2, null, null);

        // root
        TreeNode root = new TreeNode(2, n1, n2);

        System.out.println(findSecondMinimumValue(root));
    }

    private static int findSecondMinimumValue(TreeNode root) {
        TreeSet<Integer> set = new TreeSet<>();
        helper(root, set);
        int ans = -1, idx = 0;
        for (int i : set) {
            if (idx == 2) break;
            ans = i;
            idx++;
        }
        return set.size() == 1 ? -1 : ans;
    }

    private static void helper(TreeNode root, TreeSet<Integer> set) {
        if (root == null) return;
        set.add(root.val);
        helper(root.left, set);
        helper(root.right, set);
    }
}
