import org.junit.Assert;
import org.junit.Test;

/**
 * Test for ShorterSuperSum Problem from TopCoder
 */
public class ShorterSuperSumTest {
    ShorterSuperSum shorterSuperSum = new ShorterSuperSum();

    @Test
    public void calculate() throws Exception {
        Assert.assertEquals(6, shorterSuperSum.calculate(1, 3));
        Assert.assertEquals(10, shorterSuperSum.calculate(2, 3));
        Assert.assertEquals(2002, shorterSuperSum.calculate(4, 10));
        Assert.assertEquals(167960, shorterSuperSum.calculate(10, 10));
    }
}