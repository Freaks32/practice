/**
 * LampGrid
 * https://careercup.com/question?id=5759602621677568
 * <p>
 * <p>
 * Given an NxN grid with an array of lamp coordinates.
 * Each lamp provides illumination to every square on their x axis,
 * every square on their y axis, and every square that lies in their
 * diagonal (think of a Queen in chess).
 * <p>
 * Given an array of query coordinates,
 * determine whether that point is illuminated or not.
 * The catch is when checking a query all lamps adjacent to, or on,…
 */
public class LampGrid {
    public static boolean[] squaresLit(int N, Coord[] lamps, Coord[] locations) {
        return null;
    }
}

class Coord {
    private final int x;
    private final int y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
