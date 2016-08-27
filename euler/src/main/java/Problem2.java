import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Brian on 8/25/2016.
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> fibos = new ArrayList<>();
        fibos.add(1);
        fibos.add(2);

        int i = 1;
        while ((fibos.get(i) + fibos.get(i - 1)) <= n) {
            fibos.add(fibos.get(i - 1) + fibos.get(i));
            i++;
        }

        long total = 0L;
        for (int j = 0; j < fibos.size(); j++) {
            if ((fibos.get(j) % 2) == 0) {
                total += fibos.get(j);
            }
        }

        System.out.println(total);
    }
}
