import org.junit.Assert;
import org.junit.Test;

/**
 * Test for the MatrixPaths Problem
 */
public class MatrixPathsTest {
    private static final boolean O = true;
    private static final boolean X = false;
    boolean[][] map1 = new boolean[][]{
            {O, O, O},
            {O, O, O},
            {O, O, O}
    };

    boolean[][] map2 = new boolean[][]{
            {O, O, O},
            {O, X, O},
            {O, O, O}
    };
    boolean[][] map3 = new boolean[][]{
            {O, O, O, O},
            {O, O, O, O},
            {O, O, O, O},
            {O, O, O, O}
    };
    boolean[][] map4 = new boolean[][]{
            {O, O, O, O, X},
            {O, O, X, O, O},
            {X, O, O, O, O}
    };

    @Test
    public void numPaths() throws Exception {
        Assert.assertEquals(6, MatrixPaths.numPaths(map1));
        Assert.assertEquals(2, MatrixPaths.numPaths(map2));
        Assert.assertEquals(20, MatrixPaths.numPaths(map3));
        Assert.assertEquals(4, MatrixPaths.numPaths(map4));
    }
}