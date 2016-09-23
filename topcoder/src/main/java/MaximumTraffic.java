import javafx.util.Pair;

import java.util.List;
import java.util.Map;

/**
 * MaximumTraffic
 * https://careercup.com/question?id=5695046734053376
 */
public class MaximumTraffic {
    public static List<Pair<Long, Long>> maximumTraffic(List<GraphNode<Long>> graph) {
        return null;
    }
}

class GraphNode<T> {
    T value;
    List<T> neighbors;

    public GraphNode(T value, List<T> neighbors) {
        this.value = value;
        this.neighbors = neighbors;
    }
}
