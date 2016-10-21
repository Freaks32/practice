import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Test for FlattenNestedListIterator Problem
 */
public class FlattenNestedListIteratorTest {
    @Test
    public void test() throws Exception {
        List<NestedInteger> list = new ArrayList<>();

        List<NestedInteger> innerList1 = new ArrayList<>();
        innerList1.add(new NestedInt(1));
        innerList1.add(new NestedInt(1));

        list.add(new NestedList(innerList1));
        list.add(new NestedInt(2));

        List<NestedInteger> innerList2 = new ArrayList<>();
        innerList2.add(new NestedInt(1));
        innerList2.add(new NestedInt(1));

        list.add(new NestedList(innerList2));

        NestedIterator nestedIterator = new NestedIterator(list);
        List<Integer> expected = Arrays.asList(1, 1, 2, 1, 1);
        List<Integer> actual = new ArrayList<>();
        while (nestedIterator.hasNext()) {
            actual.add(nestedIterator.next());
        }
        Assert.assertEquals(expected, actual);

        list = new ArrayList<>();
        list.add(new NestedInt(1));

        innerList1 = new ArrayList<>();
        innerList1.add(new NestedInt(4));

        innerList2 = new ArrayList<>();
        innerList2.add(new NestedInt(6));

        innerList1.add(new NestedList(innerList2));

        list.add(new NestedList(innerList1));
        nestedIterator = new NestedIterator(list);
        expected = Arrays.asList(1, 4, 6);
        actual = new ArrayList<>();
        while (nestedIterator.hasNext()) {
            actual.add(nestedIterator.next());
        }
        Assert.assertEquals(expected, actual);
    }
}