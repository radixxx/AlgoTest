package algorithms;

import algorithms.sortings.Bubble;
import algorithms.sortings.Insertion;
import algorithms.sortings.Selection;
import data_structure.arrays.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] numbers = {9, 4, 12, 5, 9};
        var bubble = new Bubble();
        bubble.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        var selection = new Selection();
        selection.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        var insertion = new Insertion();
        insertion.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

}
