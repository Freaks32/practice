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
        if (currentSmiles > numSmiles || copiedSmiles >= numSmiles) {
            return Integer.MAX_VALUE;
        } else if (currentSmiles == numSmiles) {
            return 0;
        }

        int cachedResult = getSmiles(currentSmiles, copiedSmiles);
        if (cachedResult != NO_RESULT_STORED) {
            return cachedResult;
        }

        int copyMinMoves = Integer.MAX_VALUE;
        if (copiedSmiles < currentSmiles) {
            // Copy is Reasonable
            copyMinMoves = printSmilesInternal(currentSmiles, currentSmiles);
        }

        int pasteMinMoves = Integer.MAX_VALUE;
        if (copiedSmiles > 0) {
            pasteMinMoves = printSmilesInternal(currentSmiles + copiedSmiles, copiedSmiles);
        }

        int calculatedMin = Math.min(copyMinMoves, pasteMinMoves);
        int calculatedMoves = Math.max(calculatedMin + 1, calculatedMin);
        setSmiles(currentSmiles, copiedSmiles, calculatedMoves);
        return calculatedMoves;
    }

    private void setSmiles(int currentSmiles, int copiedSmiles, int calculatedMoves) {
        smileLookup[currentSmiles][copiedSmiles] = calculatedMoves;
    }

    private int getSmiles(int currentSmiles, int copiedSmiles) {
        return smileLookup[currentSmiles][copiedSmiles];
    }
}
