package data_structure.heap;

import java.util.Arrays;

public class HeapImpl {

    private int[] items = new int[10];
    private int size;


    public void insert(int value) {
        if (size > items.length) throw new IllegalStateException();
        items[size++] = value;

        bubbleUp();
    }

    public void bubbleUp() {
        var index = size - 1;
        while (index > 0 && items[index] > items[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int first, int second) {
        var temp = items[first];

        items[first] = items[second];
        items[second] = temp;
    }

    public void remove() {
        if (size == 0) throw new IllegalStateException();

        items[0] = items[--size];

        var index = 0;
        while (index <= size && !isValidParent(index)) {

            var largerChildIndex = largerChildIndex(index);

            swap(index, largerChildIndex);
            index = largerChildIndex;
        }
    }


    private int largerChildIndex(int index) {
        return (
                leftChildINdex(index) > rightChild(index) ?
                        leftChildINdex(index) :
                        rightChildINdex(index)
        );
    }

    private boolean isValidParent(int index) {
        return items[index] >= leftChild(index) &&
                items[index] >= rightChild(index);
    }

    private int leftChild(int index) {
        return items[leftChildINdex(index)];
    }

    private int rightChild(int index) {
        return items[rightChildINdex(index)];
    }

    private int leftChildINdex(int index) {
        return index * 2 + 1;
    }

    private int rightChildINdex(int index) {
        return index * 2 + 2;
    }


    @Override
    public String toString() {
        return "HeapImpl{" +
                "items=" + Arrays.toString(items) +
                ", size=" + size +
                '}';
    }
}
