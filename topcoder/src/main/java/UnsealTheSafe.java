/**
 * UnsealTheSafe Problem from TopCoder
 * https://community.topcoder.com/stat?c=problem_statement&pm=4471
 */
public class UnsealTheSafe {
    // Lookup for all adjacent keys to specified key
    private static Integer[][] adjacentKeyLookup = new Integer[][]{
            new Integer[]{7},           // 0
            new Integer[]{2, 4},        // 1
            new Integer[]{1, 3, 5},     // 2
            new Integer[]{2, 6},        // 3
            new Integer[]{1, 5, 7},     // 4
            new Integer[]{2, 4, 6, 8},  // 5
            new Integer[]{3, 5, 9},     // 6
            new Integer[]{0, 4, 8},     // 7
            new Integer[]{5, 7, 9},     // 8
            new Integer[]{6, 8}         // 9
    };

    private static long NO_CACHED_VALUE = -1L;

    long[][] comboLookup;

    public long countPasswords(int N) {
        initComboLookup(N);
        return 0L;
    }

    private void initComboLookup(int N) {
        comboLookup = new long[N][10];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                comboLookup[i][j] = NO_CACHED_VALUE;
            }
        }
    }

    long getCachedCombos(int N, int key) {
        return comboLookup[N - 1][key];
    }

    void setCachedCombos(int N, int key, long combos) {
        comboLookup[N - 1][key] = combos;
    }

    int[] getAdjacentKeys(int key) {
        return adjacentKeyLookup[key];
    }
}
