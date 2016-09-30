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
        int numBinarySearchable = 0;

        for (int index = 0; index < sequence.length; index++) {
            int currentValue = sequence[index];
            highQueue.remove(currentValue);

            if (isBinarySearchable(currentValue)) {
                numBinarySearchable++;
            }

            lowQueue.add(currentValue);
        }

        return numBinarySearchable;
    }

    private boolean isBinarySearchable(int currentValue) {
        boolean lowRequirementMet = lowQueue.size() < 1 || currentValue > lowQueue.peek();
        boolean highRequirementMet = highQueue.size() < 1 || currentValue < highQueue.peek();
        return lowRequirementMet && highRequirementMet;
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
