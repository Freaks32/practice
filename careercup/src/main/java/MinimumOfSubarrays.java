import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Implementation for https://careercup.com/question?id=5689975619190784
 * --
 * Find the minimum of every sub-array of size k in an array of size n.
 * <p>
 * O(n) solution required.
 */
public class MinimumOfSubarrays {
    /**
     * Provides an O(n) solution where N = size of input
     * <p>
     * Using a dequeue, we can keep track of the minimum element
     * by using a sliding window where the minimum will always be tracked
     * by the first position in the queue.
     * <p>
     * If a new minimum is encountered, we slide to the new minimum and
     * hold on to it. If the queue ever exceeds k, we simply pop the first element
     * <p>
     * Problem with current state: No way to find current minimum after popping minimum
     * when queue exceeds k. Not correct for all cases. :(
     */
    public static Integer[] minimumOfSubarrays(Integer[] input, int k) {
        if (input == null || input.length < k) {
            throw new IllegalArgumentException("Array is null or not big enough");
        }

        Deque<Integer> window = new ArrayDeque<>(k + 1);

        int index = 0;
        while (index < k - 1) {
            window.addLast(input[index]);
            index++;

            while (window.peekFirst() > window.peekLast()) {
                window.pollFirst();
            }
        }

        int outputSize = input.length - k + 1;
        Integer[] mins = new Integer[outputSize];
        for (int outputIndex = 0; outputIndex < outputSize; outputIndex++) {
            window.addLast(input[index]);
            index++;

            if (window.size() > k) {
                window.pollFirst();
            }

            while (window.peekFirst() > window.peekLast()) {
                window.pollFirst();
            }

            mins[outputIndex] = Math.min(window.peekFirst(), window.peekLast());
        }

        return mins;
    }
}
