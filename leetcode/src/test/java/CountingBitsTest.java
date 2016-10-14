import org.junit.Assert;
import org.junit.Test;

/**
 * Test for CountingBits Problem
 */
public class CountingBitsTest {
    CountingBits countingBits = new CountingBits();

    @Test
    public void countBits() throws Exception {
        Assert.assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2},
                countingBits.countBits(5));
        Assert.assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2},
                countingBits.countBits(10));
    }
}