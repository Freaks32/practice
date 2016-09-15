import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Problem Statement for ATaleOfThreeCities
 * <p>
 * <p>
 * Problem Statement
 * As a result of ever increasing traffic jams, subway transportation in big cities has become a must. A train can actually take you from your home to your office faster than a car can. But what happens if you have your office in another city? In this problem we consider three different cities: A, B and C. Each of these cities has its own subway transportation system and you can go from a station to any other in the same city without having to leave the underground. A big project is now underway, and the goal is to merge the subway lines such that transportation between these cities becomes available soon. In order to achieve this, it was decided that two tunnels would be constructed, each of them connecting two subway stations in two different cities. This has to be done at a minimal cost, so it is important which subway stations are chosen. Also consider that the only factor in determining the cost is the distance between the two subway stations connected by a tunnel.
 * <p>
 * <p>
 * <p>
 * You will be given a int[] ax, a int[] ay, a int[] bx, a int[] by, a int[] cx and a int[] cy with the following signification:
 * <p>
 * ax and ay represent the coordinates of the subway stations in city A i.e (ax[i],ay[i]) is the point denoting the place of the i-th station
 * <p>
 * bx and by represent the coordinates of the subway stations in city B i.e (bx[i],by[i]) is the point denoting the place of the i-th station
 * <p>
 * cx and cy represent the coordinates of the subway stations in city C i.e (cx[i],cy[i]) is the point denoting the place of the i-th station
 * <p>
 * <p>
 * <p>
 * Return the minimal added distance of the two tunnels such that all three cities become connected.
 * <p>
 * Definition
 * <p>
 * Class:	ATaleOfThreeCities
 * Method:	connect
 * Parameters:	int[], int[], int[], int[], int[], int[]
 * Returns:	double
 * Method signature:	double connect(int[] ax, int[] ay, int[] bx, int[] by, int[] cx, int[] cy)
 * (be sure your method is public)
 * <p>
 * <p>
 * Notes
 * -	Your return value must have an absolute or relative error less than 1e-9.
 * <p>
 * Constraints
 * -	ax, ay, bx, by, cx, and cy will each contain between 2 and 50 elements, inclusive.
 * -	Each element of ax, ay, bx, by, cx, and cy is between -100 and 100, inclusive.
 * -	The number of elements in ax is equal to the number of elements in ay.
 * -	The number of elements in bx is equal to the number of elements in by.
 * -	The number of elements in cx is equal to the number of elements in cy.
 * -	There are no subway stations with identical coordinates.
 * <p>
 * Examples
 * 0)
 * <p>
 * {0,0,0}
 * {0,1,2}
 * {2,3}
 * {1,1}
 * {1,5}
 * {3,28}
 * Returns: 3.414213562373095
 * The tunnel connecting the subway station in city A at (0,2) with the subway station in city C at (1,3) has a length of about 1.41 and the tunnel connecting the subway station in city A at (0,1) with the subway station in city B at (2,1) has a length of 2.
 * 1)
 * <p>
 * {-2,-1,0,1,2}
 * {0,0,0,0,0}
 * {-2,-1,0,1,2}
 * {1,1,1,1,1}
 * {-2,-1,0,1,2}
 * {2,2,2,2,2}
 * Returns: 2.0
 * 2)
 * <p>
 * {4,5,11,21,8,10,3,9,5,6}
 * {12,8,9,12,2,3,5,7,10,13}
 * {34,35,36,41,32,39,41,37,39,50}
 * {51,33,41,45,48,22,33,51,41,40}
 * {86,75,78,81,89,77,83,88,99,77}
 * {10,20,30,40,50,60,70,80,90,100}
 * Returns: 50.323397776611024
 */
public class ATaleOfThreeCities {
    public static double connect(int[] ax, int[] ay, int[] bx, int[] by, int[] cx, int[] cy) {
        return 0D;
    }
}
