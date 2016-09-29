import org.junit.Assert;
import org.junit.Test;

/**
 * Test the IsBinarySearchTree Class based on HackerRank problem
 */
public class IsBinarySearchTreeTest {
    IsBinarySearchTree isBinarySearchTree = new IsBinarySearchTree();

    private Node generateNonBSTTree() {
        Node leftLeft = new Node(1, null, null);
        Node leftRight = new Node(4, null, null);
        Node rightLeft = new Node(6, null, null);

        Node left = new Node(5, leftLeft, leftRight);
        Node right = new Node(2, rightLeft, null);

        return new Node(3, left, right);
    }

    private Node generateBSTTree() {
        Node leftLeft = new Node(1, null, null);
        Node leftRight = new Node(4, null, null);
        Node rightLeft = new Node(6, null, null);

        Node left = new Node(2, leftLeft, leftRight);
        Node right = new Node(7, rightLeft, null);

        return new Node(3, left, right);
    }

    @Test
    public void checkBST() throws Exception {
        Assert.assertFalse(isBinarySearchTree.checkBST(generateNonBSTTree()));
        Assert.assertTrue(isBinarySearchTree.checkBST(generateBSTTree()));
    }
}