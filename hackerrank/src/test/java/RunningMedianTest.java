
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the RunningMedian Problem
 */
public class RunningMedianTest {
    @Test
    public void runningMedian() throws Exception {
        RunningMedian runningMedian = new RunningMedian();
        int[] a = new int[]{12, 4, 5, 3, 8, 7};
        double[] expectedMedian = new double[]{12.0D, 8.0D, 5.0D, 4.5D, 5.0D, 6.0D};

        for (int i = 0; i < a.length; i++) {
            runningMedian.add(a[i]);
            Assert.assertEquals(expectedMedian[i], runningMedian.runningMedian(), 0.0D);
        }
    }
}