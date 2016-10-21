import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Test for SortColors Problem
 */
public class SortColorsTest {
    SortColors sortColors = new SortColors();

    @Test
    public void sortColors() throws Exception {
        int[] colorsIn = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2};
        int[] colorsOut = Arrays.copyOf(colorsIn, colorsIn.length);

        sortColors.sortColors(colorsIn);
        Assert.assertArrayEquals(colorsOut, colorsIn);

        colorsIn = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1};
        colorsOut = new int[]{1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        sortColors.sortColors(colorsIn);
        Assert.assertArrayEquals(colorsOut, colorsIn);

        colorsIn = new int[]{0, 0, 1, 1, 1, 2, 2, 0, 1, 2, 0, 2, 0, 1, 2};
        colorsOut = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2};

        sortColors.sortColors(colorsIn);
        Assert.assertArrayEquals(colorsOut, colorsIn);
    }
}