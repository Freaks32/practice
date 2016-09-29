/**
 * For the purposes of this challenge, we define a binary search tree to be a binary tree
 * with the following ordering properties:
 * <p>
 * The  value of every node in a node's left subtree is less than the data value of that node.
 * The  value of every node in a node's right subtree is greater than the data value of that node.
 * Given the root node of a binary tree, can you determine if it's also a binary search tree?
 * <p>
 * Complete the function in your editor below, which has  parameter: a pointer to the root of a binary tree.
 * It must return a boolean denoting whether or not the binary tree is a binary search tree.
 * You may have to write one or more helper functions to complete this challenge.
 * <p>
 * Note: A binary tree is not a binary search if there are duplicate values.
 * <p>
 * Input Format
 * <p>
 * You are not responsible for reading any input from stdin.
 * Hidden code stubs will assemble a binary tree and pass its root node to your function as an argument.
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * You are not responsible for printing any output to stdout.
 * Your function must return true if the tree is a binary search tree; otherwise, it must return false.
 * Hidden code stubs will print this result as a Yes or No answer on a new line.
 */
public class IsBinarySearchTree {
    public boolean checkBST(Node root) {
        if (root == null) {
            return false;
        }
        return checkBSTInternal(root, null, null);
    }

    private boolean checkBSTInternal(Node root, Integer leftBound, Integer rightBound) {
        if (root == null) {
            return true;
        }

        if (leftBound != null && root.data <= leftBound) {
            return false;
        }
        if (rightBound != null && root.data >= rightBound) {
            return false;
        }
        if (!checkBSTInternal(root.left, leftBound, root.data) ||
                !checkBSTInternal(root.right, root.data, rightBound)) {
            return false;
        }
        return true;
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
