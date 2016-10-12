import org.junit.Assert;
import org.junit.Test;

/**
 * Test for MaxWords Problem
 */
public class MaxWordsTest {
    @Test
    public void maxWords() throws Exception {
        Assert.assertEquals(2, MaxWords.maxWords(new int[]{3, 1, 2, 3}, 4));
        Assert.assertEquals(6, MaxWords.maxWords(new int[]{1, 2, 3, 4, 3, 2, 1, 2, 3, 4}, 12));
        Assert.assertEquals(3, MaxWords.maxWords(new int[]{5, 2, 10}, 1000));
        Assert.assertEquals(0, MaxWords.maxWords(new int[]{50, 20, 30}, 10));
    }
}