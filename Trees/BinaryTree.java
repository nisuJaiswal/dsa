package Trees;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon;

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

    // Print sum of all nodes
    public static int sumNodes(Node root) {
        if (root == null)
            return 0;

        int leftSum = sumNodes(root.left);
        int rightSum = sumNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    // Calculate height of tree
    public static int calculateHeight(Node root) {
        if (root == null)
            return 0;

        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    static class TreeInformation {
        int height;
        int diameter;

        TreeInformation(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    // Efficient Implementation
    public static TreeInformation efficientDiameter(Node root) {

        if (root == null) {
            return new TreeInformation(0, 0);
        }
        TreeInformation left = efficientDiameter(root.left);
        TreeInformation right = efficientDiameter(root.right);

        int thisHeight = Math.max(left.height, right.height) + 1;

        int diaLeft = left.diameter;
        int diaRight = right.diameter;
        int diaMid = left.height + right.height + 1;

        int thisDiam = Math.max(Math.max(diaLeft, diaRight), diaMid);

        TreeInformation myInfo = new TreeInformation(thisHeight, thisDiam);
        return myInfo;
    }

    // Diameter of Tree
    public static int maxDiameter(Node root) {
        if (root == null)
            return 0;
        int leftMax = maxDiameter(root.left);
        int rightMax = maxDiameter(root.right);
        int alongRoot = calculateHeight(root.left) + calculateHeight(root.right) + 1;

        return Math.max(Math.max(leftMax, rightMax), alongRoot);
    }

    // Driver Code
    public static void main(String[] args) {
        System.out.println();
        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        GenerateBTree tree = new GenerateBTree();
        Node root = tree.generateTree(arr);
        // System.out.println(root.data);
        // levelOrder(root);

        int nodes = maxDiameter(root);
        System.out.println(nodes);
    }
}
