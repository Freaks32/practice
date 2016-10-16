/**
 * MaxPossibleN
 * https://careercup.com/question?id=5094709806497792
 * <p>
 * Given an unsorted array of integers, you need to return maximum possible n such that the array consists at least n values greater than or equals to n. Array can contain duplicate values.
 * Sample input : [1, 2, 3, 4] -- output : 2
 * Sample input : [900, 2, 901, 3, 1000] -- output: 3
 */
public class MaxPossibleN {
    public static int maxPossibleN(int[] array) {
        int[] histogram = new int[array.length + 1];

        for (int value : array) {
            if (value < 0) {
                throw new IllegalArgumentException("Assumption not met: No negative numbers");
            } else if (value >= histogram.length) {
                histogram[histogram.length - 1] += 1;
            } else {
                histogram[value] += 1;
            }
        }

        int runningCount = 0;
        for (int i = histogram.length - 1; i >= 0; i--) {
            runningCount += histogram[i];
            if (runningCount >= i) {
                return i;
            }
        }
        return -1;
    }
}
