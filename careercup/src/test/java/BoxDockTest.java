import org.junit.Assert;
import org.junit.Test;

/**
 * Test for BoxDock Problem
 */
public class BoxDockTest {
    @Test
    public void sortBoxes() throws Exception {
        Assert.assertEquals(3, BoxDock.sortBoxes(new int[]{0, 3, 2, 1}));
        Assert.assertEquals(6, BoxDock.sortBoxes(new int[]{3, 2, 1, 0}));
    }
}