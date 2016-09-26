import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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
        bst.add(6);

        List<List<Integer>> expectedResult = Arrays.asList(
                Arrays.asList(5, 1, 8, 6),
                Arrays.asList(5, 8, 1, 6),
                Arrays.asList(5, 8, 6, 1)
        );

        Assert.assertEquals(expectedResult, BinaryTreeLists.getPossibleLists(bst));
    }
}