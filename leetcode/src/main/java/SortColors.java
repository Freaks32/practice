/**
 * Sort Colors
 * https://leetcode.com/problems/sort-colors/
 * <p>
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * <p>
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * <p>
 * Note:
 * You are not suppose to use the library's sort function for this problem.
 */
public class SortColors {
    public void sortColors(int[] nums) {
        // Bucket Sort due to limited domain
        int[] buckets = new int[3];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 2 || nums[0] < 0) {
                throw new IllegalArgumentException("Value out of range");
            }
            buckets[nums[i]]++;
        }

        int index = 0;
        int indexOut = 0;
        while (index < buckets.length) {
            if (buckets[index] > 0) {
                buckets[index]--;
                nums[indexOut++] = index;
            } else {
                index++;
            }
        }
    }
}
