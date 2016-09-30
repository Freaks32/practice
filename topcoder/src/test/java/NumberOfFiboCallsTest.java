import org.junit.Assert;
import org.junit.Test;

/**
 * Test for NumberOfFiboCalls Problem
 */
public class NumberOfFiboCallsTest {
    NumberOfFiboCalls numberOfFiboCalls = new NumberOfFiboCalls();

    @Test
    public void fiboCallsMade() throws Exception {
        Assert.assertArrayEquals(new int[]{1, 0}, numberOfFiboCalls.fiboCallsMade(0));
        Assert.assertArrayEquals(new int[]{1, 2}, numberOfFiboCalls.fiboCallsMade(3));
        Assert.assertArrayEquals(new int[]{5, 8}, numberOfFiboCalls.fiboCallsMade(6));
        Assert.assertArrayEquals(new int[]{10946, 17711}, numberOfFiboCalls.fiboCallsMade(22));
    }
}