import java.util.Scanner;

/**
 * Special Pythagorean Triplet
 * <p>
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * <p>
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * <p>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * <p>
 * x = a + b + c
 */
public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = scanner.nextInt();

        Triplet<Integer> pythagoreanTriplet = specialPythagoreanTriplet(x);

        if (pythagoreanTriplet != null) {
            System.out.println("A = " + pythagoreanTriplet.getA());
            System.out.println("B = " + pythagoreanTriplet.getB());
            System.out.println("C = " + pythagoreanTriplet.getC());

            System.out.println("ABC = " + (pythagoreanTriplet.getA() *
                    pythagoreanTriplet.getB() * pythagoreanTriplet.getC()));
        } else {
            System.out.println("Null");
        }
    }

    /**
     * Pythagorean Triplet Calculation
     * <p>
     * We only deal with two variables as x is given and the last variable is
     * implied by the values of the first two.
     * <p>
     * Straightforward solution is to scan through all values of a and b to find
     * a solution which satisfies both requirements (a^2 + b^2 = c^2 & a + b + c = x)
     *
     * @param x the sum of a + b + c for the pythagorean triplet
     * @return a triplet (a, b, c) which sums to x following pythagorean theorem
     */
    public static Triplet<Integer> specialPythagoreanTriplet(int x) {
        // Upper constraint of a is x/3 as a < b < c and a + b + c = x
        for (int a = 1; a < x / 3; a++) {
            // Upper constraint of x/2 as b < c and a + b + c = x and a > 1
            for (int b = a + 1; b < x / 2; b++) {
                int c = x - a - b;
                if ((a * a) + (b * b) == (c * c)) {
                    return new Triplet<>(a, b, c);
                }
            }
        }
        return null;
    }
}

class Triplet<T> {
    private final T a;
    private final T b;
    private final T c;

    Triplet(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }

    public T getC() {
        return c;
    }
}
