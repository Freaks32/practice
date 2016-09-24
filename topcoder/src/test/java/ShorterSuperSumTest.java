import org.junit.Assert;
import org.junit.Test;

/**
 * Test for ShorterSuperSum Problem from TopCoder
 */
public class ShorterSuperSumTest {
    @Test
    public void calculate() throws Exception {
        Assert.assertEquals(6, ShorterSuperSum.calculate(1, 3));
        Assert.assertEquals(10, ShorterSuperSum.calculate(2, 3));
        Assert.assertEquals(2002, ShorterSuperSum.calculate(4, 10));
        Assert.assertEquals(167960, ShorterSuperSum.calculate(10, 10));
    }
}