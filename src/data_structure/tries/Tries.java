package data_structure.tries;

public class Tries {

    public static int ALPHABETIC_SIZE = 26;

    private class Node{
        private char value;
        private Node[] children = new Node[ALPHABETIC_SIZE];
        private boolean isEndOfWord;


        public Node(char value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value=" + value +
                    '}';
        }
    }


    private Node root = new Node(' ');


}
