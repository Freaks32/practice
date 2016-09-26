import org.junit.Test;

/**
 * Tests for the BinaryTreeLists problem
 */
public class BinaryTreeListsTest {
    @Test
    public void getPossibleLists() throws Exception {
        BST<Integer> bst = new BST<>();
        bst.add(5);
        bst.add(1);
        bst.add(8);
        bst.add(7);
        bst.add(6);
        bst.add(10);

        BinaryTreeLists.getPossibleLists(bst);
    }
}