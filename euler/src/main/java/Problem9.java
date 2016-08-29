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

        System.out.println("A = " + pythagoreanTriplet.getA());
        System.out.println("B = " + pythagoreanTriplet.getB());
        System.out.println("C = " + pythagoreanTriplet.getC());

        System.out.println("ABC = " + (pythagoreanTriplet.getA() *
                pythagoreanTriplet.getB() * pythagoreanTriplet.getC()));
    }

    public static Triplet<Integer> specialPythagoreanTriplet(int x) {
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
