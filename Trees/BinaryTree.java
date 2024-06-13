package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    // Static class for Node
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Class provides method to generate binary tree from intetger array
    static class GenerateBTree {
        static int i = -1;

        public Node generateTree(int[] elements) {
            i++;
            if (elements[i] == -1)
                return null;
            Node node = new Node(elements[i]);
            node.left = generateTree(elements);
            node.right = generateTree(elements);

            return node;
        }
    }

    // Pre Order traversal for tree
    public static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Post Order traversal for tree
    public static void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // In Order Traversal for a tree
    public static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    // Level Order Print (Breadth First Search)
    public static void levelOrder(Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node curr = queue.remove();

            if (curr == null) {

                System.out.println();
                if (queue.isEmpty())
                    break;
                else
                    queue.add(null);
            } else {

                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
    }

    // Count Number of Nodes
    public static int countNode(Node root) {

        if (root == null)
            return 0;
        int leftCount = countNode(root.left);
        int rightCount = countNode(root.right);

        return leftCount + rightCount + 1;
    }

    // Driver Code
    public static void main(String[] args) {
        System.out.println();
        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        GenerateBTree tree = new GenerateBTree();
        Node root = tree.generateTree(arr);
        // System.out.println(root.data);
        // levelOrder(root);

        int nodes = countNode(root);
        System.out.println(nodes);
    }
}
