import java.util.List;

/**
 * BinaryTreeLists
 * <p>
 * Given a Binary Search Tree, find all possible lists which could have been used to construct it.
 */
public class BinaryTreeLists {
    public <T extends Comparable> List<T[]> getPossibleLists(BST<T> tree) {
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

    public Iterator<Node<T>> inOrderIterator() {
        return new InOrderIterator(this);
    }

    private class InOrderIterator implements Iterator<Node<T>> {
        Node<T> nextNode;

        public InOrderIterator(BST<T> tree) {
            nextNode = tree.root;
            if (nextNode != null) {
                nextNode = nextNode.first();
            }
        }

        @Override
        public boolean hasNext() {
            return nextNode != null;
        }

        @Override
        public Node<T> next() {
            Node<T> returnNode = nextNode;
            if (returnNode != null) {
                nextNode = returnNode.successor();
            }
            return returnNode;
        }
    }

    static class Node<T extends Comparable> {
        T value;
        Node<T> parent;
        Node<T> left;
        Node<T> right;

        public Node(T value) {
            this(value, null, null, null);
        }

        public Node(T value, Node<T> parent) {
            this(value, parent, null, null);
        }

        public Node(T value, Node<T> parent, Node<T> left, Node<T> right) {
            this.value = value;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        public void add(T value) {
            if (value.compareTo(this.value) < 0) {
                if (left != null) {
                    left.add(value);
                } else {
                    left = new Node<>(value, this);
                }
            } else {
                if (right != null) {
                    right.add(value);
                } else {
                    right = new Node<>(value, this);
                }
            }
        }

        public Node<T> first() {
            if (left != null) {
                return left.first();
            } else {
                return this;
            }
        }

        public Node<T> successor() {
            if (right != null) {
                return right.first();
            } else {
                return successorParent();
            }
        }

        private Node<T> successorParent() {
            if (parent != null) {
                if (parent.getRightChild() != this) {
                    return parent;
                } else {
                    return parent.successorParent();
                }
            }
            return null;
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