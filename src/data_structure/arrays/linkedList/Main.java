package data_structure.arrays.linkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LinkedListImpl list = new LinkedListImpl();

        list.addFirst(50);
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.reverse();

        System.out.println(Arrays.toString(list.toArray()));

    }
}
