import java.util.HashMap;
import java.util.Map;

/**
 * IslandSurvival
 * https://careercup.com/question?id=15556758
 * <p>
 * There is an island which is represented by square matrix NxN.
 * A person on the island is standing at any given co-ordinates (x,y).
 * He can move in any direction one step right, left, up, down on the island.
 * If he steps outside the island, he dies.
 * <p>
 * Let island is represented as (0,0) to (N-1,N-1) (i.e NxN matrix) & person
 * is standing at given co-ordinates (x,y).
 * He is allowed to move n steps on the island (along the matrix).
 * What is the probability that he is alive after he walks n steps on the island?
 * <p>
 * Write a psuedocode & then full code for function
 * float probabilityofalive(int x,int y, int n)
 */
public class IslandSurvival {
    private static class IslandSurvivalHelper {
        private static final char DELIM = '~';

        private final int n;
        private final Map<String, Double> probabilityLookup;

        public IslandSurvivalHelper(int n) {
            this.n = n;
            this.probabilityLookup = new HashMap<>();
        }

        public double probabilityAlive(int x, int y) {
            return probabilityAlive(x, y, n);
        }

        public double probabilityAlive(int x, int y, int steps) {
            String lookupKey = null;
            {
                lookupKey = new StringBuilder(12)
                        .append(x).append(DELIM)
                        .append(y).append(DELIM)
                        .append(steps)
                        .toString();
            }
            // Use cached value if possible
            if (probabilityLookup.containsKey(lookupKey)) {
                return probabilityLookup.get(lookupKey);
            }

            // Falling off the side
            if (x < 0 || x >= n || y < 0 || y >= n) {
                return 0D;
            }
            // Ended in a safe spot
            if (steps <= 0) {
                return 1D;
            }

            // Calculate probability alive and cache it
            double probabilityAlive = 0.25D * probabilityAlive(x - 1, y, steps - 1) +
                    0.25D * probabilityAlive(x + 1, y, steps - 1) +
                    0.25D * probabilityAlive(x, y - 1, steps - 1) +
                    0.25D * probabilityAlive(x, y + 1, steps - 1);
            probabilityLookup.put(lookupKey, probabilityAlive);

            return probabilityAlive;
        }
    }

    public static double probabilityAlive(int x, int y, int n) {
        return new IslandSurvivalHelper(n).probabilityAlive(x, y);
    }
}
