import java.util.ArrayList;
import java.util.List;

/**
 * Given a board of letters and a word (or list of words)
 * determine which of the words are present in the board
 */
public class Boggle {
    public static String[] wordsPresent(char[][] gameBoard, String[] words) {
        return null;
    }

    public String[] wordsPresent(String[] words) {
        return null;
    }

    public static boolean wordPresent(char[][] gameBoard, String word) {
        return false;
    }

    public boolean wordPresent(String word) {
        return false;
    }

    private <T> List<BoggleNode<T>> getNeighbors(BoggleNode<T>[][] gameBoard, int x, int y) {
        List<BoggleNode<T>> neighbors = new ArrayList<>(8);
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                // Ignore Self
                if (i == 0 && j == 0) {
                    continue;
                }

                // Calculate Target Coordinates
                int targetX = x + i;
                int targetY = y + j;

                // Bounds Checking
                if (targetX < 0 || targetX >= gameBoard.length ||
                        targetY < 0 || targetY >= gameBoard[targetX].length) {
                    continue;
                }

                neighbors.add(gameBoard[targetX][targetY]);
            }
        }
        return neighbors;
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
