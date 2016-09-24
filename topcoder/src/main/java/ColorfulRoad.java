/**
 * ColorfulROad Problem from TopCoder
 * https://community.topcoder.com/stat?c=problem_statement&pm=12837
 */
public class ColorfulRoad {
    public int getMin(String road) {
        
    }

    private static char nextColor(char currentColor) {
        switch (currentColor) {
            case 'R':
                return 'G';
            case 'G':
                return 'B';
            case 'B':
                return 'R';
            default:
                throw new IllegalArgumentException();
        }
    }
}
