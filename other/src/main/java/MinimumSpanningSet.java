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

    public static <T> List<Tuple<T>> minimumSpanningSet(List<Tuple<T>> inputRanges) {
        return null;
    }
}

class Tuple<T> {
    T left;
    T right;

    public Tuple(T left, T right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tuple<?> tuple = (Tuple<?>) o;

        if (left != null ? !left.equals(tuple.left) : tuple.left != null) return false;
        return right != null ? right.equals(tuple.right) : tuple.right == null;
    }

    @Override
    public int hashCode() {
        int result = left != null ? left.hashCode() : 0;
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }
}

class SpanningNode<T extends Comparable<T>> {
    SpanningNode<T> leftChild;
    SpanningNode<T> rightChild;

    T left;
    T right;

    public SpanningNode(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public void addNode(Tuple<T> elem) {
        // elem.left is less than left
        if (elem.left.compareTo(left) < 0) {
            if (leftChild == null) {
                leftChild = new SpanningNode<>(elem.left, elem.right);
            } else {
                leftChild.addNode(elem);
            }
        } else {
            if (rightChild == null) {
                rightChild = new SpanningNode<>(elem.left, elem.right);
            } else {
                rightChild.addNode(elem);
            }
        }
    }
}