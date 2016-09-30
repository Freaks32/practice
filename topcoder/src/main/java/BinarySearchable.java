import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * BinarySearchable
 * https://community.topcoder.com/stat?c=problem_statement&pm=5869
 */
public class BinarySearchable {
    private final int[] sequence;
    private final PriorityQueue<Integer> lowQueue;
    private final PriorityQueue<Integer> highQueue;

    private BinarySearchable(int[] sequence) {
        if (sequence.length < 1) {
            throw new IllegalArgumentException("Array is empty!");
        }

        this.sequence = sequence;
        lowQueue = new PriorityQueue<>(10, new MaxHeap());
        highQueue = new PriorityQueue<>(10);

        for (int integer : sequence) {
            highQueue.add(integer);
        }
    }

    public static int howMany(int[] sequence) {
        return new BinarySearchable(sequence).howMany();
    }

    private int howMany() {
        return 0;
    }

    /**
     * Provides MaxHeap functionality for a PriorityQueue
     */
    private static class MaxHeap implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }
}
