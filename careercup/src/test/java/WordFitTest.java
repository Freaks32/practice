import org.junit.Assert;
import org.junit.Test;

/**
 * Test for the WordFit Problem
 */
public class WordFitTest {
    @Test
    public void numberOfWords() throws Exception {
        Assert.assertEquals(5, WordFit.numberOfWords(new String[]{"Do", "Run"}, 9, 2));
        Assert.assertEquals(16, WordFit.numberOfWords(new String[]{"Jane", "Doe"}, 8, 8));
        Assert.assertEquals(10, WordFit.numberOfWords(new String[]{"asdf", "jkl", "qwerty", "to"}, 14, 4));
    }
}