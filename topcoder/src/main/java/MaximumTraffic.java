import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MaximumTraffic
 * https://careercup.com/question?id=5695046734053376
 */
public class MaximumTraffic {
    private Map<Long, GraphNode<Long>> nodeLookup = new HashMap<>();

    private MaximumTraffic(List<GraphNode<Long>> graph) {
        for (GraphNode<Long> node : graph) {
            nodeLookup.put(node.value, node);
        }
    }

    public static List<Pair<Long, Long>> maximumTraffic(List<GraphNode<Long>> graph) {
        return null;
    }

    private GraphNode<Long> getNode(Long key) {
        return nodeLookup.get(key);
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
