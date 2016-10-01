import org.junit.Assert;
import org.junit.Test;

/**
 * Test for NumbersChallenge Problem
 */
public class NumbersChallengeTest {
    @Test
    public void minNumber() throws Exception {
        Assert.assertEquals(4, NumbersChallenge.minNumber(new int[]{5, 1, 2}));
        Assert.assertEquals(8, NumbersChallenge.minNumber(new int[]{2, 1, 4}));
        Assert.assertEquals(6, NumbersChallenge.minNumber(new int[]{2, 1, 2, 7}));
        Assert.assertEquals(1092, NumbersChallenge.minNumber(new int[]
                {94512, 2, 87654, 81316, 6, 5, 6, 37151, 6, 139, 1, 36, 307, 1, 377, 101, 8, 37, 58, 1}));
        Assert.assertEquals(56523, NumbersChallenge.minNumber(new int[]
                {883, 66392, 3531, 28257, 1, 14131, 57, 1, 25, 88474, 4, 1, 110, 6, 1769, 220, 442, 7064, 7, 13}));
    }
}