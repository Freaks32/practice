import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Given a board of letters and a word (or list of words)
 * determine which of the words are present in the board
 */
public class Boggle<T> {
    // Refer to starting positions in Boggle Board given a value
    private Map<T, List<BoggleNode<T>>> boggleBoardLookup;

    public Boggle(char[][] gameBoard) {
        // Filter out bad input
        {
            if (gameBoard == null || gameBoard.length < 1 || gameBoard[0].length < 1) {
                throw new IllegalArgumentException("Invalid Game Board Encountered");
            }
            int expectedLength = gameBoard[0].length;
            for (int i = 1; i < gameBoard.length; i++) {
                if (expectedLength != gameBoard[i].length) {
                    throw new IllegalArgumentException("Game Board is not Square!");
                }
            }
        }

        // Assume that the Boggle board will be used in multiple instances
        // Pay the upfront cost of pre-processing the board for lookup speed

        List<List<BoggleNode<Character>>> nodeBoard = new ArrayList<>(gameBoard.length);
        for (int i = 0; i < gameBoard.length; i++) {
            nodeBoard.add(new ArrayList<>(gameBoard[i].length));
        }
        // Do initial pass to initialize all Nodes
        for (int x = 0; x < gameBoard.length; x++) {
            for (int y = 0; y < gameBoard[x].length; y++) {
                // Initial neighbor capacity = 8 (Max # neighbors for any single node)
                nodeBoard.get(x).add(new BoggleNode<>(gameBoard[x][y]));
            }
        }

        // Do second pass to connect neighboring nodes & add to lookup
        for (int x = 0; x < nodeBoard.size(); x++) {
            for (int y = 0; y < nodeBoard.get(x).size(); y++) {
                BoggleNode<Character> node = nodeBoard.get(x).get(y);
                node.setNeighbors(getNeighbors(nodeBoard, x, y));
                addToBoardLookup(node);
            }
        }
    }

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

    private <T> void addToBoardLookup(BoggleNode<T> node) {
        if (!boggleBoardLookup.containsKey(node.getValue())) {
            List<BoggleNode<T>> nodeList = new ArrayList<>();
            boggleBoardLookup.put(node.getValue(), nodeList);
        }
        List<BoggleNode<T>> nodeList = boggleBoardLookup.get(node.getValue());
        nodeList.add(node);
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
