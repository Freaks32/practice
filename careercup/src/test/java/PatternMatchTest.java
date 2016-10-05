import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Test for PatternMatch
 */
public class PatternMatchTest {
    @Test
    public void matchPattern() throws Exception {
        Assert.assertEquals(new ArrayList<>(Arrays.asList("cdf")),
                PatternMatch.matchPattern("abc", new String[]{"cdf", "too", "hgfdt", "paa"}));
        Assert.assertEquals(new ArrayList<>(Arrays.asList("too", "paa")),
                PatternMatch.matchPattern("acc", new String[]{"cdf", "too", "hgfdt", "paa"}));
    }
}