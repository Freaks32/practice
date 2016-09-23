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

    /**
     * Does a depth first search on a section of graph to calculate sum of all components (with backtracking to parent)
     *
     * @param node the node to act as the root of the dfs
     * @param parentKey key of the parent to prevent backtracking
     * @return the sum of all populations on the branch
     */
    private Long dfsSum(GraphNode<Long> node, Long parentKey) {
        Long treeTotal = node.value;
        for (Long neighborKey : node.neighbors) {
            if (!neighborKey.equals(parentKey)) {
                treeTotal += dfsSum(getNode(neighborKey), node.value);
            }
        }
        return treeTotal;
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
