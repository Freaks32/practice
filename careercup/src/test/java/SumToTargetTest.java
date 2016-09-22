import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for SumToTarget Problem
 * https://careercup.com/question?id=5739394251096064
 */
public class SumToTargetTest {
    @Test
    public void sumToTarget() throws Exception {
        long[] list1 = new long[]{1L, 5L, 298L, 27L, 11L};
        long[] list2 = new long[]{492L, 28L, 5L, 17L};

        Assert.assertTrue(SumToTarget.sumToTarget(list1, list2, 10L));
        Assert.assertTrue(SumToTarget.sumToTarget(list1, list2, 790L));
        Assert.assertTrue(SumToTarget.sumToTarget(list1, list2, 18L));
        Assert.assertFalse(SumToTarget.sumToTarget(list1, list2, 492L));
        Assert.assertFalse(SumToTarget.sumToTarget(list1, list2, 753L));
    }
}