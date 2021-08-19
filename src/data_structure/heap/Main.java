package data_structure.heap;

public class Main {
    public static void main(String[] args) {
        var heap = new HeapImpl();

        heap.insert(10);
        heap.insert(5);
        heap.insert(17);
        heap.insert(4);
        heap.insert(22);

        heap.remove();
        var res = heap;

        System.out.println(res);
    }

}
