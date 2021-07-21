package data_structure.arrays.linkedList;

public class Main {

    public static void main(String[] args) {

        var list = new LinkedListImpl();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.addFirst(50);

        list.indexOf(20);

        System.out.println(list);

    }
}
