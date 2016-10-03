import java.util.HashSet;
import java.util.Set;

/**
 * NumbersChallenge
 * https://community.topcoder.com/stat?c=problem_statement&pm=13166
 */
public class NumbersChallenge {
    Set<Integer> possibleSums = new HashSet<>();

    private NumbersChallenge(int[] s) {
        calculateSums(s);
    }

    // Given the bounded-ness of S, (1-20), we will have no more than ~1M total possible sums
    // This can fit within reasonable time constraint for O(2^N) time & space.
    public static int minNumber(int[] s) {
        return new NumbersChallenge(s).minNumber();
    }

    private int minNumber() {
        int i = 0;
        while (possibleSums.contains(i)) {
            i++;
        }
        return i;
    }

    private void calculateSums(int[] s) {
        calculateSums(s, 0, 0);
    }

    private void calculateSums(int[] s, int index, int prefixSum) {
        if (index < s.length) {
            calculateSums(s, index + 1, prefixSum);
            calculateSums(s, index + 1, prefixSum + s[index]);
        } else {
            possibleSums.add(prefixSum);
        }
    }
}
