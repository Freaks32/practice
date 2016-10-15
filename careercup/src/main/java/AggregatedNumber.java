/**
 * AggregatedNumber
 * https://careercup.com/question?id=14948278
 * <p>
 * we will name a number "aggregated number" if this number
 * has the following attribute (just like the Fibonacci numbers):
 * 1,1,2,3,5,8,13.....
 * <p>
 * the digits in the number can divided into several parts,
 * and the later part is the sum of the former parts.
 * <p>
 * like 112358, because 1+1=2, 1+2=3, 2+3=5, 3+5=8
 * 122436, because 12+24=36
 * 1299111210, because 12+99=111, 99+111=210
 * 112112224, because 112+112=224
 * so can you provide a function to check whether this number is aggregated number or not?
 */
public class AggregatedNumber {
    public static boolean isAggregatedNumber(String input) {
        for (int i = 1; i <= input.length() / 3; i++) {
            for (int j = i + 1; j <= input.length() * 2 / 3; j++) {
                int first = Integer.parseInt(input.substring(0, i));
                int second = Integer.parseInt(input.substring(i, j));

                if (checkSequence(input, first, second, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkSequence(String input, int first, int second, int index) {
        if (index >= input.length()) {
            return true;
        }

        int result = first + second;
        String expectedString = String.valueOf(result);

        int indexEnd = Math.min(index + expectedString.length(), input.length());
        String actualString = input.substring(index, indexEnd);

        if (expectedString.equals(actualString)) {
            return checkSequence(input, second, result, index + expectedString.length());
        } else {
            return false;
        }
    }
}
