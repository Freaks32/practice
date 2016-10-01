import java.util.Arrays;

/**
 * NumbersChallenge
 * https://community.topcoder.com/stat?c=problem_statement&pm=13166
 */
public class NumbersChallenge {
    int[] a;

    private NumbersChallenge(int[] s) {
        a = Arrays.copyOf(s, s.length);
        Arrays.sort(a);
    }

    public static int minNumber(int[] s) {
        return new NumbersChallenge(s).minNumber();
    }

    private int minNumber() {
        return 0;
    }
}
