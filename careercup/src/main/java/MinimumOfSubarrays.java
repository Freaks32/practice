import java.util.PriorityQueue;

/**
 * Implementation for https://careercup.com/question?id=5689975619190784
 * --
 * Find the minimum of every sub-array of size k in an array of size n.
 * <p>
 * O(n) solution required.
 */
public class MinimumOfSubarrays {
    /**
     * Provides an n^2 solution (due to O(n) runtime of PriorityQueue.remove())
     */
    public static Integer[] minimumOfSubarrays(Integer[] input, int k) {
        if (input == null || input.length < k) {
            throw new IllegalArgumentException("Array is null or not big enough");
        }

        int outputSize = input.length - k + 1;
        Integer[] minOfSubarrays = new Integer[outputSize];

        int windowStart = 0;
        int windowEnd = 0;

        // Add initial elements to Min-Heap (k-1)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        while (minHeap.size() < k - 1) {
            minHeap.add(input[windowEnd++]);
        }

        // Add an Elem, find Min, and Remove Last Elem
        for (int outputIndex = 0; outputIndex < outputSize; outputIndex++) {
            minHeap.add(input[windowEnd++]);
            minOfSubarrays[outputIndex] = minHeap.peek();
            minHeap.remove(input[windowStart++]);
        }

        return minOfSubarrays;
    }
}
