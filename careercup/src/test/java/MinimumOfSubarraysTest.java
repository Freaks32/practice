import org.junit.Assert;
import org.junit.Test;

/**
 * Test for MinimumOfSubarrays Problem
 */
public class MinimumOfSubarraysTest {
    @Test
    public void minimumOfSubarrays() throws Exception {
        Assert.assertArrayEquals(new Integer[]{5, 29, 4, 2, 1, 1, 1, 1},
                MinimumOfSubarrays.minimumOfSubarrays(
                        new Integer[]{5, 50, 52, 30, 29, 4, 2, 1, 2, 2, 4}, 4));
        Assert.assertArrayEquals(new Integer[]{1, 1},
                MinimumOfSubarrays.minimumOfSubarrays(
                        new Integer[]{10, 3, 5, 1, 4, 7}, 5));
        Assert.assertArrayEquals(new Integer[]{23, 31, 31, 38},
                MinimumOfSubarrays.minimumOfSubarrays(
                        new Integer[]{23, 32, 31, 38, 40, 40, 40, 40}, 5));
    }
}