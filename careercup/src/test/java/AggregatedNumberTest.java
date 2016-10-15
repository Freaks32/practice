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
    }
}