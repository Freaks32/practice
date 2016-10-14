import org.junit.Assert;
import org.junit.Test;

/**
 * Test for GuardDistance Problem
 * <p>
 * * 0 0 0
 * B G G
 * B 0 0
 * <p>
 * calculate the steps from a room to nearest Guard
 * and set the matrix, like this
 * 2 1 1
 * B G G
 * B 1 1
 */
public class GuardDistanceTest {
    // Alias here for less typing :)
    public static final int OBSTACLE = GuardDistance.OBSTACLE;
    public static final int GUARD = GuardDistance.GUARD;
    public static final int UNMARKED = GuardDistance.UNMARKED;

    @Test
    public void minGuardDistances() throws Exception {
        int[][] input = new int[][]{
                {UNMARKED, UNMARKED, UNMARKED},
                {OBSTACLE, GUARD, GUARD},
                {OBSTACLE, UNMARKED, UNMARKED}
        };
        int[][] output = new int[][]{
                {2, 1, 1},
                {OBSTACLE, GUARD, GUARD},
                {OBSTACLE, 1, 1}
        };
        Assert.assertArrayEquals(output, GuardDistance.minGuardDistances(input));
    }
}