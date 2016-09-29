import java.util.ArrayList;
import java.util.List;

/**
 * Given a board of letters and a word (or list of words)
 * determine which of the words are present in the board
 */
public class Boggle {
    public static String[] wordsPresent(char[][] gameBoard, String[] words) {
        return 0;
    }

    public String[] wordsPresent(String[] words) {
        return 0;
    }

    public static boolean wordPresent(char[][] gameBoard, String word) {
        return false;
    }

    public boolean wordPresent(String word) {
        return false;
    }

    private static class BoggleNode<T> {
        T value;

        List<BoggleNode<T>> neighbors;

        public GraphNode(T value) {
            this.value = value;
        }

        public GraphNode(T value, int neighborInitialCapacity) {
            this(value);
            this.neighbors = new ArrayList<>(neighborInitialCapacity);
        }

        public T getValue() {
            return value;
        }

        public List<BoggleNode<T>> getNeighbors() {
            return neighbors;
        }

        public void setNeighbors(List<BoggleNode<T>> neighbors) {
            this.neighbors = neighbors;
        }
    }
}
