import data_structure.arrays.Array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {2, 6, 9, 10, 13};
        System.out.println(Arrays.toString(numbers));


        Array ar_numbers = new Array(3);
        ar_numbers.printElements();


    }

}
