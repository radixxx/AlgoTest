package algorithms.sortings;

public class Insertion {

    public void sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            var current = array[i];
            var j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j]; // copy to right side
                j--;
            }
            array[j + 1] = current;
        }
    }
}
