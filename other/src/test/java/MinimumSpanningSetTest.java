import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Tests the MinimumSpanningSet Problem
 */
public class MinimumSpanningSetTest {
    @Test
    public void minimumSpanningSet() throws Exception {
        List<Tuple<Integer>> input = Arrays.asList(new Tuple<>(0, 4), new Tuple<>(5, 6), new Tuple<>(4, 5), new Tuple<>(7, 10));
        List<Tuple<Integer>> expectedOutput = Arrays.asList(new Tuple<>(0, 6), new Tuple<>(7, 10));

        List<Tuple<Integer>> output = MinimumSpanningSet.minimumSpanningSet(input);
        Assert.assertEquals(expectedOutput, output);
    }
}