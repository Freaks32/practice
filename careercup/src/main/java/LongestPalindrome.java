import java.util.HashMap;
import java.util.Map;

/**
 * Longest Panindrome
 * https://careercup.com/question?id=5631060781039616
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
 */
public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        Map<Character, Integer> characterCount = new HashMap<>();
        char[] characters = s.toCharArray();

        for (char c : characters) {
            if (!characterCount.containsKey(c)) {
                characterCount.put(c, 1);
            } else {
                characterCount.put(c, characterCount.get(c) + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        Character oddCharacter = null;
        for (Character c : characterCount.keySet()) {
            Integer count = characterCount.get(c);
            if (count % 2 != 0) {
                oddCharacter = c;
            }
            for (int i = 0; i < count / 2; i++) {
                sb.append(c);
            }
        }

        String firstHalf = sb.toString();
        if (oddCharacter != null) {
            sb.append(oddCharacter);
        }

        for (int i = firstHalf.length() - 1; i >= 0; i--) {
            sb.append(firstHalf.charAt(i));
        }

        return sb.toString();
    }
}
