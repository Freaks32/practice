import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * PrimeSoccer Problem from TopCoder
 * https://community.topcoder.com/stat?c=problem_statement&pm=10033
 */
public class PrimeSoccer {
    // Only need Primes up to 18 as Soccer will only ever be 18 rounds w/ no more than 1 score each round
    private static Set<Integer> primeSet = new HashSet<>(Arrays.asList(2, 3, 5, 7, 9, 11, 13, 17));

    public double getProbability(int skillOfTeamA, int skillOfTeamB) {
        return 0D;
    }
}
