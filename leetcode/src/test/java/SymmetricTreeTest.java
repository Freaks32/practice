import org.junit.Assert;
import org.junit.Test;

/**
 * Test for SymmetricTree Problem
 */
public class SymmetricTreeTest {
    SymmetricTree symmetricTree = new SymmetricTree();

    @Test
    public void isSymmetric() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        Assert.assertTrue(symmetricTree.isSymmetric(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        Assert.assertFalse(symmetricTree.isSymmetric(root));
    }
}