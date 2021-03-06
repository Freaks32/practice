import java.util.*;

/**
 * PrimeSoccer Problem from TopCoder
 * https://community.topcoder.com/stat?c=problem_statement&pm=10033
 */
public class PrimeSoccer {
    // Only need Primes up to 18 as Soccer will only ever be 18 rounds w/ no more than 1 score each round
    private static Set<Integer> primeSet = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17));

    // Safe to use double as Key here because this value is only
    // calculated once and hence, will always be accurate
    private Map<Double, Double[][]> probabilityLookup = new HashMap<>();

    private static double PROBABILITY_MISSING = -1.0D;

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
        if (roundsLeft == 0) {
            // Was final score prime or not?
            return primeSet.contains(currentScore) ? 1D : 0D;
        } else {
            double cachedProbability = lookupProbability(currentScore, probability, roundsLeft);
            if (cachedProbability != PROBABILITY_MISSING) {
                return cachedProbability;
            }

            double probNoScore = (1 - probability) * getProbabilityRounds(currentScore, probability, roundsLeft - 1);
            double probScore = probability * getProbabilityRounds(currentScore + 1, probability, roundsLeft - 1);

            double calculatedProbability = probNoScore + probScore;
            setProbability(currentScore, probability, roundsLeft, calculatedProbability);
            return calculatedProbability;
        }
    }

    private double lookupProbability(int currentScore, double probability, int roundsLeft) {
        if (!probabilityLookup.containsKey(probability)) {
            Double[][] probabilityLookupTable = buildProbabilityLookupTable();
            probabilityLookup.put(probability, probabilityLookupTable);
        }

        Double[][] probabilityLookupTable = probabilityLookup.get(probability);
        return probabilityLookupTable[currentScore][roundsLeft - 1];
    }

    private void setProbability(int currentScore, double probability, int roundsLeft, double calculatedProbability) {
        if (!probabilityLookup.containsKey(probability)) {
            Double[][] probabilityLookupTable = buildProbabilityLookupTable();
            probabilityLookup.put(probability, probabilityLookupTable);
        }

        Double[][] probabilityLookupTable = probabilityLookup.get(probability);
        probabilityLookupTable[currentScore][roundsLeft - 1] = calculatedProbability;
    }

    private Double[][] buildProbabilityLookupTable() {
        // Score Range: 0-18 = 19
        // Round Range: 1-18 = 18 (No caching for 0 rounds left)
        Double[][] probabilityLookupTable = new Double[19][18];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 18; j++) {
                probabilityLookupTable[i][j] = PROBABILITY_MISSING;
            }
        }
        return probabilityLookupTable;
    }
}
