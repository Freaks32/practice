import org.junit.Assert;
import org.junit.Test;

/**
 * Test for LampGrid Problem
 */
public class LampGridTest {
    @Test
    public void squaresLit() throws Exception {
        Assert.assertArrayEquals(new boolean[]{true, true, true, true},
                LampGrid.squaresLit(2,
                        new Coord[]{new Coord(0, 0)},
                        new Coord[]{
                                new Coord(0, 0),
                                new Coord(1, 0),
                                new Coord(0, 1),
                                new Coord(1, 1)
                        }
                )
        );

        Assert.assertArrayEquals(new boolean[]{false, false, false, false},
                LampGrid.squaresLit(2,
                        new Coord[]{},
                        new Coord[]{
                                new Coord(0, 0),
                                new Coord(1, 0),
                                new Coord(0, 1),
                                new Coord(1, 1)
                        }
                )
        );

        Assert.assertArrayEquals(new boolean[]{true, false, true,
                        false, true, true, true, true, true},
                LampGrid.squaresLit(3,
                        new Coord[]{new Coord(2, 2)},
                        new Coord[]{
                                new Coord(0, 0),
                                new Coord(1, 0),
                                new Coord(2, 0),
                                new Coord(0, 1),
                                new Coord(1, 1),
                                new Coord(2, 1),
                                new Coord(0, 2),
                                new Coord(1, 2),
                                new Coord(2, 2),
                        }
                )
        );
        
        Assert.assertArrayEquals(new boolean[]{true, true, true,
                        true, true, true, true, true, true},
                LampGrid.squaresLit(3,
                        new Coord[]{new Coord(0, 0), new Coord(2, 2)},
                        new Coord[]{
                                new Coord(0, 0),
                                new Coord(1, 0),
                                new Coord(2, 0),
                                new Coord(0, 1),
                                new Coord(1, 1),
                                new Coord(2, 1),
                                new Coord(0, 2),
                                new Coord(1, 2),
                                new Coord(2, 2),
                        }
                )
        );
    }
}