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
        return 0D;
    }
    }
}
