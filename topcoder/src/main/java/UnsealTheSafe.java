/**
 * UnsealTheSafe Problem from TopCoder
 * https://community.topcoder.com/stat?c=problem_statement&pm=4471
 */
public class UnsealTheSafe {
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
}
