import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for CoinReversing Problem
 */
public class CoinReversingTest {
    private static final double MAX_ERROR = 1e-9;

    @Test
    public void expectedHeads() throws Exception {
        Assert.assertEquals(1.6666666666666667D,
                CoinReversing.expectedHeads(3, new int[]{2, 2}),
                MAX_ERROR);
        Assert.assertEquals(0.0D,
                CoinReversing.expectedHeads(10, new int[]{10, 10, 10}),
                MAX_ERROR);
        Assert.assertEquals(4.792639999999999D,
                CoinReversing.expectedHeads(10, new int[]{2, 7, 1, 8, 2, 8}),
                MAX_ERROR);
        Assert.assertEquals(498.1980774932278D,
                CoinReversing.expectedHeads(1000,
                        new int[]{916, 153, 357, 729, 183, 848, 61, 672, 295, 936}),
                MAX_ERROR);
    }
}