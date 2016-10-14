import java.util.LinkedList;
import java.util.Queue;

/**
 * GuardDistance
 * https://careercup.com/question?id=4716965625069568
 * <p>
 * Given a 2-D matrix represents the room, obstacle and guard like
 * the following (0 is room, B->obstacle, G-> Guard):
 * 0 0 0
 * B G G
 * B 0 0
 * <p>
 * calculate the steps from a room to nearest Guard
 * and set the matrix, like this
 * 2 1 1
 * B G G
 * B 1 1
 * Write the algorithm, with optimal solution.
 */
public class GuardDistance {
    public static final int OBSTACLE = -2;
    public static final int GUARD = -1;
    public static final int UNMARKED = 0;

    /**
     * Assume input array can be modified
     * <p>
     * Do BFS starting from all Guard positions to determine distance to each
     * point from closest guard. Because we use BFS, the first time a square
     * is encountered is the distance from the closest guard
     */
    public static int[][] minGuardDistances(int[][] array) {
        return new GuardDistanceHelper(array).minGuardDistances();
    }

    private static class GuardDistanceHelper {
        private final Queue<Position> positionQueue = new LinkedList<>();
        private final int[][] map;

        public GuardDistanceHelper(int[][] map) {
            this.map = map;
        }

        public int[][] minGuardDistances() {
            initGuardQueue();

            while (!positionQueue.isEmpty()) {
                Position pos = positionQueue.poll();
                int x = pos.getX();
                int y = pos.getY();
                int nextDistance = map[x][y] + 1;
                if (map[x][y] == GUARD) {
                    nextDistance = 1;
                }
                touchPosition(x - 1, y, nextDistance);
                touchPosition(x + 1, y, nextDistance);
                touchPosition(x, y - 1, nextDistance);
                touchPosition(x, y + 1, nextDistance);
            }

            return map;
        }

        private void touchPosition(int x, int y, int distance) {
            if (boundsCheck(x, y) && map[x][y] == UNMARKED) {
                map[x][y] = distance;
                positionQueue.add(new Position(x, y));
            }
        }

        private boolean boundsCheck(int x, int y) {
            if (x >= 0 && x < map.length && y >= 0 && y < map[x].length) {
                return true;
            }
            return false;
        }

        private void initGuardQueue() {
            if (positionQueue.size() != 0) {
                throw new IllegalArgumentException("Position Queue already Initialized");
            }
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    if (map[i][j] == GUARD) {
                        positionQueue.add(new Position(i, j));
                    }
                }
            }
        }
    }

    private static class Position {
        private final int x;
        private final int y;

        public Position(int x, int y) {
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
}
