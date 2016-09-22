import java.util.HashSet;
import java.util.Set;

/**
 * Solution for https://careercup.com/question?id=5739394251096064
 * --
 * Given two integer arrays list1 and list2 and an int target value.
 * WAP to check if there exists such a sum, where one number taken
 * from list1 and other from list2 to add up to become the target value.
 * Return true if so, else return false.
 */
public class SumToTarget {
    /**
     * Searches if a pair of elements (one from list1, one from list2) adds to the target value.
     * <p>
     * Runtime: O(n)
     * Space: O(n)
     *
     * @param list1  list of elements
     * @param list2  list of elements
     * @param target target sum value
     * @return true if pair exists, false otherwise
     */
    public static boolean sumToTarget(long[] list1, long[] list2, long target) {
        // Add all elems of list2 to a Set
        Set<Long> list2Set = new HashSet<>();
        for (long elem : list2) {
            list2Set.add(elem);
        }

        // Iterate through list1, check for matching pair in list2
        for (long elem : list1) {
            if (list2Set.contains(target - elem)) {
                return true;
            }
        }
        return false;
    }
}
