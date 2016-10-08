/**
 * WordFit
 * https://careercup.com/question?id=5701279419465728
 * <p>
 * GIven a list of words, and the number of rows and columns, return the number of words that can be fit into the rows and columns by stringing together each consecutive word. If the next word doesn't fit in the same line, it should move to the next line. Find an efficient solution for this. For eg.
 * <p>
 * List of words: { "Do", "Run" }
 * Number of columns: 9
 * Number of rows: 2
 * <p>
 * First row: "Do Run Do" (7 letters + 2 spaces fit into 9 columns)
 * Second row: "Run Do" (Only 2 words fit into 9 columns)
 * <p>
 * The solution here would be 5
 */
public class WordFit {
    /**
     * Given the number of columns, we can pre-calculate how many consecutive
     * words will fit in any given line given any starting word.
     */
    public static int numberOfWords(String[] words, int columns, int rows) {
        // Pre-calculate word count per column given a starting word
        Integer[] maxWords = new Integer[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() <= columns) {
                int count = 1;
                int lineSize = words[i].length();

                int j = i + 1;
                while ((lineSize + words[j % words.length].length() + 1) <= columns) {
                    count += 1;
                    lineSize += (words[j % words.length].length() + 1);
                    j++;
                }

                maxWords[i] = count;
            } else {
                maxWords[i] = 0;
            }
        }

        int wordCount = 0;
        int wordIndex = 0;
        for (int i = 0; i < rows; i++) {
            wordCount += maxWords[wordIndex];
            wordIndex = (wordIndex + maxWords[wordIndex]) % words.length;
        }

        return wordCount;
    }
}
