import java.util.List;

/**
 * BinaryTreeLists
 * <p>
 * Given a Binary Search Tree, find all possible lists which could have been used to construct it.
 */
public class BinaryTreeLists {
    public <T> List<T[]> getPossibleLists(Node<T> tree) {
        return null;
    }
}

class Node<T> {
    T value;
    Node<T> left;
    Node<T> right;

    public Node(T value) {
        this(value, null, null);
    }

    public Node(T value, Node<T> left, Node<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getLeftChild() {
        return left;
    }

    public Node<T> getRightChild() {
        return right;
    }
}