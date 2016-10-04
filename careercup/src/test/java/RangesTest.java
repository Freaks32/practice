import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Test for Ranges Problem
 */
public class RangesTest {
    @Test
    public void getRanges() throws Exception {
        List<ImmutableRange> shards = new ArrayList<>(Arrays.asList(
                new ImmutableRange(1, 9),
                new ImmutableRange(12, 59),
                new ImmutableRange(100, 999)
        ));
        List<ImmutableRange> keys = new ArrayList<>(Arrays.asList(
                new ImmutableRange(2, 3),
                new ImmutableRange(6, 8),
                new ImmutableRange(11, 20),
                new ImmutableRange(200, 220)
        ));
        List<ImmutableRange> expectedRanges = new ArrayList<>(Arrays.asList(
                new ImmutableRange(2, 8),
                new ImmutableRange(12, 20),
                new ImmutableRange(200, 220)
        ));

        Assert.assertEquals(expectedRanges, Ranges.getRanges(shards, keys));
    }
}