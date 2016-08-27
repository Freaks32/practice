import java.util.Scanner;

/**
 * Created by Brian on 8/25/2016.
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int total = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }
        }

        System.out.println(total);
    }
}
