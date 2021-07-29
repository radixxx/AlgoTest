package data_structure.arrays.stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String str = "abcd";
        //reverse str
        Stack reverse = new Stack();

        var symbols = str.toCharArray();

        for (var symbol : symbols) {
            reverse.push(symbol);

            System.out.println(symbol);

        }

        System.out.println("--------");

        while (!reverse.empty()){
           var reversStr = String.valueOf(reverse.pop());

           System.out.println(reversStr);
        }


    }

}
