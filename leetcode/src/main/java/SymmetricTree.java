/**
 * SymmetricTree
 * https://leetcode.com/problems/symmetric-tree/
 * <p>
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * <p>
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * <p>
 * But the following [1,2,2,null,3,null,3] is not:
 * 1
 * / \
 * 2   2
 * \   \
 * 3   3
 * <p>
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 */

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return checkSymmetric(root.left, root.right);
    }

    private boolean checkSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            // If both sides are null, they are equal
            return true;
        } else if (left != null && right != null) {
            // If nodes not equal, or children not symmetric
            if (left.val != right.val
                    || !checkSymmetric(left.left, right.right)
                    || !checkSymmetric(left.right, right.left)) {
                return false;
            } else {
                return true;
            }
        }
        // Null & Non-null node encountered
        return false;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}