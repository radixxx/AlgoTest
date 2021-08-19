package data_structure.tree;

public class Main {
    public static void main(String[] args) {

        TreeImpl tree = new TreeImpl();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        tree.traverseInOrder();
        System.out.println("------");
        tree.traversePostOrder();
        tree.height();
        System.out.println("Min: " + tree.min());
        var searchRes = tree.find(2);
        System.out.println(searchRes);
        System.out.println("------");
        var list = tree.printNodeAtDistance(2);
        for (var item : list) {
            System.out.println(item);
        }

    }

}
