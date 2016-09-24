import java.util.ArrayList;
import java.util.List;

/**
 * FibonacciDiv2 Problem from TopCoder
 * https://community.topcoder.com/stat?c=problem_statement&pm=13159
 */
public class FibonacciDiv2 {
    List<Integer> fibonacciLookup = new ArrayList<>();

    public FibonacciDiv2() {
        fibonacciLookup.add(0);
        fibonacciLookup.add(1);
    }

    public int find(int n) {
        int i = 1;
        while (fibonacciLookup.get(i) < n) {
            i++;
            int fibonacciValue = fibonacciLookup.get(i - 2) + fibonacciLookup.get(i - 1);
            fibonacciLookup.add(fibonacciValue);
        }

        int oneBelow = fibonacciLookup.get(i - 1);
        int oneAbove = fibonacciLookup.get(i);

        return Math.min(oneAbove - n, n - oneBelow);
    }
}
