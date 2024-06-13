package Trees;

//  * Definition for a binary tree node.

public class SubTreeOfAnotherTree {
    public boolean isSame(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null)
            return true;

        if (root == null || subRoot == null)
            return false;

        if (root.val == subRoot.val) {
            return (isSame(root.left, subRoot.left) && isSame(root.right, subRoot.right));
        }

        return false;
    }

    public boolean isSubTree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null)
            return true;
        if (root == null)
            return false;

        if (subRoot.val == root.val) {
            if (isSame(root, subRoot))
                return true;
        }

        return (isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot));
    }

    public static void main(String[] args) {

    }
}
