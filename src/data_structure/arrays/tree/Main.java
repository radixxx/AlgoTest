package data_structure.arrays.tree;

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
        System.out.println("done");

        tree.traverseInOrder();
        tree.traversePostOrder();
        tree.height();

        System.out.println("Min: " + tree.min());

        var searchRes = tree.find(2);

        System.out.println(searchRes);
    }

}
