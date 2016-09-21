import java.util.List;

/**
 * Minimum Spanning Set
 * --------------------
 * Given a list of ranges (inclusive), find the minimum set of ranges which span the entirety of the input set.
 * For example, [(0,4),(5,6),(4,5),(7,10)] -> [(0,6),(7,10)]
 */
public class MinimumSpanningSet {
    public static void main(String[] args) {

    }

    public static List<Tuple<Integer>> minimumSpanningSet(List<Tuple<Integer>> inputRanges) {

    }
}

class Tuple<T> {
    T min;
    T max;

    public Tuple(T min, T max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tuple<?> tuple = (Tuple<?>) o;

        if (min != null ? !min.equals(tuple.min) : tuple.min != null) return false;
        return max != null ? max.equals(tuple.max) : tuple.max == null;
    }

    @Override
    public int hashCode() {
        int result = min != null ? min.hashCode() : 0;
        result = 31 * result + (max != null ? max.hashCode() : 0);
        return result;
    }
}