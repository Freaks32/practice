import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for Problem7 Implementation
 */
public class Problem7Test {
    private static final Integer[] PRIMES = new Integer[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53,
            59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167,
            173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281,
            283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419,
            421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541};

    @Test
    public void getDesiredPrime() throws Exception {
        for (int i = 0; i < PRIMES.length; i++) {
            Long prime = Problem7.getDesiredPrime(i + 1);
            Assert.assertEquals(Long.valueOf(PRIMES[i]), prime);
        }
    }

    @Test
    public void getDesiredPrimeBadInput() throws Exception {
        try {
            Problem7.getDesiredPrime(0);
            Assert.fail("Did not throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected Exception
        } catch (Throwable e) {
            Assert.fail("Wrong exception type thrown");
        }
    }
}