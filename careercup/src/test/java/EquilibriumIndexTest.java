import org.junit.Assert;
import org.junit.Test;

/**
 * Test for EquilibriumIndex
 */
public class EquilibriumIndexTest {
    @Test
    public void equilibriumIndex() throws Exception {
        Assert.assertEquals(1, EquilibriumIndex.equilibriumIndex(new int[]{-1, 3, -4, 5, 1, -6, 2, 1}));
    }
}