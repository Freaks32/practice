import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ATaleOfThreeCities
 * https://community.topcoder.com/stat?c=problem_statement&pm=3543
 */
public class ATaleOfThreeCities {
    public static double connect(int[] ax, int[] ay, int[] bx, int[] by, int[] cx, int[] cy) {
        // Attempt to connect A to B or C
        double minAB = Double.MAX_VALUE;
        double minAC = Double.MAX_VALUE;
        for (int ia = 0; ia < ax.length; ia++) {
            for (int ib = 0; ib < bx.length; ib++) {
                double distance = getDistance(ax[ia], ay[ia], bx[ib], by[ib]);
                if (distance < minAB) {
                    minAB = distance;
                }
            }

            for (int ic = 0; ic < cx.length; ic++) {
                double distance = getDistance(ax[ia], ay[ia], cx[ic], cy[ic]);
                if (distance < minAC) {
                    minAC = distance;
                }
            }
        }

        double minBC = Double.MAX_VALUE;
        for (int ib = 0; ib < bx.length; ib++) {
            for (int ic = 0; ic < cx.length; ic++) {
                double distance = getDistance(bx[ib], by[ib], cx[ic], cy[ic]);
                if (distance < minBC) {
                    minBC = distance;
                }
            }
        }

        List<Double> distances = Arrays.asList(minAB, minAC, minBC);
        Collections.sort(distances);
        return distances.get(0) + distances.get(1);
        return 0D;
    }

    private static double getDistance(int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x1 - x2);
        int dy = Math.abs(y1 - y2);
        return Math.sqrt(dx * dx + dy * dy);
    }
}
