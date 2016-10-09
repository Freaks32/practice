import org.junit.Assert;
import org.junit.Test;

/**
 * Test for ProductMinusOne Problem
 */
public class ProductMinusOneTest {
    @Test
    public void productMinusOne() throws Exception {
        long[] array = new long[]{2L, 3L, 1L, 4L, 3L, 2L};
        Assert.assertEquals(72, ProductMinusOne.productMinusOne(array, 0));
        Assert.assertEquals(48, ProductMinusOne.productMinusOne(array, 1));
        Assert.assertEquals(144, ProductMinusOne.productMinusOne(array, 2));
        Assert.assertEquals(36, ProductMinusOne.productMinusOne(array, 3));
        Assert.assertEquals(48, ProductMinusOne.productMinusOne(array, 4));
        Assert.assertEquals(72, ProductMinusOne.productMinusOne(array, 5));
    }
}