import org.junit.Assert;
import org.junit.Test;

/**
 * Test for MaxWords Problem
 */
public class MaxWordsTest {
    private static final int[] ARRAY_1 = new int[]{3, 1, 2, 3};
    private static final int[] ARRAY_2 = new int[]{1, 2, 3, 4, 3, 2, 1, 2, 3, 4};
    private static final int[] ARRAY_3 = new int[]{5, 2, 10};
    private static final int[] ARRAY_4 = new int[]{50, 20, 30};

    @Test
    public void maxWords() throws Exception {
        Assert.assertEquals(2, MaxWords.maxWords(ARRAY_1, 4));
        Assert.assertEquals(6, MaxWords.maxWords(ARRAY_2, 12));
        Assert.assertEquals(3, MaxWords.maxWords(ARRAY_3, 1000));
        Assert.assertEquals(0, MaxWords.maxWords(ARRAY_4, 10));
    }

    @Test
    public void maxConsecutiveWords() throws Exception {
        Assert.assertEquals(2, MaxWords.maxConsecutiveWords(ARRAY_1, 4));
        Assert.assertEquals(5, MaxWords.maxConsecutiveWords(ARRAY_2, 12));
        Assert.assertEquals(3, MaxWords.maxConsecutiveWords(ARRAY_3, 1000));
        Assert.assertEquals(0, MaxWords.maxConsecutiveWords(ARRAY_4, 10));
    }

    @Test
    public void maxCharacters() throws Exception {
        Assert.assertEquals(4, MaxWords.maxCharacters(ARRAY_1, 4));
        Assert.assertEquals(12, MaxWords.maxCharacters(ARRAY_2, 12));
        Assert.assertEquals(17, MaxWords.maxCharacters(ARRAY_3, 1000));
        Assert.assertEquals(0, MaxWords.maxCharacters(ARRAY_4, 10));
    }
}