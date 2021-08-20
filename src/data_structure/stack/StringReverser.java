package data_structure.stack;

import java.util.Stack;

public class StringReverser {

    public String reverser(String input){

        if(input == null) throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        for (var ch : input.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.empty()){
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }


}
