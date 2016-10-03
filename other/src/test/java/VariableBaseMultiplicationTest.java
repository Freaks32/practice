import org.junit.Assert;
import org.junit.Test;

/**
 * Test for Variable Base Multiplication
 */
public class VariableBaseMultiplicationTest {
    @Test
    public void multiply() throws Exception {
        Assert.assertEquals("122010", VariableBaseMultiplication.multiply("2110", "21", 3));
        Assert.assertEquals("11010111101", VariableBaseMultiplication.multiply("1000101", "11001", 2));
        Assert.assertEquals("23d1c3f72fd06", VariableBaseMultiplication.multiply("1fd8e82d", "11fede", 16));
    }
}