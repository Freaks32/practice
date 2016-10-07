import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Test for LongestPalindrome Problem
 * <p>
 * Given a string return the longest palindrome that can be constructed by removing or shuffling characters.
 * <p>
 * Example:
 * 'aha' -> 'aha'
 * 'ttaatta' -> ' ttaaatt'
 * 'abc' -> 'a' or 'b' or 'c'
 * 'gggaaa' -> 'gaaag' or 'aggga'
 * <p>
 * Note if there are multiple correct answers you only need to return 1 palindrome.
 * <p>
 * - enkadi13 July 22, 2016 in United States | Report Duplicate | Flag
 * Google Software Engineer Algorithm
 */
public class LongestPalindromeTest {
    @Test
    public void longestPalindrome() throws Exception {
        Assert.assertEquals("aha", LongestPalindrome.longestPalindrome("aha"));
        Assert.assertEquals("ttaaatt", LongestPalindrome.longestPalindrome("ttaatta"));
        Set<String> outputSet = new HashSet<>(Arrays.asList("a", "b", "c"));
        Assert.assertTrue(outputSet.contains(LongestPalindrome.longestPalindrome("abc")));
        outputSet = new HashSet<>(Arrays.asList("gaaag", "aggga"));
        Assert.assertTrue(outputSet.contains(LongestPalindrome.longestPalindrome("gggaaa")));
    }
}