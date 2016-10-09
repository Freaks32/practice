/**
 * ProductMinusOne
 * https://careercup.com/question?id=5755558775750656
 * <p>
 * you have a array nums as input. For any i from 0 to length - 1. should print product of whole array except nums[i]
 * For example: nums = [2,3,1,4,3,2]
 * output:
 * i = 0, 72
 * i = 1, 48
 * i = 2, 144
 * i = 3, 36
 * i = 4, 48
 * i = 5, 72
 */
public class ProductMinusOne {
    public static long productMinusOne(long[] array, int i) {
        long arrayProduct = 1L;
        for (int k = 0; k < array.length; k++) {
            if (k != i) {
                arrayProduct *= array[k];
            }
        }
        return arrayProduct;
    }
}
