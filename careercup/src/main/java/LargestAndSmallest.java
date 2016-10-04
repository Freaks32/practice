/**
 * https://careercup.com/question?id=5737503739871232
 * <p>
 * Find the largest and smallest number in a list. The list is stored as two sections, one in ascending order and the other in descending order.
 * <p>
 * input [ 2 3 4 5 6 7 10 9 8 7]
 * smallest : 2
 * Largest 10
 */
public class LargestAndSmallest {
    public static int smallest(int[] array) {
        if (array == null || array.length < 1) {
            throw new IllegalArgumentException("Array is invalid");
        }
        int left = array[0];
        int right = array[array.length - 1];
        return Math.min(left, right);
    }

    public static int largest(int[] array) {
        if (array == null || array.length < 1) {
            throw new IllegalArgumentException("Array is invalid");
        }
        if (array.length < 3) {
            return Math.max(array[0], array[array.length - 1]);
        } else {
            // Do binary search on array for max
            int leftBound = 0;
            int rightBound = array.length;
            int targetIndex = (rightBound + leftBound) / 2;

            while (array[targetIndex] < array[targetIndex - 1] ||
                    array[targetIndex] < array[targetIndex + 1]) {
                // Find which direction to proceed
                if (array[targetIndex] < array[targetIndex - 1]) {
                    // Decreasing sequence, max is left
                    rightBound = targetIndex;
                } else {
                    // Increasing sequence, max is right
                    leftBound = targetIndex;
                }

                targetIndex = (rightBound + leftBound) / 2;
            }

            return array[targetIndex];
        }
    }
}
