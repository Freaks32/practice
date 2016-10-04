import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

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
        List<ImmutableRange> ranges = new ArrayList<>();

        PriorityQueue<ImmutableRange> shardList =
                new PriorityQueue<>(10, new RangeComparator());
        PriorityQueue<ImmutableRange> keyList =
                new PriorityQueue<>(10, new RangeComparator());
        for (ImmutableRange range : shards) {
            shardList.add(range);
        }
        for (ImmutableRange range : keys) {
            keyList.add(range);
        }

        ImmutableRange shard = shardList.poll();
        ImmutableRange key = keyList.poll();
        while (shard != null) {
            // Throw out keys before current shard
            while (key.getRightBound() < shard.getLeftBound()) {
                key = keyList.poll();
            }

            // If key overlaps this shard, we should output a range
            if (key.getLeftBound() < shard.getRightBound()) {
                // Calculate current range start and find end
                long leftBound = Math.max(key.getLeftBound(), shard.getLeftBound());
                long rightBound = Math.min(key.getRightBound(), shard.getRightBound());

                while (key != null && key.getLeftBound() < shard.getRightBound()) {
                    rightBound = Math.min(shard.getRightBound(),
                            Math.max(rightBound, key.getRightBound()));
                    key = keyList.poll();
                }

                ranges.add(new ImmutableRange(leftBound, rightBound));
            }

            shard = shardList.poll();
        }

        return ranges;
    }

    private static class RangeComparator implements Comparator<ImmutableRange> {
        @Override
        public int compare(ImmutableRange o1, ImmutableRange o2) {
            if (o1.getLeftBound() < o2.getLeftBound()) {
                return -1;
            } else if (o1.getLeftBound() > o2.getLeftBound()) {
                return 1;
            } else {
                return 0;
            }
        }
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