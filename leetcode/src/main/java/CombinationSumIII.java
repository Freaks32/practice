import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Find all possible combinations of k numbers that add up to
 * a number n, given that only numbers from 1 to 9 can be used
 * and each combination should be a unique set of numbers.
 * <p>
 * Example 1:
 * Input: k = 3, n = 7
 * Output:
 * [[1,2,4]]
 * <p>
 * Example 2:
 * Input: k = 3, n = 9
 * Output:
 * [[1,2,6], [1,3,5], [2,3,4]]
 */
public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        return comboSumHelper(k, n, 1, 0, new HashSet<>(), new ArrayList<>());
    }

    private List<List<Integer>> comboSumHelper(int k, int n, int num, int total,
                                               Set<Integer> currentSet,
                                               List<List<Integer>> output) {
        if (total > n || k < 0) {
            return output;
        } else if (total == n && k == 0) {
            output.add(new ArrayList<>(currentSet));
        } else {
            for (int i = num; i <= 9 && total + i <= n; i++) {
                currentSet.add(i);
                comboSumHelper(k - 1, n, i + 1, total + i, currentSet, output);
                currentSet.remove(i);
            }
        }
        return output;
    }
}
