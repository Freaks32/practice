import java.util.ArrayList;
import java.util.List;

/**
 * FibonacciDiv2 Problem from TopCoder
 * https://community.topcoder.com/stat?c=problem_statement&pm=13159
 */
public class FibonacciDiv2 {
    private static int MAX_VALUE = 1000000;

    List<Integer> fibonacciLookup = new ArrayList<>();

    public FibonacciDiv2() {
        fibonacciLookup.add(0);
        fibonacciLookup.add(1);
    }

    public int find(int n) {
        int i = 1;
        while (getFibonacci(i) < n) {
            i++;
        }

        int oneBelow = fibonacciLookup.get(i - 1);
        int oneAbove = fibonacciLookup.get(i);

        int distanceAbove = Integer.MAX_VALUE;
        if (oneAbove <= MAX_VALUE) {
            distanceAbove = oneAbove - n;
        }

        return Math.min(distanceAbove, n - oneBelow);
    }

    private int getFibonacci(int n) {
        if (fibonacciLookup.size() <= n) {
            for (int i = fibonacciLookup.size(); i <= n; i++) {
                fibonacciLookup.add(fibonacciLookup.get(i - 2) + fibonacciLookup.get(i - 1));
            }
        }
        return fibonacciLookup.get(n);
    }
}
