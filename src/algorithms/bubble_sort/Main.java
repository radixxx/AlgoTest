package algorithms.bubble_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] numbers = {9, 4};
        var bubble = new Bubble();
        bubble.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

}
