import org.junit.Assert;
import org.junit.Test;

/**
 * Test for UnsealTheSafe Problem from TopCoder
 */
public class UnsealTheSafeTest {
    UnsealTheSafe unsealTheSafe = new UnsealTheSafe();

    @Test
    public void countPasswords() throws Exception {
        Assert.assertEquals(26L, unsealTheSafe.countPasswords(2));
        Assert.assertEquals(74L, unsealTheSafe.countPasswords(3));
        Assert.assertEquals(768478331222L, unsealTheSafe.countPasswords(25));
    }
}