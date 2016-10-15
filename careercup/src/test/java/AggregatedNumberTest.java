import org.junit.Assert;
import org.junit.Test;

/**
 * Test for AggregatedNumber Problem
 */
public class AggregatedNumberTest {
    @Test
    public void isAggregatedNumber() throws Exception {
        Assert.assertTrue(AggregatedNumber.isAggregatedNumber("112358"));
        Assert.assertTrue(AggregatedNumber.isAggregatedNumber("122436"));
        Assert.assertTrue(AggregatedNumber.isAggregatedNumber("1299111210"));
        Assert.assertTrue(AggregatedNumber.isAggregatedNumber("112112224"));
        Assert.assertFalse(AggregatedNumber.isAggregatedNumber("112357"));
        Assert.assertFalse(AggregatedNumber.isAggregatedNumber("1123589"));
        Assert.assertFalse(AggregatedNumber.isAggregatedNumber("0101"));
        Assert.assertFalse(AggregatedNumber.isAggregatedNumber("123509"));
    }
}