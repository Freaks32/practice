/**
 * Equilibrium Indexes
 * <p>
 * A zero-indexed array A consisting of N integers is given.
 * An equilibrium index of this array is any integer P such that 0 ≤ P < N and
 * the sum of elements of lower indices is equal to the sum of elements of higher indices, i.e.
 * A[0] + A[1] + ... + A[P−1] = A[P+1] + ... + A[N−2] + A[N−1].
 * <p>
 * Sum of zero elements is assumed to be equal to 0. This can happen if P = 0 or if P = N−1.
 * <p>
 * For example, consider the following array A consisting of N = 8 elements:
 * <p>
 * A[0] = -1
 * A[1] = 3
 * A[2] = -4
 * A[3] = 5
 * A[4] = 1
 * A[5] = -6
 * A[6] = 2
 * A[7] = 1
 * P = 1 is an equilibrium index of this array, because:
 * A[0] = −1 = A[2] + A[3] + A[4] + A[5] + A[6] + A[7]
 * <p>
 * P = 3 is an equilibrium index of this array, because:
 * A[0] + A[1] + A[2] = −2 = A[4] + A[5] + A[6] + A[7]
 * <p>
 * P = 7 is also an equilibrium index, because:
 * A[0] + A[1] + A[2] + A[3] + A[4] + A[5] + A[6] = 0
 * <p>
 * Write a function that, given a zero-indexed array A consisting of N integers,
 * returns any of its equilibrium indices. The function should return −1 if no equilibrium index exists.
 * <p>
 * For example, given array A shown above, the function may return 1, 3 or 7, as explained above.
 * <p>
 * Assume that:
 * - N is an integer within the range [0..100,000];
 * - each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 * - Elements of input arrays can be modified.
 * <p>
 * Complexity:
 * - expected worst-case time complexity is O(N);
 * - expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 */
public class EquilibriumIndex {
    public static int equilibriumIndex(int[] array) {
        int index = 0;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i < array.length; i++) {
            rightSum += array[i];
        }

        while (leftSum != rightSum && index < array.length) {
            leftSum += array[index];
            index++;
            rightSum -= array[index];
        }

        if (leftSum == rightSum) {
            return index;
        } else {
            return -1;
        }
    }
}
