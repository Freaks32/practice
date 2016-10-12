import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Test for SmallestRange Problem
 */
public class SmallestRangeTest {
    @Test
    public void smallestRange() throws Exception {
        List<List<Integer>> input = Arrays.asList(
                Arrays.asList(4, 10, 15, 24, 26),
                Arrays.asList(0, 9, 12, 20),
                Arrays.asList(5, 18, 22, 30)
        );

        Assert.assertEquals(new Range<>(20, 24), SmallestRange.smallestRange(input));
    }
}