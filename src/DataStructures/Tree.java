package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private Node root;
    
    public Tree(String data) {
        root = new Node();
        root.data = data;
        root.children = new ArrayList<>();
    }
    
    private class Node {
        private String data;
        private Node parent;
        private List<Node> children;
    }
    
    /**
     * Returns the root node of the tree.
     * 
     * @return the root node.
     */
    public Node getRoot() {
        return root;
    }
}
