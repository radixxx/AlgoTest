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

    // 'обход в глубину'
    private void traverseDepthFirst(Node root, Set<Node> visited) {
        System.out.println(root);
        visited.add(root);

        for (var node : adjacencyList.get(root)) {
            if (!visited.contains(node)) ;
            traverseDepthFirst(node, visited);
        }
    }

    // 'обход в ширину'
    public void traverseBreadthFirst(String root) {
        var node = nodes.get(root);
        if (node == null) return;

        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            var current = queue.remove();
            if (visited.contains(current)) continue;

            System.out.println(current);

            visited.add(current);
            for (var neighbour : adjacencyList.get(current)) {
                if (!visited.contains(neighbour))
                    queue.add(neighbour);
            }
        }
    }


    public boolean isCycle() {
        Set<Node> all = new HashSet<>();
        all.addAll(nodes.values());
        Set<Node> visiting = new HashSet<>();
        Set<Node> visited = new HashSet<>();

        while (!all.isEmpty()) {
            var current = all.iterator().next(); //toArray(new Node[0])[0]
            if (isCycle(current, all, visiting, visited)) return true;
        }

        return false;
    }


    private boolean isCycle(Node node, Set<Node> all, Set<Node> visiting, Set<Node> visited) {
        all.remove(node);
        visiting.add(node);

        for (var neighbour : adjacencyList.get(node)) {
            if (visited.contains(neighbour)) continue;

            if (visiting.contains(neighbour)) return true;

            if (isCycle(neighbour, all, visiting, visited)) return true;
        }

        visiting.remove(node);
        visited.add(node);

        return false;

    }

}
