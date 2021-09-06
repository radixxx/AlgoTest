package data_structure.graph;

public class Main {

    public static void main(String[] args) {

        var graph = new GraphImpl();

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");

        graph.print();

    }

}
