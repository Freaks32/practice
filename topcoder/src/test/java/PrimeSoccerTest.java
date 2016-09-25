import org.junit.Assert;
import org.junit.Test;

/**
 * Test for PrimeSoccer Problem from TopCoder
 */
public class PrimeSoccerTest {
    private static double MAX_ERROR = 1e-9;

    PrimeSoccer primeSoccer = new PrimeSoccer();

    @Test
    public void getProbability() throws Exception {
        Assert.assertEquals(0.5265618908306351D, primeSoccer.getProbability(50, 50), MAX_ERROR);
        Assert.assertEquals(0.0D, primeSoccer.getProbability(100, 100), MAX_ERROR);
        Assert.assertEquals(0.6772047168840167D, primeSoccer.getProbability(12, 89), MAX_ERROR);
    }
}