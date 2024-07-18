package Trees;

public class NoOfGoodLeafs {
    static int count = 0;

    public static int[] dfs(TreeNode root, int distance) {
        if (root == null)
            return new int[11];

        if (root.left == null && root.right == null) {
            int[] res = new int[11];
            res[1] = 1;
            return res;
        }

        int[] left = dfs(root.left, distance);
        int[] right = dfs(root.right, distance);

        for (int i = 1; i <= distance; i++) {
            for (int j = 1; j <= distance; j++) {
                count += left[i] * right[j];
            }
        }

        int[] res = new int[11];

        for (int i = 1; i < 10; i++) {
            res[i + 1] = left[i] + right[i];
        }

        return res;
    }

    public static int getGoodLeafs(TreeNode root, int distance) {
        dfs(root, distance);
        return count;
    }
}
