package Trees;

public class FindPath {
    public static boolean getPathFromRoot(TreeNode root, int value, StringBuilder s) {
        if (root.val == value)
            return true;

        if (root.left != null && getPathFromRoot(root.left, value, s))
            s.append('L');

        if (root.right != null && getPathFromRoot(root.right, value, s))
            s.append('R');

        return s.length() > 0;
    }

    public static String getDirections(TreeNode root, int startValue, int endValue) {
        StringBuilder startPath = new StringBuilder(), destPath = new StringBuilder();

        getPathFromRoot(root, startValue, startPath);
        getPathFromRoot(root, endValue, destPath);

        startPath.reverse();
        destPath.reverse();

        int i = 0;
        int minLen = Math.min(startPath.length(), destPath.length());

        while (i < minLen && startPath.charAt(i) == destPath.charAt(i))
            i++;

        StringBuilder res = new StringBuilder();
        for (int j = i; j < startPath.length(); j++)
            res.append('U');

        res.append(destPath.substring(i));

        return res.toString();
    }
}
