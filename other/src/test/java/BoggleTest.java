import org.junit.Assert;
import org.junit.Test;

/**
 * Test the Boggle Problem (Find words in a given Boggle Board)
 */
public class BoggleTest {
    private static final char[][] BOGGLE_BOARD = new char[][]{
            {'S', 'M', 'E', 'F'},
            {'R', 'A', 'T', 'D'},
            {'L', 'O', 'N', 'I'},
            {'K', 'A', 'F', 'B'}
    };
    private static final Boggle BOGGLE = new Boggle(BOGGLE_BOARD);

    @Test
    public void wordsPresent() throws Exception {
        String[] inputWords = new String[]{"STAR", "TONE", "NOTE", "SAND"};
        String[] expectedWords = new String[]{"NOTE", "SAND"};
        Assert.assertArrayEquals(expectedWords, BOGGLE.wordsPresent(expectedWords));
    }

    @Test
    public void wordPresent() throws Exception {
        String[] inputWords = new String[]{"STAR", "TONE", "NOTE", "SAND"};
        Assert.assertFalse(BOGGLE.wordPresent("STAR"));
        Assert.assertFalse(BOGGLE.wordPresent("TONE"));
        Assert.assertTrue(BOGGLE.wordPresent("NOTE"));
        Assert.assertTrue(BOGGLE.wordPresent("SAND"));
    }
}