import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Test for ValidSubstrings Problem
 */
public class ValidSubstringsTest {
    @Test
    public void getValidSubstrings() throws Exception {
        Set<String> expectedSubstrings = new HashSet<>(Arrays.asList(
                "jerky", "kyle", "jerk", "leer", "eradicate", "cat", "ate", "term", "terminal", "min"
        ));

        String[] dictionary = new String[]{
                "jerky", "kyle", "jerk", "leer", "bottle", "eradicate", "cat", "ate",
                "aid", "term", "terminal", "min", "stall", "beef", "radical", "nobody"
        };
        String input = "jerkyleeradicaterminaleer";

        Assert.assertEquals(expectedSubstrings, ValidSubstrings.getValidSubstrings(dictionary, input));
    }
}