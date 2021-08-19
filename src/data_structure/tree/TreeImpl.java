package data_structure.tree;

import java.util.ArrayList;

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


    // equals of two tree's ?
    public boolean equals(TreeImpl other) {
        if(other == null) return false;

        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null) {
            return true;
        }

        if (first != null && second != null) {
            return first.value == second.value
                    && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);
        }

        return false;
    }


    public ArrayList<Integer> printNodeAtDistance(int distance){
        var list = new ArrayList<Integer>();
        printNodeAtDistance(root, distance, list);
        return list;
    }


    private void printNodeAtDistance(Node root, int distance, ArrayList<Integer> list){
        if(distance == 0){
            list.add(root.value);
            System.out.println(root.value);
            return;
        }

        if(root == null){
            return;
        }

        printNodeAtDistance(root.leftChild, distance - 1, list);
        printNodeAtDistance(root.rightChild, distance - 1, list);
    }
/*
    public void traverseLevelOrder(){
        for(var i = 0; i <= height(); i++){
            for(var i : printNodeAtDistance(i))
                System.out.println(value);
        }
    }*/

}
