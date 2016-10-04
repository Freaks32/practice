import java.util.List;

/**
 * https://careercup.com/question?id=6002346992599040
 * <p>
 * Implement Method
 * Lìst<Range> getRanges(Lìst<Shard> shards, Lìst<Key> keys)
 * <p>
 * That returns list of ranges. Each range represents multiple keys aggregated over a shard:
 * n-keys —> 1-shard —> l-range
 * <p>
 * Method should return no more than 1 range per shard that spans all keys or their parts belonging to this shard.
 * <p>
 * Each of the ‘Range` , 'Shard’ and ‘Key’ classes have ‘end’ and ‘start’ fields of int type, where ‘start’ is inclusive and ‘end’ is exclusive.
 * <p>
 * Example:
 * <p>
 * 1—9, 12—59, 100—999 <— shards (input)
 * 2—3, 6—8, 11—20, 200—220 <— keys (input)
 * 2—8, 12—20, 200—220 <— ranges (output)
 */
public class Ranges {
    public static List<ImmutableRange> getRanges
            (List<ImmutableRange> shards, List<ImmutableRange> keys) {
        return null;
    }
}

/**
 * Holds a immutable Range (left bound & right bound)
 */
class ImmutableRange {
    private final long leftBound;
    private final long rightBound;

    public ImmutableRange(long leftBound, long rightBound) {
        this.leftBound = leftBound;
        this.rightBound = rightBound;
    }

    public long getLeftBound() {
        return leftBound;
    }

    public long getRightBound() {
        return rightBound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImmutableRange that = (ImmutableRange) o;

        if (leftBound != that.leftBound) return false;
        return rightBound == that.rightBound;

    }

    @Override
    public int hashCode() {
        int result = (int) (leftBound ^ (leftBound >>> 32));
        result = 31 * result + (int) (rightBound ^ (rightBound >>> 32));
        return result;
    }
}