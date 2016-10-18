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

    private static class LampGridHelper {
        private final int N;
        private final boolean[] x;
        private final boolean[] y;
        private final boolean[] diag1;
        private final boolean[] diag2;

        public LampGridHelper(int N, Coord[] lamps) {
            this.N = N;
            this.x = new boolean[N];
            this.y = new boolean[N];
            this.diag1 = new boolean[(2 * N) - 1];
            this.diag2 = new boolean[(2 * N) - 1];

            for (Coord lampCoord : lamps) {
                addLamp(lampCoord);
            }
        }

        private int diag1Transform(Coord in) {
            return (in.getX() - in.getY()) + (N - 1);
        }

        private int diag2Transform(Coord in) {
            return (in.getX() + in.getY());
        }

        private void addLamp(Coord lampCoord) {
            x[lampCoord.getX()] = true;
            y[lampCoord.getY()] = true;
            diag1[diag1Transform(lampCoord)] = true;
            diag2[diag2Transform(lampCoord)] = true;
        }

        public boolean isCoordinateLit(Coord input) {
            return x[input.getX()] || y[input.getY()] ||
                    diag1[diag1Transform(input)] || diag2[diag2Transform(input)];
        }
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
