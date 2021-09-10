package data_structure.graphUndirected;

public class Main {

    public static void main(String[] args) {

        var graph = new WeightedGraph();

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A", "B", 3);
        graph.addEdge("B", "C", 5);
        graph.addEdge("A", "C", 13);


       var result = graph.getShortestDistance("C", "B");

        graph.print();

    }

}
