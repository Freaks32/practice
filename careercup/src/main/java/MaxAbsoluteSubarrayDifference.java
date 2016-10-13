/**
 * MaxAbsoluteSubarrayDifference
 * https://careercup.com/question?id=19286747
 * <p>
 * Given an array of integers. Find two disjoint contiguous sub-arrays such that the absolute difference between the sum of two sub-array is maximum.
 * The sub-arrays should not overlap.
 * <p>
 * eg- [2 -1 -2 1 -4 2 8] ans - (-1 -2 1 -4) (2 8), diff = 16
 */
public class MaxAbsoluteSubarrayDifference {
    private static class Helper {
        private final int[] array;

        private final int[][] subarraySum;

        public Helper(int[] array) {
            this.array = array;
            this.subarraySum = new int[array.length][array.length];
        }

        public int maxAbsoluteSubarrayDifference() {
            return 0;
        }
    }

    public static int maxAbsoluteSubarrayDifference(int[] array) {
        return new Helper(array).maxAbsoluteSubarrayDifference();
    }
}
