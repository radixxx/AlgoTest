package data_structure.graph;

public class Main {

    public static void main(String[] args) {

        var graph = new GraphImpl();

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("A", "C");

        graph.print();
        graph.traverseDepthFirst("A");

        System.out.println("-------");
        graph.traverseBreadthFirst("C");
        var res = graph.isCycle();

        System.out.println(res);
    }

}
