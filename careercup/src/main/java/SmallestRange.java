import java.util.List;

/**
 * SmallestRange
 * https://careercup.com/question?id=16759664
 * <p>
 * You have k lists of sorted integers. Find the smallest range that includes at least one number from each of the k lists.
 * <p>
 * For example,
 * List 1: [4, 10, 15, 24, 26]
 * List 2: [0, 9, 12, 20]
 * List 3: [5, 18, 22, 30]
 * <p>
 * The smallest range here would be [20, 24] as it contains 24 from list 1, 20 from list 2, and 22 from list 3.
 */
public class SmallestRange {
    public static Range<Integer> smallestRange(List<List<Integer>> lists) {
        return null;
    }
}

class Range<T> {
    private final T start;
    private final T end;

    public Range(T start, T end) {
        this.start = start;
        this.end = end;
    }

    public T getStart() {
        return start;
    }

    public T getEnd() {
        return end;
    }
}
