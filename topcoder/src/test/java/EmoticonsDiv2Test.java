import org.junit.Assert;
import org.junit.Test;

/**
 * Test for EmoticonsDiv2 Problem
 */
public class EmoticonsDiv2Test {
    @Test
    public void printSmiles() throws Exception {
        Assert.assertEquals(2, EmoticonsDiv2.printSmiles(2));
        Assert.assertEquals(5, EmoticonsDiv2.printSmiles(6));
        Assert.assertEquals(11, EmoticonsDiv2.printSmiles(11));
        Assert.assertEquals(8, EmoticonsDiv2.printSmiles(16));
        Assert.assertEquals(21, EmoticonsDiv2.printSmiles(1000));
    }
}