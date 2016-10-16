import org.junit.Assert;
import org.junit.Test;

/**
 * Test for MaxPossibleN Problem
 */
public class MaxPossibleNTest {
    @Test
    public void maxPossibleN() throws Exception {
        int[] input = new int[]{1, 2, 3, 4};
        Assert.assertEquals(2, MaxPossibleN.maxPossibleN(input));

        input = new int[]{900, 2, 9001, 3, 1000};
        Assert.assertEquals(3, MaxPossibleN.maxPossibleN(input));
    }
}