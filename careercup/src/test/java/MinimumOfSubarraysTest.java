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
    }
}