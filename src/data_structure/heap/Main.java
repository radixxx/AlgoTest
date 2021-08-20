package data_structure.heap;

import java.util.Arrays;

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

        int[] numbers = {5, 4, 7, 99, 1, 0};

        heap.heapify(numbers);

        System.out.println(heap.getKthLargest(numbers, 1));

        System.out.println(Arrays.toString(numbers));
    }

}
