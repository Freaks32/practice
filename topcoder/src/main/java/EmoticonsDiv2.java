/**
 * EmoticonsDiv2
 * https://community.topcoder.com/stat?c=problem_statement&pm=13041
 */
public class EmoticonsDiv2 {
    private static final int NO_RESULT_STORED = 0;

    final int numSmiles;
    final int[][] smileLookup;

    private EmoticonsDiv2(int numSmiles) {
        this.numSmiles = numSmiles;
        smileLookup = new int[numSmiles][numSmiles];
    }

    public static int printSmiles(int smiles) {
        return new EmoticonsDiv2(smiles).printSmilesInternal(1, 0);
    }

    private int printSmilesInternal(int currentSmiles, int copiedSmiles) {
    }

    private void setSmiles(int currentSmiles, int copiedSmiles, int calculatedMoves) {
        smileLookup[currentSmiles][copiedSmiles] = calculatedMoves;
    }

    private int getSmiles(int currentSmiles, int copiedSmiles) {
        return smileLookup[currentSmiles][copiedSmiles];
    }
}
