/**
 * CoinReversing
 * https://community.topcoder.com/stat?c=problem_statement&pm=11473
 */
public class CoinReversing {
    private final int n;
    private final int[] a;

    public CoinReversing(int n, int[] a) {
        this.n = n;
        this.a = a;
    }

    public static double expectedHeads(int N, int[] a) {
        return new CoinReversing(N, a).expectedHeads();
    }

    private double expectedHeads() {
        return expectedHeadsInternal(n, 0);
    }

    private double expectedHeadsInternal(int heads, int index) {
        if (index >= a.length) {
            return heads;
        }

        final int numFlips = a[index];
        final int nextIndex = index + 1;

        double expectedHeads = 0D;

        final int maxHeads = Math.min(numFlips, heads);
        for (int numHeads = maxHeads; numHeads >= 0; numHeads--) {
            final int numTails = numFlips - numHeads;
            if (numTails > n - heads) {
                break;
            }

            long numHeadsOptions = nChooseK(heads, numHeads);
            long numTailsOpttions = nChooseK(n - heads, numTails);

            long combo = numHeadsOptions * numTailsOpttions;
            long numTotalOptions = nChooseK(n, numFlips);

            double probability = (double) combo / (double) numTotalOptions;
            expectedHeads += probability *
                    expectedHeadsInternal(heads - (numHeads - numTails),
                            nextIndex);
        }

        return expectedHeads;
    }

    private long nChooseK(int n, int k) {
        if (k == 0) {
            return 1L;
        } else if (n == k) {
            return 1;
        } else {
            return nChooseK(n - 1, k - 1) + nChooseK(n - 1, k);
        }
    }
}
