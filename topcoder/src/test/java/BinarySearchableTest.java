import org.junit.Assert;
import org.junit.Test;

/**
 * Test for the BinarySearchable Problem
 */
public class BinarySearchableTest {
    @Test
    public void howMany() throws Exception {
        Assert.assertEquals(1, BinarySearchable.howMany(new int[]{1, 3, 2}));
        Assert.assertEquals(1, BinarySearchable.howMany(new int[]{3, 2, 1, 10, 23, 22, 21}));
        Assert.assertEquals(6, BinarySearchable.howMany(new int[]{1, 5, 7, 11, 12, 18}));
        Assert.assertEquals(0, BinarySearchable.howMany(new int[]{5, 4, 3, 2, 1, 0}));
        Assert.assertEquals(4, BinarySearchable.howMany(new int[]{1, 3, 2, 4, 5, 7, 6, 8}));
    }
}