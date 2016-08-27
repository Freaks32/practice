import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Brian on 8/25/2016.
 */
public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        List<Long> primeFactors = new ArrayList<>();
        long d = 2;
        while (n > 1) {
            while (n % d == 0) {
                primeFactors.add(d);
                n /= d;
            }
            d++;
        }

        System.out.println(primeFactors.get(primeFactors.size() - 1));
    }

    public static void mainOld(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        long largestPrime = 1;
        for (long i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                if (checkPrimeFast(i)) {
                    largestPrime = i;
                }
            }
        }

        System.out.println(largestPrime);
    }

    private static boolean checkPrime(long n) {
        boolean foundDivisor = false;
        for (long i = 2; i < n / 2 && !foundDivisor; i++) {
            if (n % i == 0) {
                foundDivisor = true;
            }
        }
        return !foundDivisor;
    }

    private static boolean checkPrimeFast(long n) {
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        long i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }
}
