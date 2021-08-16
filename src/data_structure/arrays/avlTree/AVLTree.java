package data_structure.arrays.avlTree;

public class AVLTree {

    private class AVLNode {
        private int height;
        private int value;
        private AVLNode leftChild;
        private AVLNode rightChild;

        public AVLNode(int value) {
            this.value = value;
        }
    }

    private AVLNode root;


    public void insert(int value) {
        root = insert(root, value);
    }

    private AVLNode insert(AVLNode root, int value) {
        if (root == null) {
            return new AVLNode(value);
        }

        if (value < root.value) {
            root.leftChild = insert(root.leftChild, value);
        } else
            root.rightChild = insert(root.rightChild, value);


        root.height = Math.max(
                height(root.leftChild),
                height(root.rightChild)) + 1;

        return balance(root);
    }


    private AVLNode balance(AVLNode root) {
        var balanceFactor = balanceFactor(root);

        if (balanceFactor > 1) {
            if (balanceFactor(root.leftChild) < 0) {
                System.out.println("Left rotate: " + root.leftChild.value);
                root.leftChild = rotateLeft(root.leftChild);
            }
            System.out.println("Right rotate: " + root.value);
            return rotateRight(root);
        } else if (balanceFactor < -1) {
            if (balanceFactor(root.rightChild) > 0) {
                System.out.println("Right rotate: " + root.rightChild.value);
                root.rightChild = rotateRight(root.rightChild);
            }
            System.out.println("Left rotate: " + root.value);
            return rotateLeft(root);
        }
        return root;
    }


    private int balanceFactor(AVLNode node) {
        return (node == null) ? 0 : height(node.leftChild) - height(node.rightChild);
    }

    private int height(AVLNode node) {
        return (node == null) ? -1 : node.height;
    }

    private AVLNode rotateLeft(AVLNode root) {
        var newRoot = root.rightChild;

        root.rightChild = newRoot.leftChild;
        newRoot.leftChild = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private AVLNode rotateRight(AVLNode root) {
        var newRoot = root.leftChild;

        root.leftChild = newRoot.rightChild;
        newRoot.rightChild = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private void setHeight(AVLNode node) {
        node.height = Math.max(
                height(root.leftChild),
                height(root.rightChild)) + 1;
    }

}
