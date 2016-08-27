import java.util.Scanner;

/**
 * 10001st Prime
 * <p>
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * <p>
 * What is the 10 001st prime number?
 */
public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter desired Prime #:");
        int desiredPrime = scanner.nextInt();

        long primeNumber = getDesiredPrime(desiredPrime);

        System.out.println(primeNumber);
    }

    public static long getDesiredPrime(int desiredPrime) {
        if (desiredPrime <= 0) {
            throw new IllegalArgumentException("Bad Prime # Index");
        }

        int currentNumPrimes = 0;
        long currentNumber = 1;
        while (currentNumPrimes < desiredPrime) {
            currentNumber++;

            // Less than or equal to 1 factor is prime
            if (!hasMoreThanGivenFactors(currentNumber, 1)) {
                currentNumPrimes++;
            }
        }

        return currentNumber;
    }

    private static boolean hasMoreThanGivenFactors(long n, int numFactors) {
        int calculatedNumFactors = 0;

        // First, remove all 2 factors (addresses all even #s)
        while (n % 2 == 0 && !hasExceededNumFactors(calculatedNumFactors, numFactors)) {
            calculatedNumFactors++;
            n /= 2;
        }

        // Next, all odd factors
        int oddFactor = 3;
        while (n > 1 && !hasExceededNumFactors(calculatedNumFactors, numFactors)) {
            while (n % oddFactor == 0) {
                calculatedNumFactors++;
                n /= oddFactor;
            }
            oddFactor += 2;
        }

        return hasExceededNumFactors(calculatedNumFactors, numFactors);
    }

    private static boolean hasExceededNumFactors(int calculatedNumFactors, int numFactors) {
        return calculatedNumFactors > numFactors;
    }
}
