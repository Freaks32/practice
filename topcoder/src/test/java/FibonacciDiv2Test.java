import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Brian on 9/23/2016.
 */
public class FibonacciDiv2Test {
    FibonacciDiv2 fibonacciDiv2 = new FibonacciDiv2();

    @Test
    public void find() throws Exception {
        Assert.assertEquals(0, fibonacciDiv2.find(1));
        Assert.assertEquals(0, fibonacciDiv2.find(13));
        Assert.assertEquals(2, fibonacciDiv2.find(15));
        Assert.assertEquals(2, fibonacciDiv2.find(19));
        Assert.assertEquals(167960, fibonacciDiv2.find(1000000));
    }
}