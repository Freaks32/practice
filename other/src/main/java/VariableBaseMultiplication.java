/**
 * Variable Base Multiplication
 * <p>
 * Multiply two numbers given the base of those numbers
 */
public class VariableBaseMultiplication {
    public static String multiply(String a, String b, int base) {
        long aBase10 = Long.parseLong(a, base);
        long bBase10 = Long.parseLong(b, base);

        return Long.toString(aBase10 * bBase10, base);
    }

    public static String manualMultiply(String a, String b, int base) {
        return null;
    }
}
