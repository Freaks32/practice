import java.util.*;

/**
 * https://careercup.com/question?id=5704645247762432
 * <p>
 * Given a Pattern and a dictionary, print out all the strings that match the pattern.
 * where a character in the pattern is mapped uniquely to a character in the dictionary ( this is what i was given first).
 * <p>
 * e.g 1. ("abc" , <"cdf", "too", "hgfdt" ,"paa">) -> output = "cdf"
 * 2. ("acc" , <"cdf", "too", "hgfdt" ,"paa">) -> output = "too", "paa"
 */
public class PatternMatch {
    public static List<String> matchPattern(String pattern, String[] strings) {
        List<String> output = new ArrayList<>();
        char[] pat = pattern.toCharArray();

        for (String string : strings) {
            Map<Character, Character> mapping = new HashMap<>();
            Set<Character> mappedOutputs = new HashSet<>();

            char[] characters = string.toCharArray();
            boolean match = true;

            if (characters.length != pat.length) {
                continue;
            }

            for (int i = 0; i < pat.length && match; i++) {
                char p = pat[i];
                char c = characters[i];

                if (mapping.containsKey(p)) {
                    if (!mapping.get(p).equals(c)) {
                        // Current pattern to string mapping not met
                        match = false;
                    }
                } else {
                    if (mappedOutputs.contains(c)) {
                        // Character in the output string is already mapped to another input character
                        match = false;
                    } else {
                        // New mapping, add it
                        mapping.put(p, c);
                        mappedOutputs.add(c);
                    }
                }
            }

            if (match) {
                output.add(string);
            }
        }
        
        return output;
    }
}
