import java.util.Iterator;
import java.util.List;

/**
 * Flatten Nested List Iterator
 * https://leetcode.com/problems/flatten-nested-list-iterator/
 * <p>
 * Given a nested list of integers, implement an iterator to flatten it.
 * <p>
 * Each element is either an integer, or a list -- whose elements may also be integers or other lists.
 * <p>
 * Example 1:
 * Given the list [[1,1],2,[1,1]],
 * <p>
 * By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].
 * <p>
 * Example 2:
 * Given the list [1,[4,[6]]],
 * <p>
 * By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].
 */
class NestedIterator implements Iterator<Integer> {
    NestedIterator subIterator;
    int index;
    List<NestedInteger> nestedList;

    public NestedIterator(List<NestedInteger> nestedList) {
        this.index = 0;
        this.nestedList = nestedList;
    }

    @Override
    public Integer next() {
        if (subIterator != null) {
            if (subIterator.hasNext()) {
                return subIterator.next();
            } else {
                subIterator = null;
            }
        }

        NestedInteger value = nestedList.get(index++);
        if (value.isInteger()) {
            return value.getInteger();
        } else {
            subIterator = new NestedIterator(value.getList());
            return next();
        }
    }

    @Override
    public boolean hasNext() {
        // If there is a subiterator present or haven't finished iterating on list
        return (subIterator != null && subIterator.hasNext()) || index < nestedList.size();
    }
}

interface NestedInteger {

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}

class NestedInt implements NestedInteger {
    Integer value;

    public NestedInt(Integer value) {
        this.value = value;
    }

    @Override
    public boolean isInteger() {
        return true;
    }

    @Override
    public Integer getInteger() {
        return value;
    }

    @Override
    public List<NestedInteger> getList() {
        return null;
    }
}

class NestedList implements NestedInteger {
    List<NestedInteger> value;

    public NestedList(List<NestedInteger> value) {
        this.value = value;
    }

    @Override
    public boolean isInteger() {
        return false;
    }

    @Override
    public Integer getInteger() {
        return null;
    }

    @Override
    public List<NestedInteger> getList() {
        return value;
    }
}