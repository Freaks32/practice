import java.util.HashMap;
import java.util.Map;

/**
 * NumberofFiboCalls
 * https://community.topcoder.com/stat?c=problem_statement&pm=2292
 */
public class NumberOfFiboCalls {
    Map<Integer, Integer[]> callLookup = new HashMap<>();

    public int[] fiboCallsMade(int n) {
        return null;
    }

    private Integer[] getNumberOfCalls(int n) {
        if (callLookup.containsKey(n)) {
            return callLookup.get(n);
        }
        return null;
    }

    private void setNumberOfCalls(int n, Integer[] numCalls) {
        callLookup.put(n, numCalls);
    }
}
