package data_structure.graph;

import java.util.*;

public class GraphImpl {

    class Node {
        private String label;

        public Node(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
    }

    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Node>> adjacencyList = new HashMap<>();


    protected void addNode(String label) {
        var node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }


    public void addEdge(String from, String to) {
        var fromNode = nodes.get(from);
        if (fromNode == null) throw new IllegalArgumentException();

        var toNode = nodes.get(to);
        if (toNode == null) throw new IllegalStateException();

        adjacencyList.get(fromNode).add(toNode);
    }


    public void print() {
        for (var source : adjacencyList.keySet()) {
            var targets = adjacencyList.get(source);
            if (!targets.isEmpty()) System.out.println(source + " is connected to " + targets);
        }
    }

    public void remove(String label) {
        var node = nodes.get(label);
        if (node == null) return;

        for (var n : adjacencyList.keySet())
            adjacencyList.get(n).remove(node);

        adjacencyList.remove(node);
        nodes.remove(node);
    }


    public void removeEdge(String from, String to) {
        var fromNode = nodes.get(from);
        var toNode = nodes.get(to);

        if (from == null || to == null) return;

        adjacencyList.get(fromNode).remove(toNode);
    }


    public void traverseDepthFirst(String root) {
        var node = nodes.get(root);
        if (node == null) return;
        
        traverseDepthFirst(nodes.get(root), new HashSet<>());
    }

    private void traverseDepthFirst(Node root, Set<Node> visited) {
        System.out.println(root);
        visited.add(root);

        for (var node : adjacencyList.get(root)) {
            if (!visited.contains(node)) ;
            traverseDepthFirst(node, visited);
        }

    }

}
