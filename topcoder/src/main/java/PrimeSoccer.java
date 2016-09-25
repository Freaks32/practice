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
        // Probabilities of each team scoring per round
        double probA = (double) skillOfTeamA / 100D;
        double probB = (double) skillOfTeamB / 100D;

        // Probabilities of each team scoring a prime value
        double probPrimeA = getProbabilityRounds(0, probA, 18);
        double probPrimeB = getProbabilityRounds(0, probB, 18);

        // Probability is the inverse of the chances of Team A not scoring
        // prime multiplied by chances of Team B not scoring prime
        return 1D - ((1D - probPrimeA) * (1D - probPrimeB));
    }

    private double getProbabilityRounds(int currentScore, double probability, int roundsLeft) {
        return 0D;
    }
}
