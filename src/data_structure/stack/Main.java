package data_structure.stack;

public class Main {

    public static void main(String[] args) {

        StringReverser stringReverser = new StringReverser();

       var result = stringReverser.reverser("abcd");

        System.out.println(result);

        StackImpl stack = new StackImpl();
        stack.push(10);
        stack.push(20);
        stack.push(40);

        stack.pop();
        stack.peek();

        System.out.println(stack);
    }

}
