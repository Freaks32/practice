import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Brian on 8/26/2016.
 */
public class Problem5 {
    private static final Integer[] PRIMES = new Integer[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();

        int maxLength = 1;
        List<List<Integer>> primeFactorizations = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            List<Integer> primeFactorization = primeFactorization(i);
            if (primeFactorization.size() > maxLength) {
                maxLength = primeFactorization.size();
            }
            primeFactorizations.add(primeFactorization);
        }

        Integer[] highestPrimes = calculateHighestPrimes(primeFactorizations);

        long result = primeFactorizationToInt(highestPrimes);
        System.out.println(result);
    }

    private static Integer[] calculateHighestPrimes(List<List<Integer>> primeFactorizations) {
        Integer[] resultHighestPrimes = new Integer[primeFactorizations.size()];
        for (int i = 0; i < resultHighestPrimes.length; i++) {
            int max = 0;
            for (int j = 0; j < primeFactorizations.size(); j++) {
                if (primeFactorizations.get(j).size() > i && primeFactorizations.get(j).get(i) > max) {
                    max = primeFactorizations.get(j).get(i);
                }
            }
            resultHighestPrimes[i] = max;
        }
        return resultHighestPrimes;
    }

    private static List<Integer> primeFactorization(int n) throws NotImplementedException {
        List<Integer> resultPrimeFactorization = new ArrayList<>();
        for (int i = 0; i < PRIMES.length && n > 1; i++) {
            int primeCounter = 0;
            while (n % PRIMES[i] == 0) {
                primeCounter++;
                n /= PRIMES[i];
            }
            resultPrimeFactorization.add(primeCounter);
        }
        if (n > 1) {
            throw new NotImplementedException();
        }
        return resultPrimeFactorization;
    }

    private static long primeFactorizationToInt(Integer[] primeFactorization) {
        long result = 1;
        for (int i = 0; i < primeFactorization.length; i++) {
            for (int j = 0; j < primeFactorization[i]; j++) {
                result *= PRIMES[i];
            }
        }
        return result;
    }
}
