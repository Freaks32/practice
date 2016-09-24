import org.junit.Assert;
import org.junit.Test;

/**
 * Test for ColorfulRoad Problem from TopCoder
 */
public class ColorfulRoadTest {
    @Test
    public void getMin() throws Exception {
        Assert.assertEquals(8, ColorfulRoad.getMin("RGGGB"));
        Assert.assertEquals(8, ColorfulRoad.getMin("RGBRGBRGB"));
        Assert.assertEquals(-1, ColorfulRoad.getMin("RBBGGGRR"));
        Assert.assertEquals(50, ColorfulRoad.getMin("RBRRBGGGBBBBR"));
        Assert.assertEquals(1, ColorfulRoad.getMin("RG"));
        Assert.assertEquals(52, ColorfulRoad.getMin("RBRGBGBGGBGRGGG"));
    }
}