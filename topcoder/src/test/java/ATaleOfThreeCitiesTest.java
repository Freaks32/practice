import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for ATaleOfThreeCities problem from TopCoder
 *
 * @author bbamsch
 */
public class ATaleOfThreeCitiesTest {
    private static final double DELTA = 1e-9;

    @Test
    public void connect() throws Exception {
        Assert.assertEquals(3.414213562373095D, ATaleOfThreeCities.connect(
                new int[]{0, 0, 0},
                new int[]{0, 1, 2},
                new int[]{2, 3},
                new int[]{1, 1},
                new int[]{1, 5},
                new int[]{3, 28}
        ), DELTA);

        Assert.assertEquals(2.0D, ATaleOfThreeCities.connect(
                new int[]{-2, -1, 0, 1, 2},
                new int[]{0, 0, 0, 0, 0},
                new int[]{-2, -1, 0, 1, 2},
                new int[]{1, 1, 1, 1, 1},
                new int[]{-2, -1, 0, 1, 2},
                new int[]{2, 2, 2, 2, 2}
        ), DELTA);

        Assert.assertEquals(50.323397776611024D, ATaleOfThreeCities.connect(
                new int[]{4, 5, 11, 21, 8, 10, 3, 9, 5, 6},
                new int[]{12, 8, 9, 12, 2, 3, 5, 7, 10, 13},
                new int[]{34, 35, 36, 41, 32, 39, 41, 37, 39, 50},
                new int[]{51, 33, 41, 45, 48, 22, 33, 51, 41, 40},
                new int[]{86, 75, 78, 81, 89, 77, 83, 88, 99, 77},
                new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
        ), DELTA);
    }
}