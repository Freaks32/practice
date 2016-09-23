import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Test for MaximumTraffic Problem
 */
public class MaximumTrafficTest {
    private List<GraphNode<Long>> buildTestGraph() {
        return Arrays.asList(
                new GraphNode<>(1L, Arrays.asList(5L)),
                new GraphNode<>(2L, Arrays.asList(5L)),
                new GraphNode<>(3L, Arrays.asList(5L)),
                new GraphNode<>(4L, Arrays.asList(5L)),
                new GraphNode<>(5L, Arrays.asList(1L, 2L, 3L, 4L))
        );
    }

    @Test
    public void maximumTraffic() throws Exception {
        List<GraphNode<Long>> graph = buildTestGraph();
        List<Pair<Long, Long>> expectedResult = Arrays.asList(
                new Pair<>(1L, 14L),
                new Pair<>(2L, 13L),
                new Pair<>(3L, 12L),
                new Pair<>(4L, 11L),
                new Pair<>(5L, 4L)
        );

        List<Pair<Long, Long>> result = MaximumTraffic.maximumTraffic(graph);

        Assert.assertEquals(expectedResult, result);
    }
}