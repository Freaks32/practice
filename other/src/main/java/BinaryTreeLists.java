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

class BST<T extends Comparable> {
    Node<T> root;

    public void add(T value) {
        if (root != null) {
            root.add(value);
        } else {
            root = new Node<>(value);
        }
    }

    class Node<T extends Comparable> {
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

        public void add(T value) {
            if (value.compareTo(this.value) < 0) {
                if (left != null) {
                    left.add(value);
                } else {
                    left = new Node<>(value);
                }
            } else {
                if (right != null) {
                    right.add(value);
                } else {
                    right = new Node<>(value);
                }
            }
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
}