import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the SpanningNode Class for MinimumSpanningSet
 */
public class SpanningNodeTest {

    /*-
              __5__
             /     \
            2       9
           / \     / \
          1   4   5   11
     */
    private SpanningNode<Integer> buildTestTree() {
        SpanningNode<Integer> root = new SpanningNode<>(5, 5);
        SpanningNode<Integer> left = new SpanningNode<>(2, 2);
        SpanningNode<Integer> leftLeft = new SpanningNode<>(1, 1);
        SpanningNode<Integer> leftRight = new SpanningNode<>(4, 4);
        SpanningNode<Integer> right = new SpanningNode<>(9, 9);
        SpanningNode<Integer> rightLeft = new SpanningNode<>(5, 5);
        SpanningNode<Integer> rightRight = new SpanningNode<>(11, 11);

        root.leftChild = left;
        left.parent = root;

        root.rightChild = right;
        right.parent = root;

        left.leftChild = leftLeft;
        leftLeft.parent = left;

        left.rightChild = leftRight;
        leftRight.parent = left;

        right.leftChild = rightLeft;
        rightLeft.parent = right;

        right.rightChild = rightRight;
        rightRight.parent = right;

        return root;
    }

    @Test
    public void addNode() throws Exception {
        SpanningNode<Integer> root = new SpanningNode<>(5, 5);
        root.addNode(new Tuple<>(2, 2));
        Assert.assertNotNull(root.leftChild);
        Assert.assertNotNull(root.leftChild.parent);
        Assert.assertEquals(2, (int) root.leftChild.left);
        Assert.assertEquals(root, root.leftChild.parent);

        root.addNode(new Tuple<>(4, 4));
        Assert.assertNotNull(root.leftChild.rightChild);
        Assert.assertNotNull(root.leftChild.rightChild.parent);
        Assert.assertEquals(4, (int) root.leftChild.rightChild.left);
        Assert.assertEquals(root.leftChild, root.leftChild.rightChild.parent);
    }

    @Test
    public void firstInSubTree() throws Exception {
        SpanningNode<Integer> root = buildTestTree();

        Assert.assertEquals(root.leftChild.leftChild, root.firstInSubTree());
        Assert.assertEquals(root.rightChild.leftChild, root.rightChild.firstInSubTree());
        Assert.assertEquals(root.leftChild.rightChild, root.leftChild.rightChild.firstInSubTree());
    }

    @Test
    public void successor() throws Exception {
        SpanningNode<Integer> root = buildTestTree();

        Assert.assertEquals(root.leftChild.rightChild, root.leftChild.successor());
        Assert.assertEquals(root.rightChild.leftChild, root.successor());
        Assert.assertEquals(root.rightChild, root.rightChild.leftChild.successor());
        Assert.assertEquals(root, root.leftChild.rightChild.successor());
        Assert.assertEquals(null, root.rightChild.rightChild.successor());
    }

}