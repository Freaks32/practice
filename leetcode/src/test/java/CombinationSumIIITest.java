import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Test for CombinationSumIII Problem
 */
public class CombinationSumIIITest {
    CombinationSumIII combinationSumIII = new CombinationSumIII();

    @Test
    public void combinationSum3() throws Exception {
        List<List<Integer>> expectedOutput = Collections.singletonList(Arrays.asList(1, 2, 4));
        Assert.assertEquals(expectedOutput, combinationSumIII.combinationSum3(3, 7));

        expectedOutput = Arrays.asList(
                Arrays.asList(1, 2, 6),
                Arrays.asList(1, 3, 5),
                Arrays.asList(2, 3, 4)
        );
        Assert.assertEquals(expectedOutput, combinationSumIII.combinationSum3(3, 9));
    }
}