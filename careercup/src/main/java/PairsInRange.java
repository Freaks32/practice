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
        return null;
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