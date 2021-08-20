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


    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int first, int second) {
        var temp = items[first];

        items[first] = items[second];
        items[second] = temp;
    }

    private void bubbleUp() {
        var index = size - 1;
        while (index > 0 && items[index] > items[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private void bubleDown() {
        var index = 0;
        while (index <= size && !isValidParent(index)) {

            var largerChildIndex = largerChildIndex(index);
            swap(index, largerChildIndex);
            index = largerChildIndex;
        }
    }

    public int remove() {
        if (size == 0) throw new IllegalStateException();

        var root = items[0];
        items[0] = items[--size];
        bubleDown();
        return root;
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


    public void heapify(int[] array) {
        var lastParentIndex = array.length / 2 - 1;

        for (var i = lastParentIndex; i >=0; i--) {
            heapify(array, i);
        }
    }

    // TODO refacror !
    private void heapify(int[] array, int index) {
        var largerIndex = index;

        var leftIndex = index * 2 + 1;
        if (leftIndex < array.length &&
                array[leftIndex] > array[largerIndex])
            largerIndex = leftIndex;


        var rightIndex = index * 2 + 2;
        if (rightIndex < array.length &&
                array[rightIndex] > array[largerIndex])
            largerIndex = rightIndex;

        if (index == largerIndex) return;


        swap(array, index, largerIndex);
        heapify(array, largerIndex);
    }


    public void swap(int[] array, int first, int second) {
        var temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }



    @Override
    public String toString() {
        return "HeapImpl{" +
                "items=" + Arrays.toString(items) +
                ", size=" + size +
                '}';
    }
}
