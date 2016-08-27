import java.util.Scanner;

/**
 * Created by Brian on 8/26/2016.
 */
public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();

        System.out.println(squareOfSum(n) - sumOfSquares(n));
    }

    private static long sumOfSquares(int n) {
        long total = 0;
        for (int i = 1; i <= n; i++) {
            total += (i * i);
        }
        return total;
    }

    private static long squareOfSum(int n) {
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum * sum;
    }
}
