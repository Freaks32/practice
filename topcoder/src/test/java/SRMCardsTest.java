import org.junit.Assert;
import org.junit.Test;

/**
 * Test for SRMCards Problem from TopCoder
 */
public class SRMCardsTest {
    SRMCards srmCards = new SRMCards();

    @Test
    public void maxTurns() throws Exception {
        Assert.assertEquals(1, srmCards.maxTurns(new int[]{498, 499}));
        Assert.assertEquals(4, srmCards.maxTurns(new int[]{491, 492, 495, 497, 498, 499}));
        Assert.assertEquals(4, srmCards.maxTurns(new int[]{100, 200, 300, 400}));
        Assert.assertEquals(6, srmCards.maxTurns(new int[]{11, 12, 102, 13, 100, 101, 99, 9, 8, 1}));
        Assert.assertEquals(4, srmCards.maxTurns(new int[]{118, 321, 322, 119, 120, 320}));
        Assert.assertEquals(7, srmCards.maxTurns(new int[]{10, 11, 12, 13, 14, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
}