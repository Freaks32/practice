/**
 * MatrixPaths Problem
 * https://www.careercup.com/question?id=8248228
 * <p>
 * Given a MxN matrix, find the total number of possible paths from top-left to bottom-right element,
 * you can go rightwards and downwards only. Now, assume some of the entries in the matrix are blocked,
 * find the number of such paths. For example: For a 3X3 matrix, total number of paths is 6.
 * For second case, if we block entry (2,2), we have only 2 paths available.
 */
public class MatrixPaths {
    public static long numPaths(boolean[][] map) {
        if (map.length < 1 || map[0].length < 1) {
            throw new IllegalArgumentException("Map is Invalid");
        }

        // Map to count number of paths to a given point
        long[][] pathMap = new long[map.length][map[0].length];

        // Set up Boundary Conditions
        pathMap[0][0] = 1;
        int index = 1;
        while (index < map[0].length && map[0][index]) {
            pathMap[0][index] = pathMap[0][index - 1];
            index++;
        }
        index = 1;
        while (index < map.length && map[index][0]) {
            pathMap[index][0] = pathMap[index - 1][0];
            index++;
        }

        // Fill in Number of Paths
        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map[i].length; j++) {
                if (map[i][j]) {
                    pathMap[i][j] = pathMap[i - 1][j] + pathMap[i][j - 1];
                }
            }
        }

        return pathMap[pathMap.length - 1][pathMap[0].length - 1];
    }
}
