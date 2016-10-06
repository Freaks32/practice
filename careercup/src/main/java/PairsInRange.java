import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Pairs Sum to Range of Values
 * <p>
 * Write a function that takes as input an array of integers A, and two integers low and high.
 * <p>
 * Your function has to output pairs of indices: {(i,j), ...}
 * <p>
 * Where each pair of indices denotes that the subarray of A[i...j] has a sum in the range low <= sum <= high.
 */
public class PairsInRange {
    public static Set<Pair<Integer>> pairsInRange(int[] numbers, int low, int high) {
        Set<Pair<Integer>> output = new HashSet<>();

        // Sort to make Binary Searchable O(n*lg(n))
        Arrays.sort(numbers);

        // For each number, search for target values which sum to range
        for (int number : numbers) {
            int targetHigh = high - number;
            int targetLow = low - number;

            int indexLow = binarySearchGte(numbers, targetLow, 0, numbers.length);
            for (int i = indexLow; i < numbers.length && numbers[i] <= targetHigh; i++) {
                output.add(new Pair<>(number, numbers[i]));
            }
        }
        return output;
    }

    /**
     * Binary search on sorted integer array for a specific value.
     * Returns the index of the last element matching 'find' or the last element
     * less than element 'find'
     * <p>
     * Weak point: If all numbers in the array are equal, time complexity becomes O(n)
     * rather than the expected O(lg(n)) for lookup. This can be combated by doing binary
     * search until the specific index is found, rather than falling back to scanning
     */
    private static int binarySearchGte(int[] nums, int find, int start, int end) {
        if (start >= end) {
            return start;
        }

        int mid = (end + start) / 2;
        int val = nums[mid];

        if (val < find) {
            return binarySearchGte(nums, find, mid + 1, end);
        } else if (val > find) {
            return binarySearchGte(nums, find, start, mid - 1);
        } else {
            int index = mid;
            while (index - 1 >= 0 && nums[index - 1] == find) {
                index--;
            }
            return index;
        }
    }
}

class Pair<T> {
    private T left;
    private T right;

    public Pair(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair<?> pair = (Pair<?>) o;

        if (left != null ? !left.equals(pair.left) : pair.left != null) return false;
        return right != null ? right.equals(pair.right) : pair.right == null;

    }

    @Override
    public int hashCode() {
        int result = left != null ? left.hashCode() : 0;
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }
}