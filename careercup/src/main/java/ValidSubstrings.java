import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * ValidSubstrings
 * <p>
 * Given a dictionary and a string, find all the substrings that are valid words in dictionary.
 */
public class ValidSubstrings {
    public static Set<String> getValidSubstrings(String[] dictionary, String input) {
        Set<String> output = new HashSet<>();
        Trie wordLookup = new Trie();

        int maxLength = -1;
        for (String word : dictionary) {
            wordLookup.add(word);
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length() && j - i <= maxLength; j++) {
                String word = input.substring(i, j);
                if (wordLookup.contains(word)) {
                    output.add(word);
                }
            }
        }

        return output;
    }
}

class Trie {
    TrieNode root = new TrieNode();

    boolean contains(String s) {
        return root.contains(s, 0);
    }

    void add(String s) {
        root.add(s, 0);
    }

    private static class TrieNode {
        boolean isEndpoint = false;
        Map<Character, TrieNode> children = new HashMap<>();

        boolean contains(String s, int index) {
            if (index >= s.length()) {
                return isEndpoint;
            } else {
                char c = s.charAt(index);
                if (children.containsKey(c)) {
                    return children.get(c).contains(s, index + 1);
                }
                return false;
            }
        }

        void add(String s, int index) {
            if (index >= s.length()) {
                isEndpoint = true;
            } else {
                char c = s.charAt(index);
                if (!children.containsKey(c)) {
                    children.put(c, new TrieNode());
                }
                children.get(c).add(s, index + 1);
            }
        }
    }
}