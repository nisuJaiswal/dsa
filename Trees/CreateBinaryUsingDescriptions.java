package Trees;

import java.util.*;

public class CreateBinaryUsingDescriptions {
    public static TreeNode createTree(int[][] descriptions) {
        TreeNode root = new TreeNode();
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> hasParent = new HashSet<>();

        for (int[] d : descriptions) {
            if (!map.containsKey(d[0]))
                map.put(d[0], new TreeNode(d[0]));

            if (!map.containsKey(d[1]))
                map.put(d[1], new TreeNode(d[1]));

            hasParent.add(d[1]);
        }

        for (int[] d : descriptions) {
            if (d[2] == 1) {
                map.get(d[0]).left = map.get(d[1]);
            } else {
                map.get(d[0]).right = map.get(d[1]);
            }

            if (!hasParent.contains(d[0]))
                root = map.get(d[0]);
        }
        return root;
    }
}
