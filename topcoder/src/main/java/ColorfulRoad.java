/**
 * ColorfulROad Problem from TopCoder
 * https://community.topcoder.com/stat?c=problem_statement&pm=12837
 */
public class ColorfulRoad {
    private static int NOT_POSSIBLE = -1;

    public static int getMin(String road) {
        int[] minEffort = new int[road.length()];

        // Initialize the Minimum Effort array
        minEffort[0] = 0;
        for (int i = 1; i < road.length(); i++) {
            minEffort[i] = NOT_POSSIBLE;
        }

        // For each reachable segment, calculate effort to next possible segments
        for (int i = 0; i < road.length(); i++) {
            if (minEffort[i] != NOT_POSSIBLE) {
                char nextColor = nextColor(road.charAt(i));

                for (int j = i + 1; j < road.length(); j++) {

                    if (road.charAt(j) == nextColor) {
                        // Calculate total effort to reach j, store if minimum
                        int distance = j - i;
                        int effort = minEffort[i] + (distance * distance);
                        if (effort < minEffort[j]) {
                            minEffort[j] = effort;
                        }
                    }
                }
            }
        }

        return minEffort[road.length() - 1];
    }

    private static char nextColor(char currentColor) {
        switch (currentColor) {
            case 'R':
                return 'G';
            case 'G':
                return 'B';
            case 'B':
                return 'R';
            default:
                throw new IllegalArgumentException();
        }
    }
}
