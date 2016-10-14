import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Test for SpiralMatrix Problem
 */
public class SpiralMatrixTest {
    SpiralMatrix spiralMatrix = new SpiralMatrix();

    @Test
    public void spiralOrder() throws Exception {
        int[][] input = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> output = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        Assert.assertEquals(output, spiralMatrix.spiralOrder(input));
    }
}