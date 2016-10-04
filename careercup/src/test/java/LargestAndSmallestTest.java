import org.junit.Assert;
import org.junit.Test;

/**
 * Test for LargestAndSmallest
 */
public class LargestAndSmallestTest {
    private static int[] array1 = new int[]{2, 3, 4, 5, 6, 7, 10, 9, 8, 7};
    private static int[] array2 = new int[]{5, 10, 15, 20, 15, 2, -2, -10};
    private static int[] array3 = new int[]{-3, -2, -1, 0, -1, -2, -3};
    private static int[] array4 = new int[]{1, 100, 1};

    @Test
    public void smallest() throws Exception {
        Assert.assertEquals(2, LargestAndSmallest.smallest(array1));
        Assert.assertEquals(-10, LargestAndSmallest.smallest(array2));
        Assert.assertEquals(-3, LargestAndSmallest.smallest(array3));
        Assert.assertEquals(1, LargestAndSmallest.smallest(array4));
    }

    @Test
    public void largest() throws Exception {
        Assert.assertEquals(10, LargestAndSmallest.largest(array1));
        Assert.assertEquals(20, LargestAndSmallest.largest(array2));
        Assert.assertEquals(0, LargestAndSmallest.largest(array3));
        Assert.assertEquals(100, LargestAndSmallest.largest(array4));
    }
}