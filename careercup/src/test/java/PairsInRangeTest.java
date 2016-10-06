import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Brian on 10/5/2016.
 */
public class PairsInRangeTest {
    @Test
    public void pairsInRange() throws Exception {
        Set<Pair<Integer>> expectedOutput = new HashSet<>(Arrays.asList(
                new Pair<>(8, 10),
                new Pair<>(9, 9),
                new Pair<>(10, 8),
                new Pair<>(9, 10),
                new Pair<>(10, 9)
        ));
        Assert.assertEquals(expectedOutput, PairsInRange.pairsInRange(
                new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 10}, 18, 19));
    }
}