/**
 * Created by Brian on 8/25/2016.
 */
public class Problem4 {
    public static void main(String[] args) {
        bruteForce();
    }

    public static void bruteForce() {
        int i = 100;
        int j;

        long largestPalindrome = -1;

        while (i < 1000) {
            j = 100;
            while (j < 1000) {
                long result = i * j;
                if (checkPalindrome(result) && result > largestPalindrome) {
                    largestPalindrome = result;
                }
                j++;
            }
            i++;
        }

        System.out.println(largestPalindrome);
    }

    private static boolean checkPalindrome(long value) {
        String stringy = String.valueOf(value);

        boolean isPalindrome = true;
        for (int i = 0; i < stringy.length() / 2 && isPalindrome; i++) {
            if (stringy.charAt(i) != stringy.charAt(stringy.length() - i - 1)) {
                isPalindrome = false;
            }
        }

        return isPalindrome;
    }
}
