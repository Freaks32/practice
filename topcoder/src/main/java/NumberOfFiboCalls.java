import java.util.HashMap;
import java.util.Map;

/**
 * NumberofFiboCalls
 * https://community.topcoder.com/stat?c=problem_statement&pm=2292
 */
public class NumberOfFiboCalls {
    Map<Integer, Integer[]> callLookup = new HashMap<>();

    public NumberOfFiboCalls() {
        callLookup.put(0, new Integer[]{1, 0});
        callLookup.put(1, new Integer[]{0, 1});
    }

    public int[] fiboCallsMade(int n) {
        Integer[] callsMade = fiboCallsMadeInternal(n);
        return new int[]{callsMade[0], callsMade[1]};
    }

    private Integer[] fiboCallsMadeInternal(int n) {
        Integer[] numCalls = getNumberOfCalls(n);
        if (numCalls != null) {
            return numCalls;
        } else {
            Integer[] sumCalls = addArrays(
                    fiboCallsMadeInternal(n - 2),
                    fiboCallsMadeInternal(n - 1));
            setNumberOfCalls(n, sumCalls);
            return sumCalls;
        }
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

    private Integer[] addArrays(Integer[] a, Integer[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Arrays are not same length");
        }

        Integer[] sum = new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            sum[i] = a[i] + b[i];
        }
        return sum;
    }
}
