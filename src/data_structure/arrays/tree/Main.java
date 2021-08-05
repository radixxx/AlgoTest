package data_structure.arrays.tree;

public class Main {
    public static void main(String[] args) {

        TreeImpl tree = new TreeImpl();

        tree.insert(7);
        tree.insert(2);
        tree.insert(9);
        tree.insert(10);
        tree.insert(12); // ! error

        System.out.println("done");

    }

}
