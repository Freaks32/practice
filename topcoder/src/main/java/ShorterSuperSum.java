import java.util.HashMap;
import java.util.Map;

/**
 * ShorterSuperSum Problem from TopCoder
 * https://community.topcoder.com/stat?c=problem_statement&pm=10240
 */
public class ShorterSuperSum {
    private static int VALUE_NOT_IN_LOOKUP = -1;

    private Map<Integer, Map<Integer, Integer>> valueLookup = new HashMap<>();

    public int calculate(int k, int n) {
        return 0;
    }

    private int lookup(int k, int n) {
        if (valueLookup.containsKey(k) && valueLookup.get(k).containsKey(n)) {
            return valueLookup.get(k).get(n);
        } else {
            return VALUE_NOT_IN_LOOKUP;
        }
    }

    private void addToLookup(int k, int n, int value) {
        if (!valueLookup.containsKey(k)) {
            valueLookup.put(k, new HashMap<>());
        }
        valueLookup.get(k).put(n, value);
    }
}
