import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Given a board of letters and a word (or list of words)
 * determine which of the words are present in the board
 */
public class Boggle {
    // Refer to starting positions in Boggle Board given a value
    private Map<Character, List<BoggleNode<Character>>> boggleBoardLookup;

    public Boggle(Character[][] gameBoard) {
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
                nodeBoard.get(x).add(new BoggleNode<Character>(gameBoard[x][y]));
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

    public List<String> wordsPresent(String[] words) {
        List<String> wordsPresent = new ArrayList<>();
        for (String word : words) {
            if (wordPresent(word)) {
                wordsPresent.add(word);
            }
        }
        return wordsPresent;
    }

    public boolean wordPresent(String word) {
        if (word == null) {
            return false;
        } else if (word.length() < 1) {
            return true;
        }

        List<BoggleNode<Character>> startingNodes = lookupBoggleNodes(word.charAt(0));
        for (BoggleNode<Character> startingNode : startingNodes) {
            if (wordPresent(startingNode, word, 1)) {
                return true;
            }
        }
        return false;
    }

    private boolean wordPresent(BoggleNode<Character> node, String word, int wordIndex) {
        if (wordIndex >= word.length()) {
            return true;
        } else {
            for (BoggleNode<Character> nextNode : node.getNeighbors()) {
                if (nextNode.getValue() == word.charAt(wordIndex)) {
                    if (wordPresent(nextNode, word, wordIndex + 1)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private List<BoggleNode<Character>> lookupBoggleNodes(Character value) {
        if (value == null || !boggleBoardLookup.containsKey(value)) {
            return null;
        }
        return boggleBoardLookup.get(value);
    }

    private void addToBoardLookup(BoggleNode<Character> node) {
        if (!boggleBoardLookup.containsKey(node.getValue())) {
            boggleBoardLookup.put(node.getValue(), new ArrayList<>());
        }
        List<BoggleNode<Character>> nodeList = boggleBoardLookup.get(node.getValue());
        nodeList.add(node);
    }

    private List<BoggleNode<Character>> getNeighbors(List<List<BoggleNode<Character>>> gameBoard, int x, int y) {
        List<BoggleNode<Character>> neighbors = new ArrayList<>(8);
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
                if (targetX < 0 || targetX >= gameBoard.size() ||
                        targetY < 0 || targetY >= gameBoard.get(targetX).size()) {
                    continue;
                }

                neighbors.add(gameBoard.get(targetX).get(targetY));
            }
        }
        return neighbors;
    }

    private static class BoggleNode<T> {
        T value;

        List<BoggleNode<T>> neighbors;

        public BoggleNode(T value) {
            this.value = value;
        }

        public BoggleNode(T value, int neighborInitialCapacity) {
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
