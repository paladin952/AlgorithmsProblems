package trees;

/**
 * Return the length of the longest zig zag traversal of a binary tree
 * <p>
 * <p>
 * 5
 * /    \
 * 3       10
 * /      /    \
 * 20     1      15
 * /            /    \
 * 6           30      8
 * \
 * 9
 * <p>
 * Longest zigzag traversal would be 5, 10, 15, 30, 9 with the length of 5;
 */
public class LongestBinaryTreeZigZagTraversal {

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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
//        root.left.left = new TreeNode(20);
//        root.left.left.left = new TreeNode(6);

        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(3);
        root.left.right.left.right = new TreeNode(3);
        root.left.right.left.right.left = new TreeNode(3);
        root.left.right.left.right.left.right = new TreeNode(3);
        root.left.right.left.right.left.right.left = new TreeNode(3);
        root.left.right.left.right.left.right.left.right = new TreeNode(3);
        root.left.right.left.right.left.right.left.right.left = new TreeNode(3);
        root.left.right.left.right.left.right.left.right.left.right = new TreeNode(3);
        root.left.right.left.right.left.right.left.right.left.right.left = new TreeNode(3);
        root.left.right.left.right.left.right.left.right.left.right.left.right = new TreeNode(3);
        root.left.right.left.right.left.right.left.right.left.right.left.right.left = new TreeNode(3);
        root.left.right.left.right.left.right.left.right.left.right.left.right.left.right = new TreeNode(3);
        root.left.right.left.right.left.right.left.right.left.right.left.right.left.right.left = new TreeNode(3);
        root.left.right.left.right.left.right.left.right.left.right.left.right.left.right.left.right = new TreeNode(3);
        root.left.right.left.right.left.right.left.right.left.right.left.right.left.right.left.right.left = new TreeNode(3);
        root.left.right.left.right.left.right.left.right.left.right.left.right.left.right.left.right.left.right = new TreeNode(3);
        root.left.right.left.right.left.right.left.right.left.right.left.right.left.right.left.right.left.right.left = new TreeNode(3);

        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(3);
        root.left.right.left.right = new TreeNode(3);
        root.left.right.left.right.left = new TreeNode(3);
        root.left.right.left.right.left.right = new TreeNode(3);
        root.left.right.left.right.left.right.left = new TreeNode(3);
//        root.left.right.left.right.left.right.left.right = new TreeNode(3);
//        root.left.right.left.right.left.right.left.right.left = new TreeNode(3);
//        root.left.right.left.right.left.right.left.right.left.right = new TreeNode(3);
//        root.left.right.left.right.left.right.left.right.left.right.left = new TreeNode(3);


        root.right = new TreeNode(10);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(15);
        root.right.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(30);
        root.right.right.left.right = new TreeNode(9);
        root.right.right.left.right.left = new TreeNode(9);
        root.right.right.left.right.left.right = new TreeNode(9);
        root.right.right.left.right.left.right.left = new TreeNode(9);
        root.right.right.left.right.left.right.left.right = new TreeNode(9);
        root.right.right.left.right.left.right.left.right.left = new TreeNode(9);
        root.right.right.left.right.left.right.left.right.left.right = new TreeNode(9);

        System.out.println(longest(root, 0) - 1);
    }

    public static int longest(TreeNode source, int max) {
        if (source == null) {
            return 0;
        }

        int rh = count(source.right, true, 0);
        int lh = count(source.left, true, 0);

        max = Math.max(lh, rh);
        max = Math.max(max, longest(source.left, max));
        max = Math.max(max, longest(source.right, max));

        return max;
    }


    public static int count(TreeNode root, boolean moveRight, int counter) {
        if (root == null) {
            return counter;
        }

        if (moveRight) {
            counter = count(root.right, false, root.right == null ? counter : counter + 1);
        } else {
            counter = count(root.left, true, root.left == null ? counter : counter + 1);
        }

        return counter;
    }

}
