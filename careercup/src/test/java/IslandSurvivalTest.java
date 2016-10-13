import org.junit.Assert;
import org.junit.Test;

/**
 * Test for IslandSurvivalProblem
 */
public class IslandSurvivalTest {
    private static final double MAX_ERROR = 1e-9;

    @Test
    public void probabilityAlive() throws Exception {
        Assert.assertEquals(0D, IslandSurvival.probabilityAlive(0, 0, 1), MAX_ERROR);
        Assert.assertEquals(0.25D, IslandSurvival.probabilityAlive(0, 0, 2), MAX_ERROR);
        Assert.assertEquals(0.5D, IslandSurvival.probabilityAlive(1, 1, 3), MAX_ERROR);
        Assert.assertEquals(0.375D, IslandSurvival.probabilityAlive(1, 0, 3), MAX_ERROR);
        Assert.assertEquals(0.25D, IslandSurvival.probabilityAlive(0, 0, 3), MAX_ERROR);
    }
}