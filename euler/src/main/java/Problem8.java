import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Largest product in a series
 * <p>
 * The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
 * <p>
 * 73167176531330624919225119674426574742355349194934
 * 96983520312774506326239578318016984801869478851843
 * 85861560789112949495459501737958331952853208805511
 * 12540698747158523863050715693290963295227443043557
 * 66896648950445244523161731856403098711121722383113
 * 62229893423380308135336276614282806444486645238749
 * 30358907296290491560440772390713810515859307960866
 * 70172427121883998797908792274921901699720888093776
 * 65727333001053367881220235421809751254540594752243
 * 52584907711670556013604839586446706324415722155397
 * 53697817977846174064955149290862569321978468622482
 * 83972241375657056057490261407972968652414535100474
 * 82166370484403199890008895243450658541227588666881
 * 16427171479924442928230863465674813919123162824586
 * 17866458359124566529476545682848912883142607690042
 * 24219022671055626321111109370544217506941658960408
 * 07198403850962455444362981230987879927244284909188
 * 84580156166097919133875499200524063689912560717606
 * 05886116467109405077541002256983155200055935729725
 * 71636269561882670428252483600823257530420752963450
 * <p>
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 */
public class Problem8 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("src/main/resources/problem8/inputNumber.txt"));
        String inputNumber = fileScanner.next();
        throwOnInvalidNumber(inputNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter # adjacent digits:");
        int numAdjacentDigits = scanner.nextInt();

        long largestProductInSeries = largestAdjacentProduct(inputNumber, numAdjacentDigits);

        System.out.println(largestProductInSeries);
    }

    static void throwOnInvalidNumber(String number) throws NumberFormatException {
        // Throws NumberFormatException on Invalid Number
        new BigInteger(number);
    }

    /**
     * Current speed is O(n * k) where n = length of number & k = num adjacent digits
     * <p>
     * This solution could be improved to O(n) by keeping track of the running product
     * as we progress across the number. Logic would need to be added to account for
     * the diminishing power of 0's within the number while tracking the current product
     *
     * @param number            the number to be used for characters in the product
     * @param numAdjacentDigits number of adjacent digits to consider for product
     * @return the largest adjacent product
     */
    public static long largestAdjacentProduct(String number, int numAdjacentDigits) {
        char[] charArray = number.toCharArray();

        long maxProduct = 0;
        for (int i = 0; i < charArray.length - numAdjacentDigits; i++) {
            long currentProduct = 1;
            for (int j = 0; j < numAdjacentDigits; j++) {
                currentProduct *= Character.getNumericValue(charArray[i + j]);
            }
            if (currentProduct > maxProduct) {
                maxProduct = currentProduct;
            }
        }

        return maxProduct;
    }
}
