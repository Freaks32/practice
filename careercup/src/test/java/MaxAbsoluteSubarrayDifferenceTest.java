import org.junit.Assert;
import org.junit.Test;

/**
 * Test for MaxAbsoluteSubarrayDifference Problem
 */
public class MaxAbsoluteSubarrayDifferenceTest {
    @Test
    public void maxAbsoluteSubarrayDifference() throws Exception {
        Assert.assertEquals(16, MaxAbsoluteSubarrayDifference.maxAbsoluteSubarrayDifference(
                new int[]{2, -1, -2, 1, -4, 2, 8}
        ));
        Assert.assertEquals(10, MaxAbsoluteSubarrayDifference.maxAbsoluteSubarrayDifference(
                new int[]{4, -1, 7}
        ));
        Assert.assertEquals(50, MaxAbsoluteSubarrayDifference.maxAbsoluteSubarrayDifference(
                new int[]{-5, -5, 10, 10, 10, 4, 2, 1, -1, -7, -5, 5}
        ));
    }
}