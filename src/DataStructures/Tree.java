package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class Tree<T extends Comparable<?>> {

    private Node root;
    private int height;

    public Tree(T data) {
        root = new Node(data);
        height = 1;
    }

    public class Node<T extends Comparable<?>> {
        private T data;
        private Node<T> parent;
        private List<Node> children;

        public Node(T data) {
            this(data, null);
        }

        public Node(T data, Node parent) {
            this.data = data;
            this.parent = parent;
            children = new ArrayList<>();
        }

        public Node addChild(T data) {
            return addChild(new Node(data, this));
        }

        public Node addChild(Node<T> child) {
            children.add(child);

            return this;
        }
    }

    public Node getRoot() {
        return root;
    }

    public Tree addTree(Tree<T> subTree) {
        root.addChild(subTree.getRoot());
        height += subTree.getHeight();
        return this;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "";
    }
}
