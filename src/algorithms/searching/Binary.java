package algorithms.searching;

public class Binary {


    public int binarySearchRec(int[] array, int target) {
        return binarySearch(array, target, 0, array.length - 1);
    }

    private int binarySearch(int[] array, int target, int left, int right) {

        if (right < left) {
            return -1;
        }

        int middle = left + right / 2;
        if (array[middle] == target) {
            return middle;
        }

        if (target < array[middle])
            return binarySearch(array, target, left, middle - 1);

        return binarySearch(array, target, middle + 1, right);
    }

    public int binarySearch(int[] array, int target) {
        var left = 0;
        var right = array.length - 1;

        while (left <= right) {
            var middle = (right + left) / 2;

            if (array[middle] == target) return middle;

            if (target < array[middle])
                right = middle - 1;
            else
                left = middle + 1;
        }

        return -1;
    }

}
