import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Brian on 8/28/2016.
 */
public class Problem9Test {
    @Test
    public void specialPythagoreanTriplet() throws Exception {
        Triplet<Integer> pythagoreanTriplet = Problem9.specialPythagoreanTriplet(1000);
        Assert.assertNotNull(pythagoreanTriplet);
        Assert.assertEquals(Integer.valueOf(3), pythagoreanTriplet.getA());
        Assert.assertEquals(Integer.valueOf(4), pythagoreanTriplet.getB());
        Assert.assertEquals(Integer.valueOf(5), pythagoreanTriplet.getC());
    }
}