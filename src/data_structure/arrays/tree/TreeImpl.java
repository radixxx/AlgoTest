package data_structure.arrays.tree;

public class TreeImpl {

    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;


    public void insert(int value) {
        var node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        var current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }

        }

    }


    public boolean find(int value) {
        var current = root;

        while (current != null) {
            if (value < current.value) {
                current = current.leftChild;
            } else if (value > current.value) {
                current = current.rightChild;
            } else
                return true;
        }
        return false;
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        if (root == null)
            return;

        System.out.println(root.value);
        traverseInOrder(root.leftChild);
        traverseInOrder(root.rightChild);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        if (root == null)
            return;

        traverseInOrder(root.leftChild);
        traverseInOrder(root.rightChild);
        System.out.println(root.value);

    }

    public void height() {
        height(root);
    }

    private int height(Node root) {
        if (root == null) {
            return -1;
        }

        if (root.leftChild == null && root.rightChild == null) {
            return 0;
        }

        return 1 + Math.max(
                height(root.leftChild),
                height(root.rightChild));
    }

    public int min() {
        return min(root);
    }

    private int min(Node root) {

        if (root.leftChild == null && root.rightChild == null) {
            return root.value;
        }

        var left = min(root.leftChild);
        var right = min(root.rightChild);

        return Math.min(Math.min(left, right), root.value);

    }

    //TODO:
    //height()
    //min()

}
