package data_structure.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    public void addEdge(String from, String to){
        var fromNode = nodes.get(from);
        if(fromNode == null) throw new IllegalArgumentException();

        var toNode = nodes.get(to);
        if(toNode == null) throw new IllegalStateException();

        adjacencyList.get(fromNode).add(toNode);
    }


    public void print(){
        for (var source: adjacencyList.keySet()) {
            var targets = adjacencyList.get(source);
            if(!targets.isEmpty()) System.out.println(source + "is connected to" + targets);
        }
    }


}
