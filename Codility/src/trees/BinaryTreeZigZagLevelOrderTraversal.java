package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * # Time:  O(n)
 * # Space: O(n)
 * #
 * # Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
 * #
 * # For example:
 * # Given binary tree {3,9,20,#,#,15,7},
 * #     3
 * #    / \
 * #   9  20
 * #     /  \
 * #    15   7
 * # return its zigzag level order traversal as:
 * # [
 * #   [3],
 * #   [20,9],
 * #   [15,7]
 * # ]
 * #
 */
public class BinaryTreeZigZagLevelOrderTraversal {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }

    public static List<TreeNode> zigZagLevelTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        int level = 1;
        List<TreeNode> result = new ArrayList<>();
        List<TreeNode> currentLevel = new ArrayList<>();
        currentLevel.add(root);

        while (!currentLevel.isEmpty()) {
            List<TreeNode> nextLevel = new ArrayList<>();
            for (TreeNode treeNode : currentLevel) {
                if (treeNode.left != null) {
                    nextLevel.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    nextLevel.add(treeNode.right);
                }
            }

            if (level % 2 == 1) {
                result.addAll(currentLevel);
            } else {
                Collections.reverse(currentLevel);
                result.addAll(currentLevel);
            }

            currentLevel = nextLevel;
            level++;
        }

        return result;
    }

    private static void printList(List list) {
        for (Object o : list) {
            System.out.print(o.toString() + " ");
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<TreeNode> res = zigZagLevelTraversal(root);
        printList(res);
    }

}
