package algorithms.sortings;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] numbers = {9, 4, 12, 5, 9};
        var bubble = new Bubble();
        bubble.sort(numbers);
        System.out.println("Bubble: " + Arrays.toString(numbers));

        var selection = new Selection();
        selection.sort(numbers);
        System.out.println("Selection: " + Arrays.toString(numbers));

        var insertion = new Insertion();
        insertion.sort(numbers);
        System.out.println("Insertion: " + Arrays.toString(numbers));

        var merge = new Merge();
        merge.sort(numbers);
        System.out.println("Merge: " + Arrays.toString(numbers));

        var quick = new Quick();
        quick.sort(numbers);
        System.out.println("Quick: " + Arrays.toString(numbers));

        var jump = new Jump();
        var result = jump.jumpSearch(numbers, 5);
        System.out.println(result);

    }

}
