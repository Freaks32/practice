import java.util.Arrays;

/**
 * https://careercup.com/question?id=5173875873677312
 * <p>
 * There are n+1 loading docks.
 * a permutation of boxes 1->n is placed on the first n
 * there is a fork that can move one box to an empty location at a time.
 * Give an algorithm to sort then boxes with minimum number of moves.
 * <p>
 * Follow up: minimum distance
 */
public class BoxDock {
    private static final int NO_BOX = -1;

    private int numMoves = 0;
    private int currentIndex;
    private int[] docks;
    private int[] boxLookup;

    private BoxDock(int[] docks) {
        this.docks = Arrays.copyOf(docks, docks.length + 1);
        this.docks[this.docks.length - 1] = NO_BOX;

        this.boxLookup = new int[docks.length];
        for (int i = 0; i < docks.length; i++) {
            setBoxIndex(docks[i], i);
        }

        this.currentIndex = this.docks.length - 1;
    }

    public static int sortBoxes(int[] docks) {
        return new BoxDock(docks).sortBoxes();
    }

    private int sortBoxes() {
        return 0;
    }

    private void swap(int index) {
        if (currentIndex != index) {
            int boxNum = docks[index];

            docks[currentIndex] = boxNum;
            docks[index] = NO_BOX;

            setBoxIndex(boxNum, currentIndex);

            currentIndex = index;
            numMoves++;
        }
    }

    private void setBoxIndex(int boxNum, int index) {
        boxLookup[boxNum] = index;
    }

    private int getBoxIndex(int boxNum) {
        return boxLookup[boxNum];
    }
}
