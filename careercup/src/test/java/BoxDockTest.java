import org.junit.Assert;
import org.junit.Test;

/**
 * Test for BoxDock Problem
 */
public class BoxDockTest {
    @Test
    public void sortBoxes() throws Exception {
        Assert.assertEquals(3, BoxDock.sortBoxes(new int[]{1, 4, 3, 2}));
        Assert.assertEquals(6, BoxDock.sortBoxes(new int[]{4, 3, 2, 1}));
    }
}