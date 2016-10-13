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
    public static int maxAbsoluteSubarrayDifference(int[] array) {
        int[] leftSubarrayMax = new int[array.length];
        int[] leftSubarrayMin = new int[array.length];
        int[] rightSubarrayMax = new int[array.length];
        int[] rightSubarrayMin = new int[array.length];

        int runningMax = 0;
        int runningMin = 0;
        for (int i = 0; i < array.length; i++) {
            runningMax = Math.max(runningMax + array[i], array[i]);
            leftSubarrayMax[i] = runningMax;
            runningMin = Math.min(runningMin + array[i], array[i]);
            leftSubarrayMin[i] = runningMin;
        }

        runningMax = 0;
        runningMin = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            runningMax = Math.max(runningMax + array[i], array[i]);
            rightSubarrayMax[i] = runningMax;
            runningMin = Math.min(runningMin + array[i], array[i]);
            rightSubarrayMin[i] = runningMin;
        }

        int absoluteMaxDifference = Integer.MIN_VALUE;
        for (int index = -1; index < array.length; index++) {
            int leftMax = index >= 0 ? leftSubarrayMax[index] : 0;
            int leftMin = index >= 0 ? leftSubarrayMin[index] : 0;

            int rightMax = index + 1 < array.length ? rightSubarrayMax[index + 1] : 0;
            int rightMin = index + 1 < array.length ? rightSubarrayMin[index + 1] : 0;

            int instanceAbsoluteMaxDifference = Math.max(rightMax - leftMin, leftMax - rightMin);
            if (instanceAbsoluteMaxDifference > absoluteMaxDifference) {
                absoluteMaxDifference = instanceAbsoluteMaxDifference;
            }
        }

        return absoluteMaxDifference;
    }
}
