import org.junit.Assert;
import org.junit.Test;

/**
 * Tests FastestVictory from BuffingPixie using the provided examples
 *
 * @author bbamsch
 */
public class BuffingPixieTest {
    @Test
    public void fastestVictory() throws Exception {
        Assert.assertEquals(4, BuffingPixie.fastestVictory(5, 1, 3));
        Assert.assertEquals(1, BuffingPixie.fastestVictory(10, 20, 50));
        Assert.assertEquals(10, BuffingPixie.fastestVictory(24, 2, 5));
        Assert.assertEquals(13, BuffingPixie.fastestVictory(497, 40, 45));
        Assert.assertEquals(3360, BuffingPixie.fastestVictory(8400, 1, 5));
        Assert.assertEquals(5, BuffingPixie.fastestVictory(10, 2, 1));
    }

}