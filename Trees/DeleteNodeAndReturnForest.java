package Trees;

import java.util.*;

public class DeleteNodeAndReturnForest {
    public static TreeNode helper(TreeNode root, boolean isParent, boolean[] set, List<TreeNode> res) {
        if (root == null)
            return root;

        root.left = helper(root.left, set[root.val], set, res);
        root.right = helper(root.right, set[root.val], set, res);

        if (!set[root.val] && isParent)
            res.add(root);

        return set[root.val] ? null : root;
    }

    public static List<TreeNode> deleteAndReturn(TreeNode root, int[] to_delete) {
        boolean[] set = new boolean[1001];
        List<TreeNode> res = new ArrayList<>();

        for (int x : to_delete)
            set[x] = true;

        helper(root, true, set, res);
        return res;
    }

}
